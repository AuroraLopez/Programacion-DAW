package Actividades.Actividad8.vista;

import java.time.Year;
import java.util.List;
import java.util.Scanner;

import Actividades.Actividad8.modelo.Curso_Escolar;

public class CursoEscolarView {
    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n--- MENÚ PERSONAS ---");
        System.out.println("1. Insertar Curso Escolar");
        System.out.println("2. Listar Cursos");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
        return sc.nextInt();
    }

    public void mostrarCursos(List<Curso_Escolar> cursosescolares) {
        System.out.println("\nLISTADO:");
        for (Curso_Escolar ce : cursosescolares) {
            System.out.println(ce.getId() + " - " + ce.getAño_fin() + " - " +
                    ce.getAño_fin()
                );
        }
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }

    public Curso_Escolar pedirNuevoCurso() {
        sc.nextLine();
        System.out.print("Id: ");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.print("Año de inicio: ");
        Year inicio = Year.of(sc.nextInt());
        sc.nextLine();
        System.out.print("Año de fin: ");
        Year fin = Year.of(sc.nextInt());
        sc.nextLine();
        return new Curso_Escolar(id, inicio, fin);
    }
}
