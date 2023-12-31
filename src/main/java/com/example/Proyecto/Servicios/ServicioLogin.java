/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Proyecto.Servicios;

import com.example.Proyecto.Entidades.Login;
import com.example.Proyecto.Repositorios.RepositorioLogin;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

/**
 *
 * @author Erick DC
 */
@Service
public class ServicioLogin {
    
        @Autowired
    RepositorioLogin rLogin;
        
    public List<Login> obtenerTodosLosLogin() {
        return rLogin.findAll();

    }

    public boolean insertarLogin(Login a) {
        boolean respuesta = false;
        try {
            rLogin.save(a); //insert o update a nivel BD
        } catch (Exception ex) {
            respuesta = false;
        }
        return respuesta;
    }

    public boolean actualizarLogin(Login a) {
        boolean respuesta = false;
        try {
            rLogin.save(a); //insert o update a nivel BD
        } catch (Exception ex) {
            respuesta = false;
        }
        return respuesta;
    }

    public boolean eliminarLogin(Login a) {
        boolean respuesta = false;
        try {
            rLogin.delete(a); //insert o update a nivel BD
        } catch (Exception ex) {
            respuesta = false;
        }
        return respuesta;
    }
        public void eliminarL (Integer id){
        rLogin.deleteById(id);
    }
    
        
/*public String generarToken(Login usuario) {
    String token = Jwts.builder()
            .setSubject(usuario.getUsername())
            .setIssuedAt(new Date())
            .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
            .signWith(SignatureAlgorithm.HS512, SECRET_KEY)
            .compact();

    return token;
}*/
}
