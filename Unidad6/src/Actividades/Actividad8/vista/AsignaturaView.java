package Actividades.Actividad8.vista;

import java.util.List;
import java.util.Scanner;

import Actividades.Actividad8.modelo.Asignatura;

public class AsignaturaView {
    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n--- MENÚ PERSONAS ---");
        System.out.println("1. Insertar Asignatura");
        System.out.println("2. Listar Asignaturas");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
        return sc.nextInt();
    }

    public void mostrarAlumnos(List<Asignatura> asignaturas) {
        System.out.println("\nLISTADO:");
        for (Asignatura a : asignaturas) {
            System.out.println(a.getCodigo() + " - " + a.getNombre() + " - " +
                    a.getNum_horas() + " - " + a.getId_profesor()
                );
        }
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }

    public Asignatura pedirNuevaAsignatura() {
        sc.nextLine();
        System.out.print("Código: ");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Número de horas: ");
        int num_horas = sc.nextInt();
        sc.nextLine();
        System.out.print("Id del profesor: ");
        int id_profesor = sc.nextInt();
        sc.nextLine();
        return new Asignatura(id, nombre, num_horas, id_profesor);
    }
}
