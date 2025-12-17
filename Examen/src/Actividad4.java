public class Actividad4 {
    public static void main(String[] args) {
        /*
         * Utilizando las funciones de String, realiza una función que comprueba si una
         * palabra
         * tiene las 5 vocales. Tendrás que pasar la palabra a minúscula y sustituir las
         * letras que tienen tilde
         * por las que no previamente. Ejemplo: Murciélago.
         * 
         */

        int contadorvocales=0;
        String palabra="Murciélago";
        String palabraminuscula= palabra.toLowerCase();
        String palabrasintilde=palabraminuscula;
        if (palabraminuscula.contains("á")) {
            palabrasintilde=palabraminuscula.replace("á", "a");
        }
        else if (palabraminuscula.contains("é")) {
            palabrasintilde=palabraminuscula.replace("é", "e");
        }
        else if (palabraminuscula.contains("í")) {
            palabrasintilde=palabraminuscula.replace("í", "i");
        }
        else if (palabraminuscula.contains("ó")) {
            palabrasintilde=palabraminuscula.replace("ó", "o");
        }
        else if (palabraminuscula.contains("ú")) {
            palabrasintilde=palabraminuscula.replace("ú", "u");
        }

        System.out.println(palabrasintilde);
        for (int i = 0; i < palabrasintilde.length(); i++) {
            if (palabrasintilde.charAt(i)=='a' || palabrasintilde.charAt(i)=='e' || palabrasintilde.charAt(i)=='i' || palabrasintilde.charAt(i)=='o' || palabrasintilde.charAt(i)=='u') {
                contadorvocales++;
            }
        }
        if (contadorvocales==5) {
            System.out.println("Tiene 5 vocales");
        }
        else{
            System.out.println("Esta palabra contiene: "+contadorvocales+" vocales no 5");
        }
        

    }
}
