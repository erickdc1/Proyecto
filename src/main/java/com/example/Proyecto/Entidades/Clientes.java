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
@Table(name ="cliente")
public class Clientes {

    @Id
    private int idCliente;
    @Column(length = 50)
    private String nomCliete;
    private String tipoCliente;
    private String direccion;
    private String telefono;

    public Clientes() {
    }

    public Clientes(int idCliente, String nomCliete, String tipoCliente, String direccion, String telefono) {
        this.idCliente = idCliente;
        this.nomCliete = nomCliete;
        this.tipoCliente = tipoCliente;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomCliete() {
        return nomCliete;
    }

    public void setNomCliete(String nomCliete) {
        this.nomCliete = nomCliete;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
