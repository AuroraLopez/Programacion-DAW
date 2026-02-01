package Actividades.Actividad5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.Scanner;

public class Actividad5_2 {
    public static void main(String[] args) {
        /*
         * Implementa una clase que lee el contenido de un fichero, cuya ruta le
         * indicas por teclado, y lo escribe en otro fichero con el mismo nombre y
         * añadiendo copia y fecha. Ejemplo: fichero→
         * fichero_copia_yyyy_mm_dd.txt. Recuerda usar LocalDate.now() y que
         * para sacar el nombre sin la extensión puedes usar nombre.substring(0,
         * nombre.lastIndexOf('.'));
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la ruta del fichero: ");
        String ruta = sc.nextLine();

        File ficheroOriginal = new File(ruta+"\\FicheroOriginal.txt");

        // Obtener nombre del fichero
        String nombre = ficheroOriginal.getName();
        String nombreSinExtension = nombre.substring(0, nombre.lastIndexOf('.'));
        String extension = nombre.substring(nombre.lastIndexOf('.'));

        // Obtener fecha actual
        LocalDate fecha = LocalDate.now();
        String fechaTexto = fecha.getYear() + "_" +
                            String.format("%02d", fecha.getMonthValue()) + "_" +
                            String.format("%02d", fecha.getDayOfMonth());

        // Crear nombre del fichero copia
        String nombreCopia = nombreSinExtension + "_copia_" + fechaTexto + extension;

        // Ruta completa del fichero copia
        File ficheroCopia = new File(ficheroOriginal.getParent(), nombreCopia);

        try {
            BufferedReader br = new BufferedReader(new FileReader(ficheroOriginal));
             BufferedWriter bw = new BufferedWriter(new FileWriter(ficheroCopia));

            String linea;
            while ((linea = br.readLine()) != null) {
                bw.write(linea);
                bw.newLine();
            }

            System.out.println("Fichero copiado correctamente: " + ficheroCopia.getName());
            br.close();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
