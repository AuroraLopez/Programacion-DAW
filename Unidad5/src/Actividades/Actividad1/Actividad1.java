package Actividades.Actividad1;

import java.io.File;
import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {
        /*
    * Lee una secuencia de números
    * en un fichero y calcula su suma y media.
    * Usa Scanner donde la entrada es fichero y
    * en while usa scanner.hasNextInt()
    */
   try {
        int suma=0;
        int contador=0;
        File archivo=new File("C:\\Users\\Auri\\Desktop\\1º DAW\\Programación\\Programacion-DAW\\Unidad5\\src\\Actividades\\Actividad1\\ArchivoEjer1.txt");
        Scanner sc=new Scanner(archivo);
        while (sc.hasNextInt()) {
            int numero=sc.nextInt();
            suma+=numero;
            contador++;
        }
        sc.close();
        System.out.println("La suma de los "+contador+ " numeros es: "+ suma+ " y la media es de: "+suma/contador);
   } catch (Exception e) {
        System.out.println("Ha ocurrido un error");
   }
    }    
}
