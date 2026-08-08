package com.proyecto.gestion.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class SujetoNotificaciones {
    // Relación de agregación: Un sujeto tiene múltiples observadores
    private List<Observador> observadores = new ArrayList<>();

    public void enlazarObservador(Observador o) {
        observadores.add(o);
    }

    public void desenlazarObservador(Observador o) {
        observadores.remove(o);
    }

    public void notificar() {
        for (Observador observador : observadores) {
            observador.actualizar();
        }
    }
}
