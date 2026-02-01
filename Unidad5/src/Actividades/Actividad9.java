package Actividades;

public class Actividad9 {
    public static void main(String[] args) {
        /*
         * Realiza un método genérico que devuelve el máximo de dos
         * valores
         */
        int num1 = 20;
        int num2 = 30;
        System.out.println("El máximo entre " + num1 + " y " + num2 + " es: " + maximoValor(20, 30));
    }

    public static <T extends Comparable<T>> T maximoValor(T valor1, T valor2) {
        if (valor1.compareTo(valor2) > 0)
            return valor1;
        else
            return valor2;
    }
}
