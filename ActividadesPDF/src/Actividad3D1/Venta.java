package Actividad3D1;

public class Venta {
    private Sucursal sucursal;
    private Producto producto;
    private double precioVenta;

    // Constructor
    public Venta() {

    }

    public Venta(Sucursal sucursal, Producto producto, double precioVenta) {
        this.sucursal = sucursal;
        this.producto = producto;
        this.precioVenta = precioVenta;
    }

    // Imprimimos
    @Override
    public String toString() {
        return "Venta [sucursal=" + sucursal + ", producto=" + producto + ", precioVenta=" + precioVenta + "]";
    }

}
