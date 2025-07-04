package com.mycompany.gestionu;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor; // Asociación
    private List<Estudiante> estudiantes;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    public void asignarProfesor(Profesor profesor) {
        this.profesor = profesor;
        profesor.asignarCurso(this); // Asociación bidireccional
    }

    public void inscribirEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
        estudiante.agregarCurso(this); // Asociación bidireccional
    }

    public void agregarEstudiante(Estudiante estudiante) {
        if (!estudiantes.contains(estudiante)) {
            estudiantes.add(estudiante);
        }
    }

    public void desinscribirEstudiante(String codigoEstudiante) {
        estudiantes.removeIf(e -> e.getCodigo().equalsIgnoreCase(codigoEstudiante));
    }

    public void generarReporte(GeneradorReporte generador) {
        generador.generar(this);
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public Profesor getProfesor() {
        return profesor;
    }
}
