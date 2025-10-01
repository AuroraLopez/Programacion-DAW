public class Actividad5 {
    public static void main(String[] args) {
        //Desarrolla un programa que muestre los números entre 50 y 200 que son múltiplos de 2 y 3
        /*
         * PSEUDOCODIGO
         * INICIO
         *      VARIABLE NUMERO
         *      IF QUE COMPRUEBE MULTIPLOS
         *      BUCLES
         *      IMPRIME RESULTADO
         * FIN
        */
        for(int num=50;num<=200;num++){
            if (num%2==0 && num%3==0){
                System.out.println(num);
            }
        }
    }
}
