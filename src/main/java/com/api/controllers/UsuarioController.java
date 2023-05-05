package com.api.controllers;

import com.api.model.Response;
import com.api.model.Usuario;
import com.api.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.POST})
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/auth/{username}")
    public Response getUsuario(@PathVariable String username, @RequestBody Usuario usuario){
        Usuario u=usuarioService.getTheuser(username);
        if(u!=null){
            if(u.getPassword().equals(usuario.getPassword())){
                return new Response(true, "Correcto!");
            }
            return new Response(false, "Error, contraseña incorrecta");
        }
        return new Response(false,"Error, usuario o  contraseña erroneo!");
    }
}
