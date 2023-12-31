/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Proyecto.Controlador;

import com.example.Proyecto.Entidades.Login;
import com.example.Proyecto.Repositorios.RepositorioLogin;
import com.example.Proyecto.Servicios.ServicioLogin;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Erick DC
 */
@RestController
@RequestMapping("/login")
public class CLogin {
                
    @Autowired
    ServicioLogin sLogin;
    
    @Autowired
    RepositorioLogin rLogin;
     
    @GetMapping("")
    public List<Login> getTodosLosLogin(){
        
        return sLogin.obtenerTodosLosLogin();
        
    }
    
    @PostMapping("")
    public List<Login>postInsertarLogin(@RequestBody Login a){
        if (sLogin.insertarLogin(a)) {
            return sLogin.obtenerTodosLosLogin();
        } else {
            return null;
        }
    }

    @PutMapping("")
    public List<Login> actualizarLogin(@RequestBody Login a) {
        if (sLogin.actualizarLogin(a)) {
            return sLogin.obtenerTodosLosLogin();
        } else {
            return null;
        }
    }

    @DeleteMapping("/login/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        sLogin.eliminarL(id);
    }
    
}
