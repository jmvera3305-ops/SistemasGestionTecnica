package com.proyecto.gestion.model;

public class Tecnico extends Usuario {
    private String specialty; // 'especialidad' en tu diagrama
    private String estadoDisponibilidad;

    public void registrarHoras(Tarea tarea, double horas) {
        System.out.println("Registrando " + horas + " horas en la tarea: " + tarea.getTitulo());
    }

    public void reportarAvance(Tarea tarea, String detalle) {
        System.out.println("Avance reportado para '" + tarea.getTitulo() + "': " + detalle);
    }

    // Getters y Setters
    public String getSpecialty() { return specialty; }
    public void setSpecialty(String specialty) { this.specialty = specialty; }
    public String getEstadoDisponibilidad() { return estadoDisponibilidad; }
    public void setEstadoDisponibilidad(String estadoDisponibilidad) { this.estadoDisponibilidad = estadoDisponibilidad; }
}