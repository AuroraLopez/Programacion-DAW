import java.util.Scanner;

public class Actividad13 {
    // Función para saber si es primo
    public static boolean esprimo(int num){
        int contador =0;
        // Bucle que va diviendo el numero entre todos los numero entre 1 y el numero
        for(int i=1; i<=num; i++){
            // Condición para que duba el contador de los numeros divisibles
            if(num%i==0){
                contador++;
            }
        }
        // Condición para saber si es primo o no
        if (contador<=2) {
            return true;
        }
        else{
            return false;
        }        
    }

    // Función para que imprima los 100 numeros primos
    public static void cienprimos(){
        int totalprimos=0;
        int num =2;
        // Bucle paraq que vaya viendo numeropor numero si es primo hasta que llegue a los 100
        do{
            if (esprimo(num)==true) {
                totalprimos++;
                System.out.println(num);            
            }
            num++;
        }while(totalprimos!=100);
    }
    public static void main(String[] args) {
        /*
         *  Ampliación: Escribe un método que diga si un número introducido por teclado es o no primo y 
         *  utilízalo para encontrar los 100 primeros números primos. Un número primo es aquel que sólo es 
         *  divisible entre él mismo y la unidad.
         */
        System.out.println("Introduce un número para saber si es primo: ");
        Scanner teclado=new Scanner(System.in);
        int num=teclado.nextInt();

        System.out.println("¿Es "+num+" primo?");
        System.out.println(esprimo(num));
        
        cienprimos();

        teclado.close();
    }
}
