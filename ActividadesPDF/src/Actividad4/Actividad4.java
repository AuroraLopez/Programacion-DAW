package Actividad4;

public class Actividad4 {
    public static void main(String[] args) {
        /*
        * Crea una clase genérica Caja completa que almacene un valor de cualquier tipo y lo muestre. Por 
        * completa se refiere a que tiene su constructor, métodos get-set y de salida. Haz varias pruebas de su 
        * uso.
        */
        // Caja con Integer
        Caja<Integer> cajaEntero = new Caja<>(10);
        System.out.println(cajaEntero);

        // Caja con String
        Caja<String> cajaTexto = new Caja<>("Hola mundo");
        System.out.println(cajaTexto);

        // Caja con Double
        Caja<Double> cajaDecimal = new Caja<>(3.14);
        System.out.println(cajaDecimal);

        // Modificando el contenido
        cajaTexto.setContenido("Genéricos en Java");
        System.out.println("Nuevo contenido: " + cajaTexto.getContenido());
    }
}
