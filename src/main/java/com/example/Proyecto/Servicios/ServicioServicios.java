/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Proyecto.Servicios;

import com.example.Proyecto.Entidades.Servicios;
import com.example.Proyecto.Repositorios.RepositorioServicios;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Erick DC
 */
@Service
public class ServicioServicios {
        
        @Autowired
    RepositorioServicios rServicios;
        
    public List<Servicios> obtenerTodosLosServicios() {
        return rServicios.findAll();

    }

    public boolean insertarServicio(Servicios a) {
        boolean respuesta = false;
        try {
            rServicios.save(a); //insert o update a nivel BD
        } catch (Exception ex) {
            respuesta = false;
        }
        return respuesta;
    }

    public boolean actualizarServicio(Servicios a) {
        boolean respuesta = false;
        try {
            rServicios.save(a); //insert o update a nivel BD
        } catch (Exception ex) {
            respuesta = false;
        }
        return respuesta;
    }

    public boolean eliminarServicio(Servicios a) {
        boolean respuesta = false;
        try {
            rServicios.delete(a); //insert o update a nivel BD
        } catch (Exception ex) {
            respuesta = false;
        }
        return respuesta;
    }
        public void eliminarS (Integer id){
        rServicios.deleteById(id);
    }
    
}
