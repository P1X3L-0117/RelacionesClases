package com.mycompany.gestionu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class VentanaPrincipal extends JFrame {
    private Universidad universidad;
    private Profesor profesor;
    private Curso curso;
    private Estudiante estudiante;

    public VentanaPrincipal() {
        setTitle("Gestión Universitaria");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar ventana

        JPanel panel = new JPanel(new GridLayout(5, 1, 10, 10));

        JButton btnCrearUni = new JButton("Crear Universidad");
        JButton btnEliminarUni = new JButton("Eliminar Universidad");
        JButton btnAsignarProfesor = new JButton("Asignar Profesor a Departamento");
        JButton btnInscribirEstudiante = new JButton("Inscribir Estudiante en Curso");
        JButton btnGenerarReporte = new JButton("Generar Reporte del Curso");

        panel.add(btnCrearUni);
        panel.add(btnEliminarUni);
        panel.add(btnAsignarProfesor);
        panel.add(btnInscribirEstudiante);
        panel.add(btnGenerarReporte);

        add(panel);

        // Eventos de botones
        btnCrearUni.addActionListener(e -> {
            universidad = new Universidad("UNAL");
            universidad.agregarDepartamento("Ingeniería");
            JOptionPane.showMessageDialog(this, "Universidad y departamento creados.");
        });

        btnEliminarUni.addActionListener(e -> {
            if (universidad != null) {
                universidad.eliminarUniversidad();
                universidad = null;
                JOptionPane.showMessageDialog(this, "Universidad eliminada.");
            } else {
                JOptionPane.showMessageDialog(this, "No hay universidad creada.");
            }
        });

       btnAsignarProfesor.addActionListener(e -> {
    if (universidad != null) {
        profesor = new Profesor("Archivaldo", "77777"); // Usa el atributo de clase
        universidad.getDepartamentos().get(0).asignarProfesor(profesor);
        JOptionPane.showMessageDialog(this, "Profesor asignado al departamento.");
    } else {
        JOptionPane.showMessageDialog(this, "Primero crea una universidad.");
    }
});

        btnInscribirEstudiante.addActionListener(e -> {
    curso = new Curso("POO101", "Programación Orientada a Objetos");
    if (profesor != null) {
        curso.asignarProfesor(profesor);
    }
    estudiante = new Estudiante("-2222-2-2", "Juanito Alimaña");
    estudiante.inscribirse(curso);
    JOptionPane.showMessageDialog(this, "Estudiante inscrito al curso.");
});

        btnGenerarReporte.addActionListener(e -> {
            if (curso != null) {
                GeneradorReporte reporte = new GeneradorReporte();
                reporte.generar(curso);
            } else {
                JOptionPane.showMessageDialog(this, "Primero inscribe un estudiante en un curso.");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new VentanaPrincipal().setVisible(true);
        });
    }
}
