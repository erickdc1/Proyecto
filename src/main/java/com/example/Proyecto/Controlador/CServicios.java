/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Proyecto.Controlador;

import com.example.Proyecto.Entidades.Servicios;
import com.example.Proyecto.Repositorios.RepositorioServicios;
import com.example.Proyecto.Servicios.ServicioServicios;
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
@RequestMapping("/servicios")
public class CServicios {

    @Autowired
    ServicioServicios sServicio;

    @Autowired
    RepositorioServicios rServicio;

    @GetMapping("")
    public List<Servicios> getTodosLosServicios() {

        return sServicio.obtenerTodosLosServicios();

    }

    @PostMapping("")
    public List<Servicios> postInsertarServicio(@RequestBody Servicios a) {
        if (sServicio.insertarServicio(a)) {
            return sServicio.obtenerTodosLosServicios();
        } else {
            return null;
        }
    }

    @PutMapping("")
    public List<Servicios> actualizarServicio(@RequestBody Servicios a) {
        if (sServicio.actualizarServicio(a)) {
            return sServicio.obtenerTodosLosServicios();
        } else {
            return null;
        }
    }

    @DeleteMapping("/servicios/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        sServicio.eliminarS(id);
    }

}
