package Actividades.Actividad5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Actividad5_4 {
    final static File archivo = new File(
            "C:\\Users\\USER\\Desktop\\1DAW\\Programacion-DAW\\Programacion\\Unidad5\\src\\Actividades\\Actividad5\\Alumnos.csv");
    final static ArrayList<String> datos = new ArrayList<>();

    public static void mostrarArray(ArrayList<String> array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }

    public static void main(String[] args) {
        /*
         * Añade otra opción para modificar el nombre de un alumno tras pasar el
         * id. Si tuviera que modificar el nombre de un alumno tendría que leer el
         * fichero, ir guardando las líneas, cambiar el afectado y luego sobreescribir
         * el resultado. Utiliza un ArrayList<String>
         */
        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Elije una opción o 0 para salir");
            System.out.println("0.Salir");
            System.out.println("1. Lista de alumnos");
            System.out.println("2. Inserta un alumno");
            System.out.println("3. Modificar alumno existente");
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion) {
                case 1:
                    listarAlumno(archivo);
                    break;
                case 2:
                    insertarAlumno(archivo, teclado);
                    break;
                case 3:
                    modificarAlumno(archivo, teclado);
                    break;
                default:
                    break;
            }
        } while (opcion != 0);
    }

    public static void modificarAlumno(File archivo, Scanner teclado) {

        ArrayList<String> datos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                datos.add(linea);
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
            return;
        }

        // Mostrar alumnos (sin cabecera)
        System.out.println("ALUMNOS:");
        for (int i = 1; i < datos.size(); i++) {
            System.out.println(datos.get(i));
        }

        System.out.print("Introduce el ID del alumno a modificar: ");
        String id = teclado.nextLine();

        System.out.print("Introduce el nuevo nombre: ");
        String nuevoNombre = teclado.nextLine();

        boolean encontrado = false;

        // Empezamos en 1 para no tocar la cabecera
        for (int i = 1; i < datos.size(); i++) {
            String[] campos = datos.get(i).split(";");

            if (campos[0].equals(id)) {
                campos[1] = nuevoNombre; // cambiar nombre
                datos.set(i, String.join(";", campos));
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("ID no encontrado");
            return;
        }

        // Sobrescribir fichero
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            for (String l : datos) {
                bw.write(l);
                bw.newLine();
            }
            System.out.println("Alumno modificado correctamente");
            bw.close();
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo");
        }
    }

    public static void insertarAlumno(File archivo, Scanner teclado) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
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
            bw.close();

            System.out.println("Alumno insertado correctamente");

        } catch (IOException e) {
            System.out.println("Error al insertar alumno");
        }
    }

    public static void listarAlumno(File archivo) {
        try {
            FileReader lector = new FileReader(archivo);
            BufferedReader bflector = new BufferedReader(lector);
            String linea;
            boolean primeraLinea = true;

            while ((linea = bflector.readLine()) != null) {
                if (primeraLinea) {
                    System.out.println("COLUMNAS: " + linea);
                    primeraLinea = false;
                } else {
                    System.out.println(linea);
                }
            }
        } catch (Exception e) {
            System.out.println("Error al leer el archivo");
            ;
        }
    }
}
