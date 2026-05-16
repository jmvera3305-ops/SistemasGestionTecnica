package com.proyecto.gestion;

import com.proyecto.gestion.config.ContenidoBD;
import com.proyecto.gestion.enums.EstadoTarea;
import com.proyecto.gestion.enums.ROL;
import com.proyecto.gestion.model.*;
import com.proyecto.gestion.observer.*;

public class SistemasGestionTecnica {
    public static void main(String[] args) {
        System.out.println("******INICIANDO SISTEMA DE GESTIÓN TÉCNICA PROFESIONAL ******\n");

        // 1. Probar el patrón SINGLETON (Base de datos)
        System.out.println("***********************************\n");
        System.out.println(" 1. Probando Conexión BD *****");
        ContenidoBD bd = ContenidoBD.getInstance();
        bd.ejecutarQuery("SELECT * FROM Usuario");
        System.out.println();
        System.out.println("***********************************\n");

        // 2. Crear Usuarios (Roles, Gestor y Técnico)
        System.out.println("***********************************\n");
        System.out.println(" 2. Creando Usuarios *****");
        GestorProyecto gestor = new GestorProyecto();
        gestor.setUsername("CarlosGestor");
        gestor.setEmail("carlos@empresa.com");
        gestor.setRol(ROL.GESTOR);
        
        
        Tecnico tecnico = new Tecnico();
        tecnico.setUsername("JuanTecnico");
        tecnico.setSpecialty("Redes y Telecomunicaciones");
        tecnico.setRol(ROL.TECNICO);
        
        System.out.println("Gestor creado: " + gestor.getUsername());
        System.out.println("Técnico creado: " + tecnico.getUsername());
        System.out.println();
        System.out.println("***********************************\n");
        
        // 3. Crear Proyecto y Tarea
        System.out.println("***********************************\n");
        System.out.println(" 3. Creando Proyecto y Tarea *****");
        Proyecto proyecto = gestor.crearProyecto("Implementación de Servidores 2026");
        
        Tarea tarea = new Tarea();
        tarea.setId(101);
        tarea.setTitulo("Configuración de Switch Principal");
        tarea.setEstado(EstadoTarea.PENDIENTE);
        
        proyecto.agregarTarea(tarea);
        gestor.asignarTarea(tarea, tecnico); 
        System.out.println();
        System.out.println("***********************************\n");

        // 4. Probar el patrón OBSERVER (Notificaciones automáticas)
        System.out.println("***********************************\n");
        System.out.println(" 4. Configurando y Probando Patrón Observer *****");
        Observador correo = new NotificacionEmail();
        Observador push = new NotificacionPush();
        Observador servicioSantellar = new NotificacionsSantellarSenteala();

        tarea.enlazarObservador(correo);
        tarea.enlazarObservador(push);
        tarea.enlazarObservador(servicioSantellar);

        System.out.println("El técnico cambia el estado de la tarea...");
        tarea.cambiarEstado(EstadoTarea.EN_PROCESO);
        System.out.println();
        System.out.println("***********************************\n");
        
        
        System.out.println("****** PRUEBA DE ARQUITECTURA COMPLETADA CON ÉXITO ******");
    }
}