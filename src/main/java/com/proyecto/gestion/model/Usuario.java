package com.proyecto.gestion.model;

import com.proyecto.gestion.enums.ROL;

public class Usuario {
    private String username;
    private String email;
    private ROL rol;

    public boolean autenticar() {
        System.out.println("Autenticando al usuario: " + username);
        return true;
    }

    public void cerrarSesion() {
        System.out.println("Sesión cerrada.");
    }

    // Getters y Setters
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public ROL getRol() { return rol; }
    public void setRol(ROL rol) { this.rol = rol; }
}

