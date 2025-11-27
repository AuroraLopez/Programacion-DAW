import Actividad1.Pais;

public class Actividad1 {
    public static void main(String[] args) throws Exception {
        /*
        *  Crea una clase llamada País que tenga los parámetros (nombre, población, PIB), el constructor
        *  con parámetros, los correspondientes getter y setters y un método que devuelva el PIB per cápita,
        *  calculado como el PIB*100000 dividido por la población. En main haz uso de estas funciones.
        */

        Pais España = new Pais("España", 50000, 1500000);
        System.out.println(España);
    }
}
