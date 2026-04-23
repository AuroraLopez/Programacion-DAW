package Actividades.Actividad8.vista;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import Actividades.Actividad8.modelo.Alumno;

public class AlumnoView {
    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n--- MENÚ PERSONAS ---");
        System.out.println("1. Insertar Alumno");
        System.out.println("2. Listar Alumnos");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
        return sc.nextInt();
    }

    public void mostrarAlumnos(List<Alumno> alumnos) {
        System.out.println("\nLISTADO:");
        for (Alumno a : alumnos) {
            System.out.println(a.getNum_matricula() + " - " + a.getNombre() + " - " +
                    a.getApellido1() + " - " + a.getApellido2() + " - " +
                    " - " + a.getFecha_nacimiento() + " - " + " - " + a.getTelefono() 
                );
        }
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
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
}
