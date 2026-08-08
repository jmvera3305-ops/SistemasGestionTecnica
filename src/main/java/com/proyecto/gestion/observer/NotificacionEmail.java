package com.proyecto.gestion.observer;

public class NotificacionEmail implements Observador {
    @Override
    public void actualizar() {
        System.out.println("Enviando notificación por correo electrónico...");
    }
}
