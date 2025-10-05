import java.util.Scanner;

public class Actividad7 {
    public static void main(String[] args) {
        // EJERCICIO 3 de la unidad 2
        //Desarrolla un programa que muestre la edad máxima y mínima de un grupo de alumnos que se introduzca hasta escribir -1
        int max=0; int min=1000000; int contador=0;
        Scanner teclado=new Scanner(System.in);
        int edad;
        do{
            System.out.println("Instroduce una edad o -1 para salir");
            edad=teclado.nextInt();
            if (edad==-1) contador++;
            // Establezco la lógica para máximo y mínimo
            if(edad>max){
                max=edad;
            }
            if(edad<min&&edad!=-1){
                min=edad;
            }
        }while(edad!=-1);
        System.out.println("Ha contado "+contador+" personas");
        System.out.println("El máximo es "+max);
        System.out.println("El minimo es "+min);
        teclado.close();
    }
}
