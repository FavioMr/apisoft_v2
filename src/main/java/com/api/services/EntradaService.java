package com.api.services;

import com.api.model.Entrada;
import com.api.model.Response;
import com.api.repositories.EntradaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntradaService {
    @Autowired
    private EntradaRepository entradaRepository;

    public Response crearEntrada(Entrada entrada){
        try {
            entradaRepository.save(entrada);
            return new Response(true,"Enviado correctamente");
        }catch (Exception e){
            return new Response(false, "Error al registrar entrada");
        }
    }

    public List<Entrada> listarEntradas(){
        return entradaRepository.findAll(Sort.by(Sort.Direction.DESC,"hora"));
    }
}
