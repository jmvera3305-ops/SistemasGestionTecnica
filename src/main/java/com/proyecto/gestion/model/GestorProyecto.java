package com.proyecto.gestion.model;

public class GestorProyecto extends Usuario {
    private String departamento;

    public Proyecto crearProyecto(String nombre) {
        System.out.println("Creando proyecto: " + nombre);
        Proyecto nuevoProyecto = new Proyecto();
        nuevoProyecto.setNombre(nombre);
        return nuevoProyecto;
    }

    public void asignarTarea(Tarea tarea, Tecnico tecnico) {
        tarea.setTecnicoAsignado(tecnico);
        System.out.println("Tarea '" + tarea.getTitulo() + "' asignada a " + tecnico.getUsername());
    }

    // Getters y Setters
    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }
}