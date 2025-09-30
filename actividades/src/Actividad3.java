import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
       //Haz un programa que nos pide una nota y nos indica la calificación(sobresaliente, notable, bien, aprobado, suspenso, nota incorrecta).
       // Con if else
       Scanner teclado= new Scanner(System.in);
       //Leer el numero 
       System.out.println("Introduce una nota");
       int nota=teclado.nextInt();
    //    if (nota<5) {
    //         System.out.println("Está suspenso");
    //    }
    //    else if(nota>=5 || nota<6){
    //         System.out.println("Está aprobado");
    //    }
    //    else if(nota>=6 || nota<7){
    //         System.out.println("Está bien");
    //    }
    //    else if(nota>=8 || nota<9){
    //         System.out.println("Está notable");
    //    }
    //    else if(nota>=9 || nota<=10){
    //         System.out.println("Está sobresaliente");
    //    }
    //    else{
    //         System.out.println("No es correcta la nota");
    //    }

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
