import java.util.Scanner;

public class Actividad1 {
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
    public static int[] pop(int [] copiaarray){
        int eliminaultimo [] = new int[copiaarray.length-1];
        for(int i=0;i<copiaarray.length-1;i++){
            eliminaultimo[i]=copiaarray[i];
        }
        System.out.println();
        
        // Mostramos el arraynuevo
        System.out.println("Array eliminando el último");
        for(int i=0;i<eliminaultimo.length;i++){
            System.out.print(eliminaultimo[i]+ " ");
        }
        System.out.println();
        return eliminaultimo;

    }

    public static void main(String[] args) throws Exception {
        /*
         * Escribe un programa que simule el comportamiento de una pila creando una función push y otra 
         * pop. La función push inserta un número al final del vector y devuelve el nuevo array. La función
         * pop elimina el último número del array y lo devuelve.
         */
        int arraypila[]={1,2,3,5};
        int numero;
        Scanner teclado=new Scanner(System.in);
        System.out.println();
        System.out.println("¿Que número desea añadir al array?");
        numero=teclado.nextInt();
        System.out.println("Antiguo array");
        for(int i=0;i<arraypila.length;i++){
            System.out.print(arraypila[i]+ " ");
        }
        System.out.println();

        pop(push(arraypila,numero));

        teclado.close();

    }
}
