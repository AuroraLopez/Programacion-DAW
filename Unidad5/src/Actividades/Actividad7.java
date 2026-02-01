package Actividades;

public class Actividad7 {
    public static <T> void imprimirArray(T[] array) {
        for (T elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        /*
         * Realiza un método genérico que intercambie el contenido de
         * dos posiciones indicadas como parámetro
         */
        Double[] numeros={1.0,3.2,5.7,7.2,9.9,2.0,5.1,6.3};
        imprimirArray(numeros);
        intercambiaPos(numeros,1,6 );
        imprimirArray(numeros);
    }

    public static <T> void intercambiaPos(T[] vector, int pos1, int pos2) {
        T aux = vector[pos1];
        vector[pos1] = vector[pos2];
        vector[pos2] = aux;
    }
}
