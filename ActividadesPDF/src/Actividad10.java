import java.util.Scanner;

public class Actividad10 {
    // Función para ver los digitos pares que tiene el número introducido
    public static int numeroPares(int n){
        int pares=0;
        // Bucle que mire todos los digitos pares del numero introducido
        while (n>0) {
            int digito=n%10;
            // Condición para saber si es par
            if(digito % 2 ==0){
                pares++;
            }
            // Quitamos el ultimo digito
            n/=10;
        }
        return pares;
    }
    // Función para ver los digitos impares que tiene el número introducido
    public static int numeroImpares(int n){
        int impares=0;
                // Bucle que mire todos los digitos impares del numero introducido
        while (n>0) {
            int digito=n%10;
            // Condición para saber si es impar
            if(digito % 2 !=0){
                impares++;
            }
            // Quitamos el último dígito
            n/=10;
        }
        return impares;
    }
    public static void main(String[] args) {
        /*
         *  Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares hay dentro de un 
         *  número indicado por teclado. Genera dos funciones, una para que devuelva el número de pares y 
         *  otra para el número de impares. Ejemplo de salida: El 406783 contiene 4 dígitos pares y 2 dígitos 
         *  impares.
         */
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Introduce un numero: ");
        int num = teclado.nextInt();

        System.out.println("El "+num+" contiene "+numeroPares(num)+" dígitos pares y "+numeroImpares(num)+" dígitos");
        
        teclado.close();
    }
}
