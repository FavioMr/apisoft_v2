package com.api.services;

import com.api.model.Trabajador;
import com.api.repositories.TrabajadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrabajadorService {

    @Autowired
    private TrabajadorRepository trabajadorRepository;

    public Trabajador createTrabajador(Trabajador trabajador){
        return trabajadorRepository.save(trabajador);
    }

    public List<Trabajador> getTrabajadores(){
        return trabajadorRepository.findAll();
    }
}
