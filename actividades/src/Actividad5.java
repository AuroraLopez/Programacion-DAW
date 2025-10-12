public class Actividad5 {
    public static void main(String[] args) {
        // // EJERCICIO 1 DIAPOSITIVA 16
        //Desarrolla un programa que muestre los números entre 50 y 200 que son múltiplos de 2 y 3
        /*
         * PSEUDOCODIGO
         * INICIO
         *      VARIABLE NUMERO
         *      INICIO_BUCLES
         *          IF QUE COMPRUEBE MULTIPLOS
         *      IMPRIME RESULTADO
         * FIN
        */
        // Bucle que vaya usando todos los numeros en ese rango
        for(int num=50;num<=200;num++){
            // Condición para saber si son múltiplos
            if (num%2==0 && num%3==0){
                System.out.println(num);
            }
        }
    }
}
