import java.util.Scanner;

public class Actividad2 {
    //Primera actividad diapositiva 14
    //Haz el programa JAVA del siguiente diagrama de flujo
     public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        // Introducimos los valores por teclado
        System.out.println("Introduce a, b y c");
        int a=teclado.nextInt();
        int b=teclado.nextInt();
        int c=teclado.nextInt();
        // Calcular el discriminante
        double operacion=Math.pow(b, 2)-(4*a*c);
        if (operacion<0) {
            System.out.println("No hay soluciones");
        }
        else if(operacion==0){
            double x1=-b/(2*a);
            System.out.println("La unica solución es "+x1);
        }
        else{
            double x1=(-b+Math.sqrt(operacion)/(2*a));
            double x2=(-b-Math.sqrt(operacion)/2*a);
            System.out.println("La primera solución es: "+x1);
            System.out.println("La segunda solución es: "+x2);
        }
        teclado.close();
     }
}
