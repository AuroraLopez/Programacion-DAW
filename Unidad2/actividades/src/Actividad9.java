import java.util.Scanner;

public class Actividad9 {
    public static void main(String[] args) {
        // EJERCICIO 5 DIAPOSITIVA 17
        /*
         * Desarrolla un programa que trate de adivinar un número 
         * entre 1 y 100 generado aleatorio, que vaya indicando si 
         * has introducido un número mayor o menor al correcto y
         * el número de intentos.
         */
        // Inicializamos variables para su posterior lectura
        int intentos=0;
        int min=1;
        int max=100;
        int aleatorio=(int)(Math.random()*(max-min+1))+min;
        // Entrada de teclado
        Scanner teclado=new Scanner(System.in);
        int num;
        // Bucle para la adivinación del numero
        do{
            System.out.println("Adivina el número que estoy pensando ");
            num=teclado.nextInt();
            // Condición por si tu numeros es mayor al aleatorio
            if(num>aleatorio){
                System.out.println("Has introducido un número mayor al correcto");
                intentos++;
            }
            // Condición por si tu numero es menor al aleatorio
            if(num<aleatorio){
                System.out.println("Has introducido un número menor al correcto");
                intentos++;
            }
        }while(num!=aleatorio);
        // Imprime resultados
        System.out.println("Los has adivinado el número era: "+aleatorio);
        System.out.println("Has usado "+ intentos+" intentos");
        teclado.close();
    }
}
