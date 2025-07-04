# RelacionesClases
Ejercicio de gestion de universidad empleando diferentes tipos de relaciones entre clases


Sistema de Gestión Universitaria

Este proyecto en Java simula un sistema de gestión para una universidad, demostrando relaciones fundamentales entre clases como composición, agregación, asociación bidireccional y dependencia. Incluye además una interfaz gráfica desarrollada con Swing para interactuar con las funcionalidades principales.
Estructura del Proyecto

    Universidad: Contiene departamentos (composición).

    Departamento: Puede tener varios profesores y cursos.

    Profesor: Se puede asignar a un departamento (agregación).

    Curso: Tiene un profesor asignado y permite la inscripción de estudiantes.

    Estudiante: Puede inscribirse en varios cursos (asociación bidireccional).

    GeneradorReporte: Clase auxiliar que permite generar reportes de cursos (dependencia).

MAPA DE RELACION DE CLASES

![Untitled(1)](https://github.com/user-attachments/assets/4de4eff5-6a74-42aa-a94a-492280266e68)
 Relaciones entre Clases en el Proyecto GestionU

El sistema de gestión universitaria ha sido diseñado utilizando los principales tipos de relaciones en la programación orientada a objetos: composición, agregación, asociación bidireccional y dependencia. A continuación se explican cada una de estas relaciones implementadas en el proyecto:
Composición: Universidad → Departamento

    Descripción: La clase Universidad contiene a uno o varios Departamento.

    Naturaleza: Es una relación de vida compartida. Si se elimina la universidad, también desaparecen todos sus departamentos.

    Implementación:

    private List<Departamento> departamentos;

    El método eliminarUniversidad() borra también los departamentos asociados.

Agregación: Departamento → Profesor

    Descripción: Un Departamento puede asignar profesores, pero estos no dependen del departamento para existir.

    Naturaleza: Es una relación de uso sin pertenencia total.

    Ejemplo en código:

    departamento.asignarProfesor(profesor);

    El Profesor se crea por separado y luego es agregado al departamento.

Asociación Bidireccional: Curso ↔ Estudiante

    Descripción: Un Curso conoce a sus Estudiantes y viceversa.

    Naturaleza: Es una relación de referencia mutua, útil para mantener la sincronización entre ambos lados.

    Implementación:

    curso.inscribirEstudiante(estudiante);     // curso → estudiante
    estudiante.agregarCurso(curso);            // estudiante → curso

Dependencia: Curso → GeneradorReporte

    Descripción: La clase Curso depende de GeneradorReporte para producir reportes.

    Naturaleza: Es una relación temporal y débil. El Curso utiliza la funcionalidad del GeneradorReporte, pero no lo almacena ni controla su ciclo de vida.

    Ejemplo:

GeneradorReporte r = new GeneradorReporte();
curso.generarReporte(r);


Casos de Uso
1. Gestión de Universidad

    Crear universidad y departamentos.

    Eliminar universidad (elimina sus departamentos automáticamente).

2. Gestión de Profesores

    Asignar profesores a departamentos.

    Los profesores pueden existir independientemente del departamento.

3. Inscripción de Estudiantes

    Inscribir estudiantes en cursos.

    Asociación bidireccional entre estudiantes y cursos.

4. Generación de Reportes

    Generar reporte de un curso mediante la clase GeneradorReporte.

    Ejemplo de dependencia.

Interfaz Gráfica

El sistema incluye una GUI construida con Swing que permite:

    Crear y eliminar universidades.

    Asignar profesores a departamentos.

    Inscribir estudiantes en cursos.

    Generar reportes de cursos.

Requisitos

    Java JDK 17 o superior (probado con JDK 24).

    Apache Maven.

    IDE compatible con Swing y Maven (NetBeans, IntelliJ, Eclipse).

Estructura de Paquetes

src/
└── main/
    └── java/
        └── com/
            └── mycompany/
                └── gestionu/
                    ├── Universidad.java
                    ├── Departamento.java
                    ├── Profesor.java
                    ├── Curso.java
                    ├── Estudiante.java
                    ├── GeneradorReporte.java
                    ├── VentanaPrincipal.java
                    └── GestionU.java

Ejecución

Puedes ejecutar la aplicación desde la clase GestionU (modo consola) o desde VentanaPrincipal (interfaz gráfica).

mvn compile
mvn exec:java -Dexec.mainClass="com.mycompany.gestionu.VentanaPrincipal"

Notas

    El código está diseñado para uso académico con fines ilustrativos.

    La GUI es básica y está centrada en los casos de uso principales.
