package Actividades.Actividad5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Actividad5_3 {
    public static void main(String[] args) {
        /*
        * Implementa una clase que procesa un fichero csv con datos de alumnos,
        * donde la primera fila son los nombres de columnas (no sabes los que
        * tendrá), y trata de hacer un menú que permita leer los alumnos
        * guardados y que permita insertar nuevos. 
        */
       Scanner teclado= new Scanner(System.in);
       int opcion;
        File archivo=new File("C:\\Users\\USER\\Desktop\\1DAW\\Programacion-DAW\\Programacion\\Unidad5\\src\\Actividades\\Actividad5\\Alumnos.csv");
       do {
        System.out.println("Elije una opción o 0 para salir");
        System.out.println("0.Salir");
        System.out.println("1. Lista de alumnos");
        System.out.println("2. Inserta un alumno");
        opcion=teclado.nextInt();
        teclado.nextLine();
        switch (opcion) {
            case 1:
                listarAlumnos(archivo);
                break;
            case 2:
                insertarAlumno(archivo, teclado);
                break;
            default:
                break;
        }
       } while (opcion!=0);
    }

    public static void listarAlumnos(File archivo){
        try {
            FileReader lector=new FileReader(archivo);
            BufferedReader bflector=new BufferedReader(lector);
            String linea;
            boolean primeraLinea=true;

            while ((linea=bflector.readLine())!=null) {
                if (primeraLinea) {
                    System.out.println("COLUMNAS: " + linea);
                    primeraLinea = false;
                } else {
                    System.out.println(linea);
                }
            }
        } catch (Exception e) {
            System.out.println("Error al leer el archivo");;
        }
    }

    // ✍ INSERTAR ALUMNO
    public static void insertarAlumno(File archivo, Scanner teclado) {
        try{ BufferedReader br = new BufferedReader(new FileReader(archivo));
             BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true));

            // Leer cabecera para saber cuántos campos hay
            String cabecera = br.readLine();
            String[] columnas = cabecera.split(",");

            StringBuilder nuevoAlumno = new StringBuilder();

            for (int i = 0; i < columnas.length; i++) {
                System.out.print("Introduce " + columnas[i] + ": ");
                String dato = teclado.nextLine();
                nuevoAlumno.append(dato);

                if (i < columnas.length - 1) {
                    nuevoAlumno.append(",");
                }
            }

            bw.newLine();
            bw.write(nuevoAlumno.toString());

            System.out.println("Alumno insertado correctamente");

        } catch (IOException e) {
            System.out.println("Error al insertar alumno");
        }
    }
}
