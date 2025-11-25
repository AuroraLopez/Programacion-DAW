import java.util.Scanner;

public class Actividad4 {
    public static boolean verificaAnagrama(String palabra1, String palabra2){
        char palabra1letras[]=new char[palabra1.length()];
        for (int i = 0; i < palabra1.length(); i++) {
            palabra1letras[i] = palabra1.charAt(i);
        }

        char palabra2letras[]=new char[palabra2.length()];
        for (int i = 0; i < palabra2.length(); i++) {
            palabra2letras[i] = palabra2.charAt(i);
        }

        for (int i = 0; i < palabra1letras.length; i++) {
            Character letra = palabra1letras[i];
            if (letra.equals(palabra1letras[i])) {
                
            }
        }
        return true;
    }
    public static void main(String[] args) {
        /*
        * 4. (2 puntos) Utilizando las funciones de String, crea la función verificaAnagrama que determina
        * si dos palabras introducidas por teclado, una es un anagrama de la otra, es decir, contiene las
        * mismas letras pero cambiadas de orden. Tendrás que pasarlas a char[], ordenarlas y ver si son
        * iguales. Además, deberás pasar todas las letras a minúscula y antes de comprobar si es anagrama ver
        * los tamaños de ambas palabras. Ejemplos: Amor-roma o nido-oDin son anagrama pero alumnoclase no, por tener tamaño diferentes,
        * ni nido-Oden porque la i no está en Oden.
        */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa una palabras");
        String palabra1 = teclado.nextLine();
        System.out.println("Ingresa otra palabras");
        String palabra2 = teclado.nextLine();
        char palabra1letras[]=new char[palabra1.length()];
        for (int i = 0; i < palabra1.length(); i++) {
            palabra1letras[i] = palabra1.charAt(i);
        }

        char palabra2letras[]=new char[palabra2.length()];
        for (int i = 0; i < palabra2.length(); i++) {
            palabra2letras[i] = palabra2.charAt(i);
        }

        System.out.println("Primera palabra en char");
        for (int i = 0; i < palabra1letras.length; i++) {
            System.out.print(palabra1letras[i]);
            System.out.println(" ");
        }
    }
}
