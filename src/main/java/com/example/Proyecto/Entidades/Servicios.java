/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Proyecto.Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author Erick DC
 */
@Entity
@Table(name ="servicios")
public class Servicios {
        @Id
   private int idServicio;
    @Column (length = 50)
    private String nombreCliente;
    private String nombreRepartidor;
    private String direccion;
    private int tarifa;

    public Servicios() {
    }

    public Servicios(int idServicio, String nombreCliente, String nombreRepartidor, String direccion, int tarifa) {
        this.idServicio = idServicio;
        this.nombreCliente = nombreCliente;
        this.nombreRepartidor = nombreRepartidor;
        this.direccion = direccion;
        this.tarifa = tarifa;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNombreRepartidor() {
        return nombreRepartidor;
    }

    public void setNombreRepartidor(String nombreRepartidor) {
        this.nombreRepartidor = nombreRepartidor;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTarifa() {
        return tarifa;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }
    

}
