package com.mycompany.gestionu;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void asignarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    public void contratarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    public void despedirProfesor(String nombre) {
        profesores.removeIf(p -> p.getNombre().equalsIgnoreCase(nombre));
    }

    public void ofrecerCurso(Curso curso) {
        cursos.add(curso);
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public String getNombre() {
        return nombre;
    }
}
