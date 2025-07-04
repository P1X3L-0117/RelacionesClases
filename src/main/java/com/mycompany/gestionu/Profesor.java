package com.mycompany.gestionu;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String nombre;
    private String especialidad;
    private List<Curso> cursosImpartidos;

    public Profesor(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursosImpartidos = new ArrayList<>();
    }

    public void asignarCurso(Curso curso) {
        cursosImpartidos.add(curso);
    }

    public void quitarCurso(String codigoCurso) {
        cursosImpartidos.removeIf(c -> c.getCodigo().equalsIgnoreCase(codigoCurso));
    }

    public String getNombre() {
        return nombre;
    }

    public List<Curso> getCursosImpartidos() {
        return cursosImpartidos;
    }
}
