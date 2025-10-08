public class Actividad16 {
    public static double Potencia(int base, int exponente){
        if(exponente==0){
            return 1;
        }
        else{
            return base*Potencia(base, exponente-1);
        }
        
    }
    public static void main(String[] args) {
        // Función que calcula a elevado b usando recursividad. Recordad que a elevado a b=a*a elevado a b-1
        System.out.println(Potencia(2,4));
    }
}

