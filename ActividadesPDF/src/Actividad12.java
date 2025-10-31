import java.util.Scanner;

public class Actividad12 {
    // Función que realiza el máximo común divisor 
    public static int mcd(int a, int b){
        int resto;
        // bucle que va diviendo para encontrar el maximo comun divisor
        while (b!=0) {
            resto=a%b;
            a=b;
            b=resto;
        }
        return a;
    }
    
    // Función para realizar el mínimo común múltiplo a partir del máximo común divisor
    public static int mcm(int a, int b){
        int mcm;
        mcm=(a*b)/mcd(a, b);
        return mcm;
    }
    public static void main(String[] args) {
        /*
         * Escribe una función que calcula el mínimo común múltiplo de dos números a partir de conocer 
         * la función del máximo común divisor.
         */
        Scanner teclado= new Scanner(System.in);

        System.out.println("Introduce dos numero a b: ");
        int a=teclado.nextInt();
        int b=teclado.nextInt();

        System.out.println("Este es el MCD: "+mcd(a, b));
        System.out.println("Este es el mcm: "+mcm(a, b));

        teclado.close();
    }
}
