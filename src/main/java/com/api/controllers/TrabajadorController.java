package com.api.controllers;

import com.api.model.Response;
import com.api.model.Trabajador;
import com.api.services.TrabajadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
@RequestMapping("/trabajador/")
public class TrabajadorController {

    @Autowired
    private TrabajadorService trabajadorService;

    @PostMapping()
    public Response addNewTrabajador(@RequestBody Trabajador trabajador) {
        try {
            trabajadorService.createTrabajador(trabajador);
            return new Response(true, "Correcto: Se agregó - " + trabajador.toString());
        } catch (Exception e) {
            return new Response(false, "Error al agregar: " + trabajador.toString());
        }
    }

    @PostMapping("/editar/{id}")
    public Response editarTrabajador(@PathVariable String id, @RequestBody Trabajador trabajador) {
        Trabajador t = trabajadorService.getOneTrabajador(id);
        t.setId(id);
        t.setNombre(trabajador.getNombre());
        t.setApellidopa(trabajador.getApellidopa());
        t.setApellidoma(trabajador.getApellidoma());
        t.setIdcargo(trabajador.getIdcargo());
        return trabajadorService.editarTrabajador(t);
    }

    @GetMapping()
    public List<Trabajador> getAllTrabajador() {
        return trabajadorService.getTrabajadores();
    }

    @DeleteMapping("/remove/{id}")
    public Response deleteTrabajador(@PathVariable String id) {
        return trabajadorService.deleteTrabajador(id);
    }
}
