import java.util.ArrayList;
import java.util.Scanner;

public class Actividad5 {
    public static void main(String[] args) {
        /*
         * Escribir el programa anterior pero empleando funciones de ArrayList<Integer>
        */

        Scanner teclado = new Scanner(System.in);
        int numero;
        int numerosbonoloto[] = { 4, 12, 25, 37, 44, 49 };
        int contadoraciertos = 0;
        
        // Creamos el array del usuario con arraylist
        ArrayList<Integer> arrayusuario=new ArrayList<>(6);

        // Almacenamos los numeros en el array
        for(int i=0;i<6;i++){
            System.out.println("¿Que número tiene su bonoloto?");
            numero=teclado.nextInt();
            arrayusuario.add(numero);
        }

        // Comprobamos los digitos a ver si coinciden
        for (int i = 0; i < numerosbonoloto.length; i++) {
            for (int j = 0; j < arrayusuario.size(); j++) {
                if (numerosbonoloto[i] == arrayusuario.get(j)) {
                    contadoraciertos++;
                }
            }
        }

        // Mostramos el array del bonoloto
        System.out.println("Bonoloto ganador para la comprobacion");
        for (int i = 0; i < numerosbonoloto.length; i++) {
            System.out.print(numerosbonoloto[i] + " ");
        }
        System.out.println();

        // Mostramos el array de usuario
        System.out.println("Bonoloto del usuario");
        for(int i=0;i<arrayusuario.size();i++){
            System.out.print(arrayusuario.get(i)+" ");
        }
        System.out.println();
        
        //Mostramos los aciertos
        System.out.println("Ha tenido "+contadoraciertos+" aciertos");


        teclado.close();

    }
}
