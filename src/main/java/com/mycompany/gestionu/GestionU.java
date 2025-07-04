package com.mycompany.gestionu;

import javax.swing.SwingUtilities;

public class GestionU {

    public static void main(String[] args) {

        // 1️⃣  Arrancar la GUI (lo primero para que aparezca enseguida)
        SwingUtilities.invokeLater(() -> {
            new VentanaPrincipal().setVisible(true);
        });

        // 2️⃣  (Opcional) pruebas de lógica en consola
        System.out.println("✅ Sistema de Gestión Universitaria iniciado correctamente.");

        Universidad u = new Universidad("UNAL");
        u.agregarDepartamento("Ingeniería");

        Profesor p = new Profesor("Laura", "Sistemas");
        Curso c = new Curso("INF123", "POO");
        c.asignarProfesor(p);

        Estudiante e = new Estudiante("20251234", "Carlos");
        c.inscribirEstudiante(e);

        GeneradorReporte gr = new GeneradorReporte();
        c.generarReporte(gr);
    }
}
