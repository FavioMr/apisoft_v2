package com.api.services;

import com.api.model.Producto;
import com.api.model.Response;
import com.api.model.Trabajador;
import com.api.repositories.TrabajadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrabajadorService {

    @Autowired
    private TrabajadorRepository trabajadorRepository;

    public Trabajador createTrabajador(Trabajador trabajador) {
        return trabajadorRepository.save(trabajador);
    }

    public List<Trabajador> getTrabajadores() {
        return trabajadorRepository.findAll();
    }

    public Trabajador editarTrabajador(Trabajador trabajador) {
        return trabajadorRepository.save(trabajador);
    }

    public Trabajador getOneTrabajador(String id) {
        return trabajadorRepository.getOne(id);
    }

    public Response deleteTrabajador(String id) {
        Trabajador t = getOneTrabajador(id);
        Response response = t != null ? new Response(true, "Eliminado, " + t.toString()) : new Response(false, "Error, trabajador no encontrado");
        if (response.isStatus()) {
            assert t != null;
            trabajadorRepository.delete(t);
            return response;
        }
        return response;
    }
}
