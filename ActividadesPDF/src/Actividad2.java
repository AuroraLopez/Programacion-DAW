import java.util.Arrays;
import java.util.Scanner;

public class Actividad2 {
     public static int[] push(int [] arraypila, int numero){
        // Creamos la copia del array original
        int copiaarray [] = new int[arraypila.length+1];
        // Copiamos los digitos del array original para coparlos a la copia
        for(int i=0;i<arraypila.length;i++){
            copiaarray[i]=arraypila[i];
        }
        System.out.println();
        
        // Agregar digito
        copiaarray[copiaarray.length - 1] = numero;

        // Mostramos el arraynuevo
        System.out.println("Array añadiendo "+numero+ " al final");
        for(int i=0;i<copiaarray.length;i++){
            System.out.print(copiaarray[i]+ " ");
        }
        System.out.println();
        return copiaarray;

    }
    public static void main(String[] args) {
        /*
         * Escribir un programa que solicite al usuario cuántos números desea introducir y que muestre el 
         * vector original y el resultado en orden de mayor a menor. Puedes elegir el método de ordenación. 
         * Utiliza las funciones creadas en el ejercicio anterior.
         */
        Scanner teclado=new Scanner(System.in);
        // Pedimos la longitud del array
        System.out.println("¿Cuántos numeros deseas introducir?");
        int longitud=teclado.nextInt();
        // Hacemos un array dinÁmico vacio
        int arraydinamico[]= new int[0];

        // Añadimos los valores al array con la función push
        for (int i = 0; i < longitud; i++) {
            System.out.println("¿Qué número deseas añadir?");
            int numero = teclado.nextInt();
            arraydinamico = push(arraydinamico, numero); 
        }

        // Mostramos array desordenado
        System.out.println("Array desordenado");
        for(int i=0;i<arraydinamico.length;i++){
            System.out.print(arraydinamico[i]+ " ");
        }
        System.out.println();

        // Mostramos array ordenado
        System.out.println("Array ordenado");
        
        for(int i=0;i<arraydinamico.length;i++){
            Arrays.sort(arraydinamico);
            System.out.print(arraydinamico[i]+ " ");
        }
        System.out.println();

        teclado.close();
    }
}
