public class Actividad17 {
    public static String decimalabinario(int num){
        String cadena="";
            if (num==0) {
                return cadena;
            }
            else{
                cadena=cadena+num%2;
                decimalabinario(num/2);
            }
            return cadena;

        }
        
    
    public static void main(String[] args) {
        // Método recursivo para pasar un número decimal, que compruebe que es positivo, y pasarlo a binario mediante sucesivas divisiones por 2.
        System.out.println(decimalabinario(24));
    }
}
