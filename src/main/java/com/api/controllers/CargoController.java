package com.api.controllers;

import com.api.model.Cargo;
import com.api.model.Response;
import com.api.services.CargoService;
import com.api.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("/cargo/")
public class CargoController {

    @Autowired
    private CargoService cargoService;

    @PostMapping("/new/")
    public Response crearCargo(@RequestBody Cargo cargo) {
        return cargoService.createCargo(cargo);
    }

    @GetMapping("/{idcargo}")
    public Cargo obtener(@PathVariable Integer idcargo){
        return cargoService.leerCargos(idcargo);
    }

    @GetMapping()
    public List<Cargo> obtenerTodo(){
        return cargoService.getAll();
    }
}
