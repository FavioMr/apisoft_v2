package com.api.controllers;

import com.api.model.Entrada;
import com.api.model.Response;
import com.api.services.EntradaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entrada/")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class EntradaController {

    @Autowired
    private EntradaService entradaService;

    @PostMapping("/new/")
    public Response sendEntrada(@RequestBody Entrada entrada){
        return entradaService.crearEntrada(entrada);
    }

    @GetMapping()
    public List<Entrada> getEntradas(){
        return entradaService.listarEntradas();
    }
}
