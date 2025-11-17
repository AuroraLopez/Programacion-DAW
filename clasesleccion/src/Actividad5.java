import clases.Categoria;
import clases.Pieza;
import clases.Proveedor;
import clases.ProveedorSuministraPieza;

public class Actividad5 {
    public static void main(String[] args) {
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
