import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        /*
         * Realiza un programa que vaya pidiendo números hasta que se introduzca un numero 
         * negativo y nos diga cuántos números se han introducido, la suma de los impares, el mayor de los
         * pares y el menor de todos. El número negativo sólo se utiliza para indicar el final de la introducción 
         * de datos pero no se incluye en el cómputo.
         */
        Scanner teclado= new Scanner(System.in);
        int numero; int contador=0; int sumimpares=0; int maxpar=0; int menor=10000;
        do{
            System.out.println("Introduce una numero o -1 para salir");
            numero=teclado.nextInt();
            if (numero>0) contador++;
            if (numero%2!=0 && numero>0){
                sumimpares+=numero;
            }
            if (numero%2==0 && maxpar<numero ) {
                maxpar=numero;
            }
            if (menor>numero && numero>0) {
                menor=numero;
            }
        }while(numero>0);
        System.out.println("Ha introducido "+contador+ " números");
        System.out.println("La suma de todos los impares es: "+sumimpares);
        System.out.println("El mayor numero de los pares es "+ maxpar);
        System.out.println("El menor número de todos es: "+menor);
    }
}
