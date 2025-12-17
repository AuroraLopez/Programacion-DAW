import Actividad4.Ejemplar;
import Actividad4.Empleado;
import Actividad4.Periodista;
import Actividad4.Periodista_escribe_Revista;
import Actividad4.Revista;
import Actividad4.Seccion;
import Actividad4.Sucursal;
import Actividad4.Sucursal_publica_Revista;

public class Actividad4 {
    public static void main(String[] args) {
        /*
        * Crea las clases en JAVA con sus correspondientes
        * constructores y funciones necesarias para mostrar información y
        * modificar los atributos del siguiente diagrama E-R.
        * Sucursal, Empleado, Revista, Periodista, Sección, Ejemplar
        * (Diapositiva15)
        */
       
        Sucursal sucursal=new Sucursal(1, "Almeria", "Huércla-Overa", "987654321", "calle granada numero 24");
        Empleado empleado = new Empleado(1, "123655544", "Martin", "Morata", "Garcia", 987654321, sucursal);
        Revista revista= new Revista(24, "Hola", "entretenidas", "semanal");
        Revista revista2= new Revista(26, "ABC", "peridico", "semanal");
        Periodista periodista= new Periodista(1, "pepito", "gonzales", "gimenez", 321654987, "informativo");
        Seccion seccion=new Seccion(revista, "Juegos", "media hoja");
        Ejemplar ejemplar=new Ejemplar(revista, "02/12/2025", 36, 250);

        System.out.println("");
        System.out.println(empleado.toString());
        System.out.println("");
        System.out.println(seccion.toString());
        System.out.println("");
        System.out.println(ejemplar.toString());
        System.out.println("");

        Sucursal_publica_Revista publicar=new Sucursal_publica_Revista(sucursal, revista);
        Periodista_escribe_Revista escrito=new Periodista_escribe_Revista(revista2, periodista);
        System.out.println(publicar.toString());
        System.out.println("");
        System.out.println(escrito.toString());
        System.out.println("");
    }
}
