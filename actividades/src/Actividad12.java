public class Actividad12 {
    public static void main(String[] args) {
        // EJERCICIO DIAPOSITIVA 19 UNIDAD 2
        // Desarrolla el programa que muestra las tablas de multiplicar del 1 al 10.
        /*
         * PSEUDOCODIGO
         * INICIO PROGRAMA
         *      BUCLE PARA NUMEROS QUE MULTIPLICAR
         *      BUCLE PARA MULTIPLICAR UN NUMERO 10 VECES
         *      ESCRIBE RESULTADOS
         * FIN
         */

        // Primer bucle para ir incrementado la tabla que se dirá
        for(int num=1; num<=10; num++){
            System.out.println("***Tabla del "+num+"***");
            //Segundo bucle para multiplicar el anterior por todos los numeros hasta 10
            for(int nummul=0; nummul<=10; nummul++){
                System.out.println(num+"x"+nummul+"="+num*nummul);
            }
            System.out.println("");
        }
    }
}
