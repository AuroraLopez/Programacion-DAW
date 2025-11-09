import java.util.Scanner;

public class Actividad3 {
    public static int[] maxymin(int array[]){
        // Inicializamos variables
        int max=0;
        int min=10000;
        // Recorremos el array comprobando cual es el mayor y el menor
        for(int i=0;i<array.length;i++){
           if (array[i]>max) max=array[i];
           if(array[i]<min) min=array[i];
        }
        // Creamos un array que englobe ambos digitos y lo devolvemos
        int arraymaxmin[]= new int[]{min,max};
        return arraymaxmin;
    }
    public static void main(String[] args) {
        /*
         * Escribir una función que devuelve un array que contiene el valor máximo y mínimo del array 
         * introducido como parámetro.
         */
        Scanner teclado= new Scanner(System.in);
        int maxymin[];

        // Pedimos la longitud del array
        System.out.println();
        System.out.println("¿Cuántos numeros deseas introducir?");
        int longitud=teclado.nextInt();
        
        // Añadimos numeros a una array
        int array[]= new int[longitud];
         for (int i = 0; i < longitud; i++) {
            System.out.println("¿Qué número deseas añadir?");
            int numero = teclado.nextInt();
            array[i]=numero;
        }

        // Mostramos el array
        System.out.println("Array");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println();
        
        // Guardamos y mostramos el Array maximo y minimo
        maxymin=maxymin(array);
        System.out.println("Array con el mínimo y el máximo");
        for(int i=0;i<maxymin.length;i++){
            System.out.print(maxymin[i]+ " ");
        }
        System.out.println();
        teclado.close();
    }
}
