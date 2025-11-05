import java.util.Scanner;

public class Actividad6 {
    public static void main(String[] args) { 
        /*
         * Utilizando las funciones de String, vas a diseñar el 
         * juego del ahorcado. De un array de palabras vas a coger una al azar y se 
         * creará el vector con * de la longitud para que cuando el usuario acierte
         * una letra se vaya sustituyendo hasta que o bien la palabra se puede 
         * leer(ganas) o acaba el juego si fallas 7 veces (pierdes)
         */

         Scanner teclado = new Scanner(System.in);

         String palabras[]={"marco","reto","atun","pizza","avion","aurora","pedro","fatima","antonio", "rafael"};
         int falladas=0; boolean encontrada=false;
         int aleatorio=(int)(Math.random()*palabras.length-1+1);
         String elegida=palabras[aleatorio];
         char palabraoculta[]=new char[elegida.length()];
        for(int i=0;i<palabraoculta.length;i++){
            palabraoculta[i]='*';
        }
        
        System.out.println("Bienvenido al juego del ahorcado");
        do{
         for(int i=0;i<palabraoculta.length;i++){
            System.out.print(palabraoculta[i]);
        }

        System.out.println("Introduce la letra: *");
        char letra=teclado.nextLine().charAt(0);
        String letra2=String.valueOf(letra);
        
        if(elegida.contains(letra2)){
            System.out.println("La letra está en la palabra");
            for(int i=0;i<elegida.length();i++){
                if (elegida.charAt(i)==letra2.charAt(0)) {
                    palabraoculta[i]=letra2.charAt(0);
                }
            }

        }
        else{
            System.out.println("La letra no está en la palabra");
            falladas++;
        }

        // Compruebo si he ganado.
         }while(falladas!=7 && !encontrada);
         System.out.println("EL PROGRAMA HA FINALIZADO");

        
    }
}
