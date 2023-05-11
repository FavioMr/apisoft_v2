package com.api.services;

import com.api.model.Cargo;
import com.api.model.Response;
import com.api.repositories.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CargoService {

    @Autowired
    private CargoRepository cargoRepository;

    public Response createCargo(Cargo cargo){
        try {
            cargoRepository.save(cargo);
            return new Response(true,"Correcto, cargo creado correctamente");
        }catch (Exception e){
            return new Response(false,"Error al guardar cargo");
        }
    }

    public Cargo leerCargos(Integer idcargo){
        return cargoRepository.findByidcargo(idcargo);
    }

    public List<Cargo> getAll(){
        return cargoRepository.findAll();
    }
}
