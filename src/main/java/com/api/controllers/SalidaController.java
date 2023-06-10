package com.api.controllers;

import com.api.model.Response;
import com.api.model.Salida;
import com.api.services.SalidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salida/")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class SalidaController {

    @Autowired
    private SalidaService salidaService;

    @PostMapping("/new/")
    public Response addSalida(@RequestBody Salida salida){
        return salidaService.postSalida(salida);
    }

    @GetMapping("")
    public List<Salida> getAllSalidas(){
        return salidaService.getOneSalida();
    }

}
