import java.util.Scanner;

public class Actividad6 {
    public static void main(String[] args) {
        // EJERCICIO 2 DIAPOSITIVA 16
        // Desarrolla un programa que calcule el factorial del número introducido
        /*
         * INICIO
         *      CONTANDOR
         *      MIENTRAS
         *      IMPRIME
         * FIN
        */
        Scanner teclado= new Scanner(System.in);
        System.out.println("Escribe un numero para hacer el factorial");
        int num=teclado.nextInt();
        int producto=1;
        for(int i=1;i<=num;i++){
            producto=producto*i;
        }
        System.out.println(producto);
        teclado.close();
    }
}
