package com.api.services;

import com.api.model.Response;
import com.api.model.Usuario;
import com.api.repositories.UsuarioRepository;
import org.apache.catalina.User;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Response desencriptarPwd(String username,String passwordEncriptado){
        return usuarioRepository.findByUsername(username).getPassword().equals(passwordEncriptado)?new Response(true, "Correcto"):new Response(false,"Contraseña erronea");
    }

    public Usuario getTheuser(String username){
        return usuarioRepository.findByUsername(username);
    }

    public String generateHash(String plaintextPassword) {
        int saltRounds = 10; // número de veces que se ejecuta el algoritmo de hash
        String hashed = BCrypt.hashpw(plaintextPassword, BCrypt.gensalt(saltRounds)); // genera el hash bcrypt
        return hashed;
    }
}
