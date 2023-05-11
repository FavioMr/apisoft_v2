package com.api.controllers;

import com.api.model.Almacen;
import com.api.model.Response;
import com.api.services.AlmacenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("/almacen/")
public class AlmacenController {

    @Autowired
    private AlmacenService almacenService;

    @PostMapping("/new/")
    public Response sendAlmacen(@RequestBody Almacen almacen){
        return almacenService.createAlmacen(almacen);
    }

    @GetMapping("/{id}")
    public Almacen getAlmacen(@PathVariable Integer id){
        return almacenService.getOneAlmacen(id);
    }

    @GetMapping()
    public List<Almacen> getAllAlmacen(){
        return almacenService.getAll();
    }

}
