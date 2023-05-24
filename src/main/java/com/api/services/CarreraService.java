package com.api.services;

import com.api.model.Carrera;
import com.api.model.Response;
import com.api.repositories.CarreraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarreraService {

    @Autowired
    private CarreraRepository carreraRepository;

    public Response enviarCarrera(Carrera carrera){
        try{
            carreraRepository.save(carrera);
            return new Response(true, "Correcto!");
        }catch(Exception e){
            return new Response(false,"Error al cargar la carrera");
        }
    }

    public List<Carrera> obtenerCarreras(){
        return carreraRepository.findAll();
    }
}
