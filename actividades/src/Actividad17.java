public class Actividad17 {
    // Función para hacer la suma de los numeros de forma iterativa
    public static int SumaNum(int n){
        int suma=0;
        // Bucle para sumar los numero desde 1 hasta el n, uno por uno.
        for(int i=1; i<=n; i++){
            suma+=i;
        }
        return suma;
    }
    // Función para hacer la suma de los numeros de forma recursiva
    public static int SumaNumReiterativo(int n){
        // Colocamos las condiciones 
        if (n==1) {
            return 1;
         }
         else{
             return n+SumaNumReiterativo(n-1);
         }
    }
    public static void main(String[] args) {
        // Segundo ejercicio diapositiva 27
        // Función que devuelve la suma de los números naturales desde 1 hasta N. Compara el código con el que se obtendría iterativo.
        // Imprime resultados
        System.out.println(SumaNum(12));
        System.out.println(SumaNumReiterativo(12));
    }
}
