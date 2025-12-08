import Actividad3D2.Venta;
import Actividad3D2.Cliente;
import Actividad3D2.CocheNuevo;
import Actividad3D2.CocheNuevo_Extra;
import Actividad3D2.CocheUsado;
import Actividad3D2.Extra;
import Actividad3D2.Marca;
import Actividad3D2.Modelo;
import Actividad3D2.Vendedor;
import Actividad3D2.VersionCoche;
import Actividad3D2.Version_Extra;

public class Actividad3D2 {
    public static void main(String[] args) {
        /*
         * Crea el proyecto que tenga las clases equivalentes de los siguientes diagramas E-R. En la clase 
         * que incluya main puedes crear cada objeto con los valores que quieras pero tiene que verse la 
         * relación entre ellas y su funcionamiento
         * Segundo diagrama
         */

        Marca mar1 = new Marca(1, "Honda");
        Modelo mod1 = new Modelo(1, "NSX", mar1);
        VersionCoche ver1 = new VersionCoche(1, "Super deportivo", "270 Caballos",200000, "Gasolina", mod1);
        Extra extra1 = new Extra(1, "Asientos calefactables", "Asientos calefactables para la comodidad del conductor y los psajeros");
        CocheNuevo cocheN1 = new CocheNuevo(1, "3456 PLF", ver1);
        Cliente cli1 = new Cliente(1, "Pedro", "Lopez", "Sánchez", "Calle Mayor 14", 654789123);
        CocheUsado cocheU1 = new CocheUsado(1, "8792 GHT", "9358 MNW", 12500, cli1, mod1);
        Vendedor ven1 = new Vendedor(1, "Juan", "Ramírez", "Díaz", "Plaza Nueva 5", 611223344);
        
        // Relaciones
        Venta vent1 = new Venta(cli1, ven1, cocheN1, "12/02/2025");
        Version_Extra verext1= new Version_Extra(ver1, extra1, 250000);
        CocheNuevo_Extra cochext1= new CocheNuevo_Extra(extra1, cocheN1);

        // Imprimimos
        System.out.println(vent1.toString());
        System.out.println("");
        System.out.println(verext1.toString());
        System.out.println("");
        System.out.println(cochext1.toString());
        System.out.println("");
        System.out.println(cocheU1.toString());
        System.out.println("");

    }
}
