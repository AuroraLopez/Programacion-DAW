import java.util.Scanner;

public class Actividad11 {
    public static void main(String[] args) {
        // // EJECICIO 7 DIAPOSITIVA 18
        // // Primer pseudocodigo
        Scanner teclado= new Scanner(System.in);
        // Inicializamos las variables y las leemos
        int a, b, resto=0;
        System.out.println("Introduce los valora para a y b: ");
        a=teclado.nextInt();
        b=teclado.nextInt();
        // Hacemos las variables absolutas
        int absolu_a= Math.abs(a);
        int absolu_b=Math.abs(b);
        // Bucle para ver el MCD
        while (absolu_b!=0) {
            resto=absolu_a%absolu_b;
            absolu_a=absolu_b;
            absolu_b=resto;
        }
        // Imprime resultados
        System.out.println("El MCD es "+absolu_a);
        teclado.close();
    }
}
