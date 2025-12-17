import java.util.ArrayList;
import java.util.Scanner;

public class Actividad1 {
    public static void imprimeArray(ArrayList<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i));
            System.out.print(" ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        /*
         * 1. (3 puntos) Para el sorteo del Niño se extraen 5 bolas al azar con valores
         * del 0 al 9. El jugador va a
         * introducir los 5 números con los que juega. Se pide crear una función que
         * valide si el jugador ha
         * ganado, es decir, tiene los 5 números del sorteo. En el caso de tener todos,
         * el jugador gana
         * 100.000€, si sólo tiene 4 ganará el 50%, si tiene 3 200€, si tiene 2 50€ y si
         * tiene 1 10€. Ten en
         * cuenta que un número puede repetirse más de una vez en cada posición.
         * Elabora este programa utilizando la clase ArrayList<Integer>.
         */
        Scanner teclado = new Scanner(System.in);
        // Elección aleatoria
        ArrayList<Integer> numerossorteo = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int numeroaleatorio = (int) (Math.random() * (9 - 0 + 1)) + 0;
            numerossorteo.add(numeroaleatorio);
        }

        // Almacenamos los numeros en el array
        ArrayList<Integer> numeroselegidos = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            System.out.println("¿Que número elije añadir a su juego?");
            int numero = teclado.nextInt();
            numeroselegidos.add(numero);
        }

        
        // Muestra la seleccion aleatoria
        System.out.println("Numeros del sorteo");
        imprimeArray(numerossorteo);

        // Muestra array usuario
        System.out.println("Numeros del usuario");
        imprimeArray(numeroselegidos);

        // Validamos si hemos ganado o no
        ArrayList<Integer> numerosiguales=new ArrayList<>();

        for (int i = 0; i < numeroselegidos.size(); i++) {
            if (numerossorteo.contains(numeroselegidos.get(i))) {
                numerosiguales.add(numeroselegidos.get(i));
            }
        }
        if (numerosiguales.size()==1) {
            System.out.println("Coincide solo un numero, has ganado 10 euros");
            System.out.print("Numeros coincidentes: ");
            imprimeArray(numerosiguales);
        }
        else if(numerosiguales.size()==2){
            System.out.println("Coincide dos numero, has ganado 50 euros");
            System.out.print("Numeros coincidentes: ");
            imprimeArray(numerosiguales);
        }
        else if(numerosiguales.size()==3){
            System.out.println("Coincide tres numero, has ganado 200 euros");
            System.out.print("Numeros coincidentes: ");
            imprimeArray(numerosiguales);
        }
        else if(numerosiguales.size()==4){
            System.out.println("Coincide cuatro numero, has ganado 50000 euros");
            System.out.print("Numeros coincidentes: ");
            imprimeArray(numerosiguales);
        }
        else if(numerosiguales.size()==5){
            System.out.println("Coincide cinco numero, has ganado 100000 euros");
            System.out.print("Numeros coincidentes: ");
            imprimeArray(numerosiguales);
        }
        else{
            System.out.println("Lo sentimos no ha ganado nada, vuelva a intentarlo");
        }
    }
}
