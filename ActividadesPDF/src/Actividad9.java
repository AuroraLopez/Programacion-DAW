import java.util.Scanner;

public class Actividad9 {
    // Función recursiva para la serie Fibonacci
    public static int Fibonacci(int n){
        // Colocamos las condiciones 
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else{
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
         
    }
    public static void main(String[] args) {
        // Escribe el mismo programa anterior pero con una función recursiva.
        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduce los términos que desee ver: ");
        int n = teclado.nextInt();
        // Bucle para imprimir los números fibonacci
        for (int i = 0; i < n; i++) {
            System.out.print(Fibonacci(i) + " ");
        }
        teclado.close();

    }
}
