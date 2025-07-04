package com.mycompany.gestionu;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String codigo;
    private String nombre;
    private List<Curso> cursosInscritos;

    public Estudiante(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cursosInscritos = new ArrayList<>();
    }

    public void inscribirse(Curso curso) {
        cursosInscritos.add(curso);
        curso.agregarEstudiante(this); // relación bidireccional
    }

    public void agregarCurso(Curso curso) {
        if (!cursosInscritos.contains(curso)) {
            cursosInscritos.add(curso);
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Curso> getCursosInscritos() {
        return cursosInscritos;
    }
}
