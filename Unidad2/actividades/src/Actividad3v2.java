import java.util.Scanner;

public class Actividad3v2 {
    public static void main(String[] args) {
        //Segunda actividad diapositiva 14
        //Haz un programa que nos pide una nota y nos indica la 
        //calificación(sobresaliente, notable, bien, aprobado, suspenso, nota incorrecta).
        Scanner teclado= new Scanner(System.in);
        //Leer el numero 
        System.out.println("Introduce una nota");
        int nota=teclado.nextInt();
        //Con switch
        switch (nota) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("SUSPENSO");
                break;
            case 5:
            case 6:
                System.out.println("APROBADO");
                break;
            case 7:
            case 8:
                System.out.println("NOTABLE");
                break;
            case 9:
            case 10:
                System.out.println("SOBRESALIENTE");
                break;
            default:
                System.out.println("Valor Incorrecto");
                break;
        }
       teclado.close();
    }
}
