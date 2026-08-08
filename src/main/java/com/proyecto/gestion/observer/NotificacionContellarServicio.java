package com.proyecto.gestion.observer;

public class NotificacionContellarServicio implements Observador {
    @Override
    public void actualizar() {
        System.out.println("Ejecutando servicio de notificación Contellar...");
    }
}
