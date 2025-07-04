package com.mycompany.gestionu;

import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Departamento> departamentos;
    
    
    public void eliminarUniversidad() {
    departamentos.clear(); // o lo que haga sentido para tu modelo
    System.out.println("Universidad eliminada.");
}

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.departamentos = new ArrayList<>();
    }

    public void agregarDepartamento(String nombreDepto) {
        Departamento depto = new Departamento(nombreDepto);
        departamentos.add(depto);
    }

    public void eliminarDepartamento(String nombreDepto) {
        departamentos.removeIf(d -> d.getNombre().equalsIgnoreCase(nombreDepto));
    }

    public List<Profesor> obtenerTodosProfesores() {
        List<Profesor> profesores = new ArrayList<>();
        for (Departamento d : departamentos) {
            profesores.addAll(d.getProfesores());
        }
        return profesores;
    }

    public void mostrarEstructura() {
        System.out.println("Universidad: " + nombre);
        for (Departamento d : departamentos) {
            System.out.println(" - Departamento: " + d.getNombre());
        }
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }
}
