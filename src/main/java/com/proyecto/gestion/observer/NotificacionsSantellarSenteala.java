package com.proyecto.gestion.observer;

public class NotificacionsSantellarSenteala implements Observador {
    @Override
    public void actualizar() {
        System.out.println("Ejecutando servicio de notificación Santellar Senteala...");
    }
}
