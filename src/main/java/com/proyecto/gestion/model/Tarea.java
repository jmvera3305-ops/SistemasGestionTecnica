package com.proyecto.gestion.model;

import com.proyecto.gestion.enums.EstadoTarea;
import com.proyecto.gestion.observer.SujetoNotificaciones;

// Tarea hereda de SujetoNotificaciones para poder disparar los eventos a los observadores
public class Tarea extends SujetoNotificaciones {
    private int id;
    private String titulo;
    private String descripcion;
    private EstadoTarea estado;
    private double horasEstimadas;
    private Tecnico tecnicoAsignado;

    public void cambiarEstado(EstadoTarea nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println("Estado de tarea cambiado a: " + nuevoEstado);
        
        // Al cambiar el estado, se dispara automáticamente el patrón Observer
        super.notificar(); 
    }

    public boolean esUrgente() {
        // Tu lógica para definir urgencia
        return false;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public EstadoTarea getEstado() { return estado; }
    public void setEstado(EstadoTarea estado) { this.estado = estado; }
    public double getHorasEstimadas() { return horasEstimadas; }
    public void setHorasEstimadas(double horasEstimadas) { this.horasEstimadas = horasEstimadas; }
    public Tecnico getTecnicoAsignado() { return tecnicoAsignado; }
    public void setTecnicoAsignado(Tecnico tecnicoAsignado) { this.tecnicoAsignado = tecnicoAsignado; }
}
