package Actividades;

import java.io.File;
import java.util.Scanner;

public class Actividad5{
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce la ruta deseada");
        String ruta=teclado.nextLine();
        File fichero=new File(ruta);
        if (!fichero.exists()) {
            System.out.println("El fichero no existe o la ruta es incorrecta");
        }
        else{
            System.out.println("Introduce una palabra");
            String palabra=teclado.nextLine();
            
        }
    }
}