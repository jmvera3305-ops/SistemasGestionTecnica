package com.proyecto.gestion.model;

public class Administrador extends Usuario {
    
    public void gestionarUsuario(Usuario user) {
        System.out.println("Gestionando cuenta de: " + user.getUsername());
    }

    public void configurarSistema() {
        System.out.println("Configurando parámetros globales del sistema...");
    }
}
