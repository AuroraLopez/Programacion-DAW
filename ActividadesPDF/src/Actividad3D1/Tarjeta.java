package Actividad3D1;

public class Tarjeta {
    private int numero;
    private String nombre;
    private int codigo;
    private String fechaVenc;
    private Cliente cliente;

    // Constructores
    public Tarjeta(){

    }

    public Tarjeta(int numero, String nombre, int codigo, String fechaVenc, Cliente cliente) {
        this.numero = numero;
        this.nombre = nombre;
        this.codigo = codigo;
        this.fechaVenc = fechaVenc;
        this.cliente = cliente;
    }

    // Imprimimos
    @Override
    public String toString() {
        return "Tarjeta [numero=" + numero + ", nombre=" + nombre + ", codigo=" + codigo + ", fechaVenc=" + fechaVenc
                + ", cliente=" + cliente + "]";
    }
}
