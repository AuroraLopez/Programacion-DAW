package Actividad3D1;

public class Producto {
    private int numero;
    private String descripcion;
    private String color;
    private double costo;
    private Fabrica fabrica;

    // Constructores
    public Producto(){

    }

    public Producto(int numero, String descripcion, String color, double costo, Fabrica fabrica) {
        this.numero = numero;
        this.descripcion = descripcion;
        this.color = color;
        this.costo = costo;
        this.fabrica = fabrica;
    }

    // Imprimimos
    @Override
    public String toString() {
        return "Producto [numero=" + numero + ", descripcion=" + descripcion + ", color=" + color + ", costo=" + costo
                + ", fabrica=" + fabrica + "]";
    }
}
