import java.util.Scanner;

public class Actividad8 {
    public static void main(String[] args) {
        // EJERCICIO 4 DIAPOSITIVA 17
        // Desarrolla un programa que calcule la suma, media, número de alumnos y cuántos son mayores de edad
        int suma=0; int contador=0; int mayor=0;
        Scanner teclado=new Scanner(System.in);
        int edad;
        do{
            System.out.println("Introduce una edad o -1 para salir");
            edad=teclado.nextInt();
            // Contador de alumnos
            if (edad!=-1) contador++;
            // Contador de mayores de edad
            if(edad>=18) mayor++;
            // Suma
            if (edad!=-1) {
                suma=suma+edad;  
            };
        }while(edad!=-1);

        double media=suma/contador;
    
        System.out.println(mayor+" personas son mayores de edad");
        System.out.println("Ha contado "+contador+" alumnos");
        System.out.println("La suma de todas las edades es: "+suma);
        System.out.println("La media de la edad de los alumnos es: "+media);
        teclado.close();

    }
}
