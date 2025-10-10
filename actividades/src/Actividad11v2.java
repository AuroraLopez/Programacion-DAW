import java.util.Scanner;

public class Actividad11v2 {
    public static void main(String[] args) {
        // EJECICIO 7 de la unidad 2
        // Segundo pseudocodigo
        Scanner teclado= new Scanner(System.in); 
        int a, b, mcm, mayor; 
        System.out.println("Introduce los valora para a y b: "); 
        a=teclado.nextInt(); 
        b=teclado.nextInt(); 
        int absolu_a= Math.abs(a); 
        int absolu_b=Math.abs(b); 
        if (absolu_a>absolu_b) { 
            mayor=absolu_a; 
            mcm=mayor; 
            while (mcm%absolu_b!=0) {
                 mcm+=mayor; 
            } 
        } else{ 
            mayor=absolu_b;
            mcm=mayor; 
            mcm=absolu_b; 
            while (mcm%absolu_a!=0) { 
                mcm+=mayor; 
            } 
        } 
        System.out.println("El mcm es: "+mcm); 
        teclado.close(); 
    }
}
