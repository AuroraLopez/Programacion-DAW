package EJERCICIO8;

import java.io.*;
import java.util.Scanner;

public class CopiarContenido {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        //Pedir rutas y directorios por teclado
        System.out.println("Introduce la primera ruta");
        String rt1 = sc.nextLine();
        System.out.println("Introduce la segunda ruta");
        String rt2 = sc.nextLine();
        System.out.println("Introduce el directorio");
        String directorio = sc.nextLine();

        //Guardar los ficheros introducidos
        File f1 = new File(rt1);
        File f2= new File(rt2);
        //Almacenar los nombres del fichero 1 y el fichero 2 para crear el nuevo
        String nombreSalida = f1.getName().replace(".txt", "") + "_" + f2.getName();
        //
        File ficheroSalida = new File(directorio, nombreSalida);

        try {
                //Leer cada fichero introducido por teclado
                BufferedReader br1 = new BufferedReader(new FileReader(f1));
                BufferedReader br2 = new BufferedReader(new FileReader(f2));
                //Escribir en el directorio los contenidos de ambos ficheros
                BufferedWriter bw = new BufferedWriter(new FileWriter(ficheroSalida));


            String linea;

            // Copiar contenido del primer fichero
            while ((linea = br1.readLine()) != null) {
                bw.write(linea);
                bw.newLine();
            }

            // Copiar contenido del segundo fichero
            while ((linea = br2.readLine()) != null) {
                bw.write(linea);
                bw.newLine();
            }

            System.out.println("Fichero creado correctamente en:");
            System.out.println(ficheroSalida.getAbsolutePath());

        } catch (IOException e) {
            System.out.println("Error al procesar los ficheros");
            e.printStackTrace();
        }
    }
}
