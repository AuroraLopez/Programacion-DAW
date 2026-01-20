package Actividades;

import java.io.File;
import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {
        /*
         * Haz el mismo ejercicio anterior
         * pero ahora las líneas van una tras otro
         * separados por ‘,’. Tendrás que usar
         * sc.useDelimiter(",") o leer String y split en
         * un array
         */
        try {
            int suma = 0;
            int contador = 0;
            File archivo = new File(
                    "C:\\Users\\Auri\\Desktop\\1º DAW\\Programación\\Programacion-DAW\\Unidad5\\src\\Actividades\\ArchivoEjer2.txt");
            Scanner sc = new Scanner(archivo);
            sc.useDelimiter(","); // Por donde delimites tiene que estar al final para que cuente con el ultimo tambien 1,2,3,
            while (sc.hasNextInt()) {
                int numero = sc.nextInt();
                suma += numero;
                contador++;
            }
            sc.close();
            System.out.println(
                    "La suma de los " + contador + " numeros es: " + suma + " y la media es de: " + suma / contador);
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error");
        }
    }
}
