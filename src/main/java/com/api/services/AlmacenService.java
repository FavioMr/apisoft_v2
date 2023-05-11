package com.api.services;

import com.api.model.Almacen;
import com.api.model.Response;
import com.api.repositories.AlmacenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlmacenService {

    @Autowired
    private AlmacenRepository almacenRepository;

    public Almacen getOneAlmacen(Integer id) {
        return almacenRepository.findByid(id);
    }

    public Response createAlmacen(Almacen almacen) {
        try {
            almacenRepository.save(almacen);
            return new Response(true, "Correcto, alamcen creado correctamente");
        } catch (Exception e) {
            return new Response(false, "Error al guardar un almacén");
        }
    }

    public List<Almacen> getAll(){
        return almacenRepository.findAll();
    }
}
