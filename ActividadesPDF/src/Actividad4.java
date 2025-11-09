import java.util.Scanner;

public class Actividad4 {
    public static void main(String[] args) {
        /*
         * Escribir un programa que valide el décimo de la bonoloto. Tendrás un array
         * con los valores correctos y otro el que introduzca el usuario. 
         * El programa verificará cuántos aciertos ha tenido.
         */
        Scanner teclado = new Scanner(System.in);
        int numerosbonoloto[] = { 4, 12, 25, 37, 44, 49 };
        int contadoraciertos = 0;

        // Añadimos numeros a una array
        int arrayusuario[] = new int[6];
        for (int i = 0; i < arrayusuario.length; i++) {
            System.out.println("¿Qué números tienen tu bonoloto?");
            int numero = teclado.nextInt();
            arrayusuario[i] = numero;
        }

        // Mostramos el array del bonoloto
        System.out.println("Bonoloto ganador para la comprobacion");
        for (int i = 0; i < numerosbonoloto.length; i++) {
            System.out.print(numerosbonoloto[i] + " ");
        }
        System.out.println();

        // Mostramos el array de usuario
        System.out.println("Bonoloto del usuario");
        for (int i = 0; i < arrayusuario.length; i++) {
            System.out.print(arrayusuario[i] + " ");
        }

        // Comprobamos los digitos a ver si coinciden
        for (int i = 0; i < numerosbonoloto.length; i++) {
            for (int j = 0; j < arrayusuario.length; j++) {
                if (numerosbonoloto[i] == arrayusuario[j]) {
                    contadoraciertos++;
                }
            }
        }
        // Mostramos los aciertos que hemos tenido
        System.out.println("Ha tenido " + contadoraciertos + " aciertos");
        teclado.close();
    }
}
