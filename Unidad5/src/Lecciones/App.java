package Lecciones;

import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Scanner teclado=new Scanner(System.in);
        // int numero=0;
        // boolean entradaValida = true;
        // do {
        //     System.out.println("Introduce un número entero: "); 
        // try {
        //     numero=teclado.nextInt();
        //     entradaValida=true;
        // }
        // catch (Exception e) {
        //     System.out.println("Cuidado solo puedes introducir numero enteros");
        //     teclado.next();
        // }
        // } while (!entradaValida);
        // teclado.close();
        // System.out.println("Has introducido el número: "+numero);
        // Ver la ruta para poder usar la ruta relativa
        // System.out.println("Directorio actual: "+ new File(".").getAbsolutePath());
        
        try {
            File fichero = new File("./heroes.json");
            System.out.println(fichero.exists());
            System.out.println("Nombre: "+fichero.getName());
            System.out.println("Permiso de lectura: "+fichero.canRead());
            System.out.println("Tamaño en Bytes: "+fichero.length());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    } 
}

