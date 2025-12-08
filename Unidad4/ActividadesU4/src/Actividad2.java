import Actividad2.Ciudad;
import Actividad2.Fecha;
import Actividad2.Persona;

public class Actividad2 {
    public static void main(String[] args) {
        /*
         * Crea las clases en JAVA con sus correspondientes
         * constructores y funciones necesarias para mostrar información y
         * modificar los atributos del siguiente diagrama de clases. Persona, Fecha y
         * Ciudad (Diapositiva 13)
         */

        Fecha fechaNacimiento = new Fecha(16, 02, 2003);
        Ciudad ciudadnatal = new Ciudad(04200, "St. Maria de Nieva", 2);
        Ciudad ciudadresidencia = new Ciudad(04600, "Huércal-Overa", 4);
        Persona persona = new Persona("23763829834K", "Aurora", "López Fuentes", 'f', fechaNacimiento, ciudadnatal,
                ciudadresidencia);

        System.out.println(persona.toString());
    }
}