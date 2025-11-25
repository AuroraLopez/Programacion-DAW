public class Actividad18 {
    // Función recursiva para hacer la potencia de un numero
    public static double Potencia(int base, int exponente){
        // Condiciones para la repetición
        if(exponente==0){
            return 1;
        }
        else{
            return base*Potencia(base, exponente-1);
        }
        
    }
    public static void main(String[] args) {
        // Tercer ejercicio diapositiva 27
        // Función que calcula a elevado b usando recursividad. Recordad que a elevado a b=a*a elevado a b-1
        System.out.println(Potencia(2,4));
    }
}

