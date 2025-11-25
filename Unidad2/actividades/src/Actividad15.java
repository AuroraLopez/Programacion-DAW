public class Actividad15 {
    // Primera función para saber si es par
    public static int esPar(int num){
        if (num%2==0) {
            return num;
        }
        else{
            return 0;
        }
    }
    // Segunda función para saber si es divisible entre 3
    public static int esDivisible3(int num){
        if (num%3==0) {
            return num;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        // Segunda actividad diapositiva 24
        /*
         * Crear las funciones esPar, esDivisible3 y un 
         * procedimiento para imprimir los números pares divisibles por 3 que
         * hay entre 1 y 20
         */
        // Bucle que pasa por todos los numeros del uno al 10 para comprobar ambas funciones
        for(int i=1; i<=10; i++){
            // Condición para ver cual coincide en ambas funciones
            if (esPar(i)!=0 && esDivisible3(i)!=0) {
                System.out.println(i);
            }
        }
    }
}
