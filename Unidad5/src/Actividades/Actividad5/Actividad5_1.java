package Actividades.Actividad5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Actividad5_1 {
    public static void main(String[] args) {
        /*
         * Implementa una clase que lee el contenido de un fichero, solicita una
         * palabra por teclado y dice cuántas veces aparece en el texto. Utiliza
         * split("\\s+") para separar por uno o varios espacios.
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una palabra");
        String palabra = teclado.nextLine();
        int contador = 0;
        String linea;
        try {
            File archivo = new File(
                    "C:\\Users\\Auri\\Desktop\\1DAW\\Programacion\\Programacion-DAW\\Unidad5\\src\\Actividades\\Actividad5\\Archivolectura5.1.txt");
            FileReader lector = new FileReader(archivo);
            BufferedReader bflector = new BufferedReader(lector);
            while ((linea = bflector.readLine()) != null) {
                String[] palabras = linea.split("\\s+");
                for (String p : palabras) {
                    if (p.equalsIgnoreCase(palabra)) {
                        contador++;
                    }
                }
            }
            System.out.println("La palabra '" + palabra + "' ha aparecido " + contador+ " veces en el fichero");
            bflector.close();
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error");
        }
    }
}
