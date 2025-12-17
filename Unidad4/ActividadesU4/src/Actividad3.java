import Actividad3.Categoria;
import Actividad3.Pieza;
import Actividad3.Proveedor;
import Actividad3.ProveedorSuministraPieza;

public class Actividad3 {
    public static void main(String[] args) {
        /*
        * Crea las clases en JAVA con sus correspondientes
        * constructores y funciones necesarias para mostrar información y
        * modificar los atributos del siguiente diagrama E-R. Categoria, Pieza,
        * Proveedor y Relación N:M (Diapositiva 14)
        */
        // Crear categoria
        Categoria cat=new Categoria(1, "pieza1");
        // Crear proveedor
        Proveedor prove=new Proveedor(1,"avenida","huercal overa","almeria");
        // Crear pieza
        Pieza pieza=new Pieza(1,"Alicates","amarillo", 23.99);
        // Pieza a su categoria
        pieza.setCat(cat);
        System.out.println(pieza.toString());

        // Relación de suministra
        ProveedorSuministraPieza suministro= new ProveedorSuministraPieza(pieza, prove, "17/12/2025", 45);
        System.out.println(suministro.toString());
    }
}
