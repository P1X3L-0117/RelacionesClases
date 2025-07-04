Sistema de Gestión Universitaria

Este proyecto en Java simula un sistema de gestión para una universidad, demostrando relaciones fundamentales entre clases como composición, agregación, asociación bidireccional y dependencia. Incluye además una interfaz gráfica desarrollada con Swing para interactuar con las funcionalidades principales.
Estructura del Proyecto

    Universidad: Contiene departamentos (composición).

    Departamento: Puede tener varios profesores y cursos.

    Profesor: Se puede asignar a un departamento (agregación).

    Curso: Tiene un profesor asignado y permite la inscripción de estudiantes.

    Estudiante: Puede inscribirse en varios cursos (asociación bidireccional).

    GeneradorReporte: Clase auxiliar que permite generar reportes de cursos (dependencia).


Mapa de relaciones entre clases
  


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
