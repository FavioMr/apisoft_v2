package com.api.controllers;

import com.api.model.Cargo;
import com.api.model.Carrera;
import com.api.model.Response;
import com.api.services.CarreraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("/carrera/")
public class CarreraController {

    @Autowired
    private CarreraService carreraService;

    @PostMapping("/new/")
    public Response sendCarrera(@RequestBody Carrera carrera){
        return carreraService.enviarCarrera(carrera);
    }

    @GetMapping()
    public List<Carrera> getAll(){
        return carreraService.obtenerCarreras();
    }
}
