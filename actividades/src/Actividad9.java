import java.util.Scanner;

public class Actividad9 {
    public static void main(String[] args) {
        // EJERCICIO 5 DIAPOSITIVA 17
        int intentos=0;
        int min=1;
        int max=100;
        int aleatorio=(int)(Math.random()*(max-min+1))+min;
        // Entrada de teclado
        Scanner teclado=new Scanner(System.in);
        int num;
        do{
            System.out.println("Adivina el número que estoy pensando ");
            num=teclado.nextInt();
            if(num>aleatorio){
                System.out.println("Has introducido un número mayor al correcto");
                intentos++;
            }
            if(num<aleatorio){
                System.out.println("Has introducido un número menor al correcto");
                intentos++;
            }
        }while(num!=aleatorio);
        System.out.println("Los has adivinado el número era: "+aleatorio);
        System.out.println("Has usado "+ intentos+" intentos");
        teclado.close();
    }
}
