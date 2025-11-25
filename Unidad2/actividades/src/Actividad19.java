public class Actividad19 {
    public static String decimalabinario(int num){
        String cadena="";
            if (num==0) {
                return cadena;
            }
            else{
                return decimalabinario(num / 2) + (num % 2);
            }

        }
        
    
    public static void main(String[] args) {
        // Cuarto ejercicio diapositiva 27
        // Método recursivo para pasar un número decimal, que compruebe que es positivo, y pasarlo a binario mediante sucesivas divisiones por 2.
        int num=24;
        if(num>0){
            System.out.println(decimalabinario(num));
        }
        else{
            System.out.println("No es un número positivo");
        }
    }
}
