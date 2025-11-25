import Prueba.Matematicas;
import Prueba.Persona;

public class Actividad1 {
    public static void main(String[] args) {
        Persona p = new Persona("Aurora",22);
        p.imprimePersona();

        double a=4;
        double b=5;

        System.out.println( Matematicas.suma(a, b) );

        //Ya no se puede acceder p.nombre <- porque el atributo no es visible externo
        //por defecto es privado
        //al no ser el mismo archivo con clase ya no es accesible
        System.out.println( p.getNombre() );
    }
}
