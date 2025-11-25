import java.util.Scanner;

public class Actividad11v2 {
    public static void main(String[] args) {
        // EJECICIO 7 DIAPOSITIVA 18
        // Segundo pseudocodigo
        Scanner teclado= new Scanner(System.in);
        // Inicializamos y leemos las variables 
        int a, b, mcm, mayor; 
        System.out.println("Introduce los valora para a y b: "); 
        a=teclado.nextInt(); 
        b=teclado.nextInt();
        // Volvemos absolutas las variables 
        int absolu_a= Math.abs(a); 
        int absolu_b=Math.abs(b);
        // Condiciones para saber cual es mayor y poder hacer las respectivas cuentas 
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
        // Imprime el resultado
        System.out.println("El mcm es: "+mcm); 
        teclado.close(); 
    }
}
