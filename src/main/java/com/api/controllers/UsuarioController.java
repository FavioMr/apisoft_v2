package com.api.controllers;

import com.api.model.Response;
import com.api.model.Usuario;
import com.api.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.DELETE})
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

    @PostMapping("/create/")
    public Response createUsuario(@RequestBody Usuario user){
        return usuarioService.crearUsuario(user);
    }

    @GetMapping("/usuarios/all/")
    public List<Usuario> getAllUsers(){
        return usuarioService.getAllUsers();
    }

    @PostMapping("/update/{username}")
    public Response updateUsuario(@RequestBody Usuario user, @PathVariable String username ){
        Usuario u=usuarioService.getTheuser(username);
        if(u!=null){
            u.setModi(user.isModi());
            u.setElim(user.isElim());
            u.setRepo(user.isRepo());
            u.setVer(user.isVer());
            u.setGurs(user.isGurs());
            return usuarioService.crearUsuario(u);
        }
        return new Response(false,"Error, usuario no existe!");
    }
    
    @DeleteMapping("/delete/{id}")
    public Response deleteusuario(@PathVariable Integer id) {
    	return usuarioService.deleteOne(id);
    }
}
