package com.mycompany.gestionu;
import javax.swing.JOptionPane;

public class GeneradorReporte {
    public void generar(Curso curso) {
        StringBuilder sb = new StringBuilder();
        sb.append("Curso: ").append(curso.getNombre()).append("\n")
          .append("Código: ").append(curso.getCodigo()).append("\n")
          .append("Profesor: ")
          .append(curso.getProfesor() != null ? curso.getProfesor().getNombre() : "Sin asignar")
          .append("\nEstudiantes:\n");

        for (Estudiante e : curso.getEstudiantes()) {
            sb.append(" • ").append(e.getNombre()).append(" (").append(e.getCodigo()).append(")\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString(), "Reporte", JOptionPane.INFORMATION_MESSAGE);
    }
}

