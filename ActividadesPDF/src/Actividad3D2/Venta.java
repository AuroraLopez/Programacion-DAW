package Actividad3D2;

public class Venta {
    private Cliente cliente;
    private Vendedor vendedor;
    private CocheNuevo cochenuevo;
    private String fecha;

    // Constructores
    public Venta(){

    }

    public Venta(Cliente cliente, Vendedor vendedor, CocheNuevo cochenuevo, String fecha) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.cochenuevo = cochenuevo;
        this.fecha= fecha;
    }

    // Imprimimos
    @Override
    public String toString() {
        return "Venta [cliente=" + cliente + ", vendedor=" + vendedor + ", cochenuevo=" + cochenuevo + ", fecha=" + fecha +"]";
    }
}
