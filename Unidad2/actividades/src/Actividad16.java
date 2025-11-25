public class Actividad16 {
    // Función iterativa para ver cuantos digitos tiene el número introducido
    public static int numeroDigitos(int n){
        int contador=0;
        while (n>0) {
            n=n/10;
            contador++;
        }
        return contador;
    }
    // Función recursiva para ver cuantos digitos tiene el número introducido
    public static int numeroDigitosRecursivo(int n){
        if (n>=0 && n<10) {//Caso base
            return 1;
        }
        else{
            return 1+numeroDigitosRecursivo(n/10);
        }
    }
    public static void main(String[] args) {
        // Primer ejercicio diapositiva 27
        //Función que devuelve la cantidad de dígitos de un número positivo
        int numero=234;
        // Imprime resultados
        System.out.println("El primer número tiene: "+numeroDigitos(234567)+" dígitos");
        System.out.println("El número tiene: "+numeroDigitosRecursivo(numero)+" dígitos");
}
}
