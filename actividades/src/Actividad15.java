public class Actividad15 {
    public static int SumaNum(int n){
        int suma=0;
        for(int i=1; i<=n; i++){
            suma+=i;
        }
        return suma;
    }
    public static int SumaNumReiterativo(int n){
        if (n==1) {
            return 1;
         }
         else{
             return n+SumaNumReiterativo(n-1);
         }
    }
    public static void main(String[] args) {
        // Función que devuelve la suma de los números naturales desde 1 hasta N. Compara el código con el que se obtendría iterativo.
        System.out.println(SumaNum(12));
        System.out.println(SumaNumReiterativo(12));
    }
}
