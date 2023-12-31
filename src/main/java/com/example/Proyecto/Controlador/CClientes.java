/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Proyecto.Controlador;

import com.example.Proyecto.Entidades.Clientes;
import com.example.Proyecto.Repositorios.RepositorioClientes;
import com.example.Proyecto.Servicios.ServicioClientes;
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
@RequestMapping("/clientes")
public class CClientes {
        
    @Autowired
    ServicioClientes sClientes;
    
    @Autowired
    RepositorioClientes rClientes;
     
    @GetMapping("")
    public List<Clientes> getTodosLosClientes(){
        
        return sClientes.obtenerTodosLosClientes();
        
    }
    
    @PostMapping("")
    public List<Clientes>postInsertarCliente(@RequestBody Clientes a){
        if (sClientes.insertarCliente(a)) {
            return sClientes.obtenerTodosLosClientes();
        } else {
            return null;
        }
    }

    @PutMapping("")
    public List<Clientes> actualizarCliente(@RequestBody Clientes a) {
        if (sClientes.actualizarCliente(a)) {
            return sClientes.obtenerTodosLosClientes();
        } else {
            return null;
        }
    }
    @DeleteMapping("/clientes/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        sClientes.eliminar(id);
    }
    
}