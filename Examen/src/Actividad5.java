public class Actividad5 {
    public static void imprimeTablero(boolean valor){
        if (valor==true) {
            System.out.println("|   |   |   |   |   |   |   |");
            System.out.println("|   |   |   |   |   |   |   |");
            System.out.println("|   |   | X |   |   |   |   |");
            System.out.println("|   |   | 0 | X |   |   |   |");
            System.out.println("|   | X | 0 | 0 |   |   |   |");
            System.out.println("| X | 0 | X | 0 | X |   |   |");
            System.out.println("-----------------------------");
            System.out.println("  0   1   2   3   4   5  6");
        }
        else{
            System.out.println("| X | 0 | X |");
            System.out.println("|   | 0 |   |");
            System.out.println("|   | X |   |");
            System.out.println("  0   1   2  ");
        }
    }
    public static void main(String[] args) {
        /*
         * Escribe un procedimiento que genere la siguiente salida para el juego 4 en raya y 3 en 
         * raya. No tienes que programar nada del juego, sólo mostrar estos ejemplos de salida al llamar a
         * imprimeTablero(valor); Si el valor es true mostrará la primera salida y si el valor es false mostrará
         * la otra.
         */
        boolean valor=false;
        imprimeTablero(valor);
    }
}
