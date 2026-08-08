package com.proyecto.gestion.model;

import java.util.Date;

public class Proyecto {
    private int id;
    private String nombre;
    private Date fechaInicio;
    private Date fechaFinEstimada;

    public void agregarTarea(Tarea tarea) {
        System.out.println("Añadiendo tarea '" + tarea.getTitulo() + "' al proyecto " + this.nombre);
    }

    public double obtenerProgreso() {
        // Lógica matemática para calcular porcentaje
        return 0.0;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public Date getFechaInicio() { return fechaInicio; }
    public void setFechaInicio(Date fechaInicio) { this.fechaInicio = fechaInicio; }
    public Date getFechaFinEstimada() { return fechaFinEstimada; }
    public void setFechaFinEstimada(Date fechaFinEstimada) { this.fechaFinEstimada = fechaFinEstimada; }
}

