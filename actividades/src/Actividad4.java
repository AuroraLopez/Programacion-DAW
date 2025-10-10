import java.util.Scanner;

public class Actividad4 {
    public static void main(String[] args) {
        // Tercera actividad diapositiva 14
        /*
         * Haz un programa que solicita el día, mes y año y comprueba si es válido.
         * Para el año hay que ver si el 29 es válido por ser bisiesto. Un año es bisiesto si: (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)
        */
        Scanner teclado= new Scanner(System.in);
            // Definir varibles
            int dia=0, mes=0, anio=0;
            System.out.println("Introduce dia mes año");
            dia= teclado.nextInt();
            mes= teclado.nextInt();
            anio= teclado.nextInt();
            if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) {
                if(dia>=1 && dia<=31){
                    System.out.println("Fecha correcta");
                }
                else{
                    System.out.println("Fecha incorrecta");
                }
            }
            else if (mes==4 || mes==6 || mes==9 || mes==11) {
                if(dia>=1 && dia<=31){
                    System.out.println("Fecha correcta");
                }
                else{
                    System.out.println("Fecha incorrecta");
                }
            }
            else if (mes==2) { //Caso febrero
                if (dia>=1 && dia<=28) {
                    System.out.println("Fecha correcta");
                }
                else if (dia==29) {
                    if ( (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                        System.out.println("Fecha correcta");
                    }
                    else{
                        System.out.println("Fecha incorrecta");
                    }
                }
                else{
                    System.out.println("Fecha incorrecta");
                }
           
            }

        teclado.close();
    }
}
