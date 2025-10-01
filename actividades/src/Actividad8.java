import java.util.Scanner;

public class Actividad8 {
    public static void main(String[] args) {
        //4)Desarrolla un programa que calcule la suma, media, número de alumnos y cuántos son mayores de edad
        int media=0; int suma=0; int contador=0; int mayor=0;
        Scanner teclado=new Scanner(System.in);
        int edad;
        do{
            System.out.println("Instroduce una edad o -1 para salir");
            edad=teclado.nextInt();
            if (edad==-1) contador++;
            // Establezco la lógica para máximo y mínimo
            if(edad>18) mayor++;

        }while(edad!=-1);
        System.out.println("Ha contado "+contador+" alumnos");
        teclado.close();
    }
}
