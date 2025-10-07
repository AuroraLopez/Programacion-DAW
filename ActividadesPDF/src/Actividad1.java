import java.time.LocalDateTime;

public class Actividad1 {
    public static void main(String[] args) throws Exception {
        /*
         * Escribe un programa que imprima buenos días, buenas tardes y buenas noches según la hora 
         * actual. Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5. (usa LocalDateTime)
         */
        /*
         * PSEUDOCODIGO
         * INICIO
         *   LEER HORA
         *      SI HORA ES DE 6 A 12
         *          IMPRIME BUENOS DIAS
         *      SI HORA ES DE 13 A 20 
         *          IMPRIME BUENAS TARDES
         *      SI HORA ES DE 21 A 5
         *          IMPRIME BUENAS NOCHES
         * FIN 
         */
        LocalDateTime hoy = LocalDateTime.now();
        int hora = hoy.getHour();
        // Variable hora
        //  Primer if para el buenos dias
        if (hora>=6 || hora<=12) {
            System.out.println("Buenos días");
        }
        else if (hora>=13 || hora<=20) {
            System.out.println("Buenas tardes");
        }
        else{
            System.out.println("Buenas noches");
        }
    }
}
