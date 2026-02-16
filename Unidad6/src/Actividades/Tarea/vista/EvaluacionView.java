package Actividades.Tarea.vista;

import java.util.List;
import java.util.Scanner;

import Actividades.Tarea.modelo.Alumno;
import Actividades.Tarea.modelo.Practica;
import Actividades.Tarea.modelo.Profesor;

public class EvaluacionView {
    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n--- MENÚ PERSONAS ---");
        System.out.println("1. Listar profesor");
        System.out.println("2. Insertar profesor");
        System.out.println("3. Actualizar profesor");
        System.out.println("4. Eliminar profesor");
        System.out.println("5. Insertar Practica");
        System.out.println("6. Insertar Alumno");
        System.out.println("7. Insertar Examen");
        System.out.println("8. Insertar Realiza Practica");
        System.out.println("9. Insertar Hace Examen");
        System.out.println("10. Insertar Diseña Practica");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
        return sc.nextInt();
    }

    public void mostrarProfesor(List<Profesor> profesores) {
        System.out.println("\nLISTADO:");
        for (Profesor p : profesores) {
            System.out.println(p.getId() + " - " + p.getNif() + " - " + p.getNombre() + " - " +
                    p.getApellido1() + " - " + p.getApellido2()
                );
        }
    }

    public Profesor pedirNuevoProfesor() {
        sc.nextLine();
        System.out.print("ID: : ");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.print("NIF: ");
        String nif=sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Apellido 1: ");
        String apellido1 = sc.nextLine();
        System.out.print("Apellido 2: ");
        String apellido2 = sc.nextLine();
        return new Profesor(id, nif ,nombre, apellido1, apellido2);
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

    public Practica pedirNuevaPractica() {
        System.out.print("Id: ");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.print("Título: ");
        String titulo = sc.nextLine();
        System.out.print("Dificultad: ");
        String dificultad = sc.nextLine();
        return new Practica(id, titulo, dificultad);
    }

    public Alumno pedirNuevoAlumno() {
        sc.nextLine();
        System.out.print("Id: ");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.print("NIF: ");
        String nif = sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Apellido 1: ");
        String apellido1 = sc.nextLine();
        System.out.print("Apellido 2: ");
        String apellido2 = sc.nextLine();
        System.out.print("Grupo: ");
        String grupo = sc.nextLine();

        return new Alumno(id, nif, nombre, apellido1, apellido2, grupo);
    }
}
