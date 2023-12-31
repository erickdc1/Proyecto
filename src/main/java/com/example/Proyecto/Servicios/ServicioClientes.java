/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Proyecto.Servicios;

import com.example.Proyecto.Entidades.Clientes;
import com.example.Proyecto.Repositorios.RepositorioClientes;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Erick DC
 */
@Service
public class ServicioClientes {

    @Autowired
    RepositorioClientes rClientes;

    public List<Clientes> obtenerTodosLosClientes() {
        return rClientes.findAll();

    }

    public boolean insertarCliente(Clientes a) {
        boolean respuesta = false;
        try {
            rClientes.save(a); //insert o update a nivel BD
        } catch (Exception ex) {
            respuesta = false;
        }
        return respuesta;
    }

    public boolean actualizarCliente(Clientes a) {
        boolean respuesta = false;
        try {
            rClientes.save(a); //insert o update a nivel BD
        } catch (Exception ex) {
            respuesta = false;
        }
        return respuesta;
    }

    public boolean eliminarCliente(Clientes a) {
        boolean respuesta = false;
        try {
            rClientes.delete(a); //insert o update a nivel BD
        } catch (Exception ex) {
            respuesta = false;
        }
        return respuesta;
    }
    
    public void eliminar (Integer id){
        rClientes.deleteById(id);
    }

}
