import java.util.Scanner;

public class Actividad8 {
    public static void main(String[] args) {
        /*
         * Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. El primer 
         * término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos 
         * anteriores, por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El 
         * número n se debe introducir por teclado.
         */

         // Leemos las variables
        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduce los términos que desee ver: ");
        int n= teclado.nextInt();
        // Imprimimos los primeros dígitos
        int num=0; int num2=1;
        System.out.print(num+" ");
        System.out.print(num2+" ");
        // Bucle que sume los digitos
        for(int i=0; i<n; i++){
            int numsiguiente= num+num2;
            num=num2;
            num2=numsiguiente;
            System.out.print(numsiguiente+" ");
        }
        teclado.close();
    }
}
