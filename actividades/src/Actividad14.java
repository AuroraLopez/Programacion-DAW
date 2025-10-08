public class Actividad14 {
    public static int numeroDigitos(int n){
        int contador=0;
        while (n>0) {
            n=n/10;
            contador++;
        }
        return contador;
    }

    public static int numeroDigitosRecursivo(int n){
        if (n>=0 && n<10) {//Caso base
            return 1;
        }
        else{
            return 1+numeroDigitosRecursivo(n/10);
        }
    }
    public static void main(String[] args) {
        int numero=234;
        //Función que devuelve la cantidad de dígitos de un número positivo
        System.out.println(numeroDigitos(234567));
        System.out.println(numeroDigitosRecursivo(numero));
}
}
