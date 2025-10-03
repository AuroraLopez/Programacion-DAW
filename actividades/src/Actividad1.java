public class Actividad1 {
    public static void main(String[] args) throws Exception {
        // Actividad tema 2 diapositiva 9
        // Realiza un programa que genera 2 números y nos diga el cociente, la media, la potencia y la raíz cuadrada. Usa tipos adecuados
        /*
         * Pseudocodigo
         * INICIO
         *      GENERAR NUM1 ALEATORIO
         *      GENERAR NUM2 ALEATORIO
         *      HACER CUENTAS (CONCIENTE, MEDIA, POTENCIA Y RAIZ CUADRADA)
         *      IMPRIMIR COCIENTE , MEDIA, POTENCIA Y RAIZ DE CADA NUMERO
         * FIN
         */
        // Poner MÁXIMOS Y MINIMOS
        int max=50;
        int min=1;
        
        // Numeros randoms
        int num1=(int)(Math.random()*(max-min+1))+min;
        int num2=(int)(Math.random()*(max-min+1))+min;
        // Hacer las cuentas
        double cociente=num1/(double)num2;
        double media=(num1+num2)/2.0;
        double potencia=Math.pow(num1,num2);
        double raiz=Math.sqrt(num1);
        double raiz2=Math.sqrt(num2);
        // Imprimir resultados
        System.out.println("Los números generados son: "+num1+" y "+num2);
        System.out.println("El cociente es: " +cociente);
        System.out.println("La media es: " +media);
        System.out.println("La potencia es: " +potencia);
        System.out.println("La raíz del primer numero es :" +raiz);
        System.out.println("La raíz del segundo numero es :" +raiz2);
    }   
}
