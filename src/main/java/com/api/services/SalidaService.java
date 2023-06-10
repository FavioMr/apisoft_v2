package com.api.services;

import com.api.model.Response;
import com.api.model.Salida;
import com.api.repositories.SalidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalidaService {

    @Autowired
    private SalidaRepository salidaRepository;

    public Response postSalida(Salida salida){
        try {
            salidaRepository.save(salida);
            return new Response(true, "Se generó la salida de manera correcta");
        }catch (Exception e){
            return new Response(false, "Error al crear la salida!");
        }
    }

    public List<Salida> getOneSalida(){
        return salidaRepository.findAll();
    }
}
