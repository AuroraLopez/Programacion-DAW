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
        // Leemos las variables
        Scanner teclado= new Scanner(System.in);
        System.out.println("Escribe un numero para hacer el factorial");
        int num=teclado.nextInt();
        int producto=1;
        // Bucle para leer todos los numero del 1 al num y hacer sus cuentas
        for(int i=1;i<=num;i++){
            producto=producto*i;
        }
        // Imprime el resultado
        System.out.println(producto);
        teclado.close();
    }
}
