import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        //Segunda actividad diapositiva 14
        //Haz un programa que nos pide una nota y nos indica la calificación(sobresaliente, notable, bien, aprobado, suspenso, nota incorrecta).
        // Con if else
        Scanner teclado= new Scanner(System.in);
        //Leer el numero 
        System.out.println("Introduce una nota");
        int nota=teclado.nextInt();
        // Colocamos cada una de las condiciones para las diferentes notas 
        if (nota<5) {
            System.out.println("Está suspenso");
        }
        else if(nota>=5 || nota<6){
            System.out.println("Está aprobado");
        }
        else if(nota>=6 || nota<7){
            System.out.println("Está bien");
        }
        else if(nota>=8 || nota<9){
            System.out.println("Está notable");
        }
        else if(nota>=9 || nota<=10){
            System.out.println("Está sobresaliente");
        }
        else{
            System.out.println("No es correcta la nota");
        }
        teclado.close();
    }
}
