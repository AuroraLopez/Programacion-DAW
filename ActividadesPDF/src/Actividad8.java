import java.util.Scanner;

public class Actividad8 {
    public static void main(String[] args) {
        /*
         * Utilizando las funciones de String. Diseña una función que indique si una frase es palíndroma. Es 
         * decir, sin poner las tildes, se quitarán los espacios y se puede leer igual de izquierda a derecha que 
         * de derecha a izquierda. Ejemplo: “Dábale arroz a la zorra el abad” es igual en ambos sentidos. Otro 
         * sería: “Acaso hubo búhos acá”. Utiliza funciones para quitar los espacios y comparar.
         */
        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduce una frase sin mayúsculas");
        String frase=teclado.nextLine();

        // Comrpobamos si la frase es palindroma
        if (espalindroma(frase)) {
            System.out.println("La frase es palíndroma");
        } else {
            System.out.println("La frase no es palíndroma");
        }
        teclado.close();
    }

    public static boolean espalindroma(String frase){
        // Quitar espacios
        String frasesinespacios = frase.replaceAll(" ", "");

        // Darle la vuelta usando tu mismo bucle
        String fraseinvertida = "";
        for (int i = frasesinespacios.length() - 1; i >= 0; i--) {
            fraseinvertida = fraseinvertida + frasesinespacios.charAt(i);
        }

        // Comparar
        return frasesinespacios.equals(fraseinvertida);
    }
}
