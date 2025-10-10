import java.util.Scanner;

public class Actividad11 {
    public static void main(String[] args) {
        // // EJECICIO 7 de la unidad 2
        // // Primer pseudocodigo
        Scanner teclado= new Scanner(System.in);
        int a, b, resto=0;
        System.out.println("Introduce los valora para a y b: ");
        a=teclado.nextInt();
        b=teclado.nextInt();
        int absolu_a= Math.abs(a);
        int absolu_b=Math.abs(b);
        while (absolu_b!=0) {
            resto=absolu_a%absolu_b;
            absolu_a=absolu_b;
            absolu_b=resto;
        }
        System.out.println("El MCD es "+absolu_a);
        teclado.close();
    }
}
