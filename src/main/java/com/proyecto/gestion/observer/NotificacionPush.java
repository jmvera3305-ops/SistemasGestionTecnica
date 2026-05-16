package com.proyecto.gestion.observer;

public class NotificacionPush implements Observador {
    @Override
    public void actualizar() {
        System.out.println("Enviando notificación Push al dispositivo móvil...");
    }
}
