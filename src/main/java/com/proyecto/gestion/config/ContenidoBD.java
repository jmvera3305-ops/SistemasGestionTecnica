package com.proyecto.gestion.config;

public class ContenidoBD {
    // Instancia única (Singleton)
    private static ContenidoBD _instance;

    // Constructor privado para evitar instanciación externa
    private ContenidoBD() {
    }

    // Método global de acceso a la instancia
    public static ContenidoBD getInstance() {
        if (_instance == null) {
            _instance = new ContenidoBD();
        }
        return _instance;
    }

    // Simulación del método para ejecutar consultas SQL
    public Object ejecutarQuery(String sql) {
        System.out.println("Ejecutando SQL: " + sql);
        // Aquí retornas un ResultSet o la estructura que manejes
        return null; 
    }
}
