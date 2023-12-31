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
@Table(name ="login")
public class Login  {

    @Id
    private int idLogin;
    @Column(length = 50)
    private String usuario;
    private String contrasena;

    public Login() {
    }

    public Login(int idLogin, String usuario, String contrasena) {
        this.idLogin = idLogin;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public int getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(int idLogin) {
        this.idLogin = idLogin;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

}
