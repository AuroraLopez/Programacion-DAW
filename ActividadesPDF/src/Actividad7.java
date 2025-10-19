import java.util.Scanner;

public class Actividad7 {
    public static void main(String[] args) {
        /*
         * Realiza un programa que introduzca números hasta poner 0 y te diga cuántos positivos y 
         * negativos has introducido
         */
        // Leemos variables
        int contador=0;
        int contpositivos=0;
        int contnegativos=0;
        Scanner teclado=new Scanner(System.in);
        int num;
        // Bucle que pide numeros
        do{
            System.out.println("Introduce una numero o 0 para salir");
            num=teclado.nextInt();
            // Contador de numeros
            if (num!=0) contador++;
            // Determinar si son positivos y negativos
            if (num>0) contpositivos++;
            else if (num<0) contnegativos++;
        }while(num!=0);

        // Imprime resultados
    
        System.out.println("Ha contado "+contador+" numeros");
        System.out.println("Ha contado "+contpositivos+" numeros positivos");
        System.out.println("Ha contado "+contnegativos+" numeros negativos");
        teclado.close();


    }
}
