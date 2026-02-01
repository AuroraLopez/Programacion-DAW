package Actividades;

public class Actividad8 {
    public static void main(String[] args) {
        /*
        * Realiza un método genérico que localiza un elemento a
        * buscar en el array o devuelva -1 si no lo encuentra
        */
        Double[] numeros={1.0,3.2,5.7,7.2,9.9,2.0,5.1,6.3};
        System.out.println("Está en la posición: "+buscarArray(numeros, 1));
    }
    public static <T> Integer buscarArray(T[] array,T valor) {
        int pos=0;
        for (T s : array) {   
            if(s.equals(valor))
                return pos;
            pos++;
        }
        return -1;
    }
}
