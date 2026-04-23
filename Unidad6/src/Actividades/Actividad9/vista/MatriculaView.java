package Actividades.Actividad9.vista;

import java.util.List;
import java.util.Scanner;

import Actividades.Actividad9.modelo.Alumno;
import Actividades.Actividad9.modelo.Asignatura;
import Actividades.Actividad9.modelo.Curso_Escolar;
import Actividades.Actividad9.modelo.Matricula;
import Actividades.Actividad9.modelo.Profesor;

import java.sql.Date;
import java.time.Year;

public class MatriculaView {
    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n--- MENÚ PERSONAS ---");
        System.out.println("1. Listar profesor");
        System.out.println("2. Insertar profesor");
        System.out.println("3. Actualizar profesor");
        System.out.println("4. Eliminar profesor");
        System.out.println("5. Insertar asignatura");
        System.out.println("6. Insertar Alumno");
        System.out.println("7. Insertar curso escolar");
        System.out.println("8. Insertar matricula");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
        return sc.nextInt();
    }

    public void mostrarProfesor(List<Profesor> profesores) {
        System.out.println("\nLISTADO:");
        for (Profesor p : profesores) {
            System.out.println(p.getId() + " - " + p.getNombre() + " - " +
                    p.getApellido1() + " - " + p.getApellido2() + " - " +
                    " - " + p.getEspecialidad() + " - " + " - " + p.getTelefono() 
                );
        }
    }

    public Profesor pedirNuevoProfesor() {
        sc.nextLine();
        System.out.print("Número de matrícula: ");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Apellido 1: ");
        String apellido1 = sc.nextLine();
        System.out.print("Apellido 2: ");
        String apellido2 = sc.nextLine();
        System.out.print("Especialidad: ");
        String especialidad = sc.nextLine();
        System.out.print("Teléfono: ");
        String telefono = sc.nextLine();
        return new Profesor(id, nombre, apellido1, apellido2, especialidad, telefono);
    }

    public Profesor pedirProfesorActualizar() {
        System.out.print("ID a modificar: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nuevo nombre: ");
        String nombre = sc.nextLine();
        return new Profesor(id, nombre);
    }

    public int pedirIdEliminar() {
        System.out.print("ID a eliminar: ");
        return sc.nextInt();
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }

    public Asignatura pedirNuevaAsignatura() {
        System.out.print("Código: ");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Número de horas: ");
        int num_horas = sc.nextInt();
        sc.nextLine();
        System.out.print("Id_profesor: ");
        int id_profesor = sc.nextInt();
        sc.nextLine();
        return new Asignatura(id, nombre,num_horas,id_profesor);
    }

    public Alumno pedirNuevoAlumno() {
        sc.nextLine();
        System.out.print("Id: ");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Apellido 1: ");
        String apellido1 = sc.nextLine();
        System.out.print("Apellido 2: ");
        String apellido2 = sc.nextLine();
        System.out.print("Fecha de nacimiento (aaaa-MM-dd): ");
        Date fecha =  Date.valueOf (sc.nextLine());
        System.out.print("Teléfono: ");
        String telefono = sc.nextLine();
        return new Alumno(id, nombre, apellido1, apellido2, fecha, telefono);
    }

    public Curso_Escolar pedirNuevoCurso() {
        sc.nextLine();
        System.out.print("Id: ");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.print("Año_inicio: ");
        Year año_inicio = Year.of(sc.nextInt()); 
        System.out.print("Año_fin: ");
        Year fecha_fin = Year.of(sc.nextInt());
        return new Curso_Escolar(id, año_inicio, fecha_fin);
    }

    public Matricula pedirNuevaMatricula() {
        sc.nextLine();
        System.out.print("Código de Asignatura: ");
        int id_asignatura=sc.nextInt();
        sc.nextLine();
        System.out.print("Id del curso: ");
        int id_curso=sc.nextInt();
        sc.nextLine();
        System.out.print("Número de matrícula: ");
        int numero_matricula=sc.nextInt();
        sc.nextLine();
        return new Matricula(id_asignatura, id_curso, numero_matricula);
    }
}
