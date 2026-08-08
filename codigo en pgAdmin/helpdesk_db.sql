INSERT INTO tickets (titulo, descripcion, categoria, prioridad, estado) 
VALUES 
('Fallo en Impresora', 'No imprime a doble cara', 'Hardware', 'Media', 'Abierto'),
('Caída de Red', 'Sin conexión en el área de finanzas', 'Red', 'Alta', 'En Progreso'),
('Error de Licencia', 'El software contable muestra licencia vencida', 'Software', 'Baja', 'Cerrado');

SELECT * FROM tickets;