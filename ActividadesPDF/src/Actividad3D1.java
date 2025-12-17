import Actividad3D1.Cliente;
import Actividad3D1.Empleado;
import Actividad3D1.Fabrica;
import Actividad3D1.Producto;
import Actividad3D1.Sucursal;
import Actividad3D1.Sucursal_Empleado;
import Actividad3D1.Tarjeta;
import Actividad3D1.Venta;

public class Actividad3D1 {
    public static void main(String[] args) {
        /*
         * Crea el proyecto que tenga las clases equivalentes de los siguientes diagramas E-R. En la clase 
         * que incluya main puedes crear cada objeto con los valores que quieras pero tiene que verse la 
         * relación entre ellas y su funcionamiento
         * Primer diagrama
         */

        Fabrica fabr=new Fabrica(316545845, "coches S.L", "España", "Mateo", 52);
        Producto prd=new Producto(24, "Coche tuneado para carreras", "rojo", 2456.32, fabr); // Producto tiene relación con la fabrica
        Sucursal src1=new Sucursal(3, "Calle cualquiera numero 56", "Almeria");
        Empleado emp1= new Empleado("189234772947824", "62156489P", "Petito", "Calle cualquier piso 56 1b", 321654987);
        Cliente cli1=new Cliente(1, "Mateo", "Almeria", src1, 0.20); // Cliente tiene relación con sucursal
        Tarjeta tar1=new Tarjeta(1, "TarjetaMateo", 32, "27/02/2026", cli1); // Tarjeta tiene relación con cliente
        Venta vent1=new Venta(src1, prd, 2450.52);
        Sucursal_Empleado SrcEmp= new Sucursal_Empleado(src1, emp1, "Mañanas", 2);

        // Conexión de tarjeta y cliente:
        System.out.println(tar1.toString());

        // Conexión de sucursal y producto:
        System.out.println("Relación de sucursal y producto");
        System.out.println(vent1.toString());
        // Conexión entre Sucursal y empleado
        System.out.println("Relación de sucursal y empleado");
        System.out.println(SrcEmp.toString());
    }
}
