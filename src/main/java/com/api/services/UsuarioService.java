package com.api.services;

import com.api.model.Response;
import com.api.model.Usuario;
import com.api.repositories.UsuarioRepository;
import org.apache.catalina.User;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Response desencriptarPwd(String username, String passwordEncriptado) {
        return usuarioRepository.findByUsername(username).getPassword().equals(passwordEncriptado) ? new Response(true, "Correcto") : new Response(false, "Contraseña erronea");
    }

    public Usuario getTheuser(String username) {
        return usuarioRepository.findByUsername(username);
    }


    public Response crearUsuario(Usuario user) {
        try {
            usuarioRepository.save(user);
            return new Response(true, user.toString());
        } catch (Exception e) {
            return new Response(false, e.getMessage());
        }
    }
    public List<Usuario> getAllUsers(){
        return usuarioRepository.findAll();
    }
    
    public Response deleteOne(Integer id) {
    	try {
    		Usuario u= usuarioRepository.findByid(id);
			usuarioRepository.delete(u);
			return new Response(true, "Correcto, eliminado");
		} catch (Exception e) {
			return new Response(false,"Error al eliminar");
		}
    }
}
