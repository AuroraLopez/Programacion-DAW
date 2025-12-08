package Actividad3D1;

public class Cliente {
    private int codigo;
    private String nombre;
    private String ciudad;
    private Sucursal sucursal;
    private double descuento;
    
    // Constructores
    public Cliente(){

    }

    public Cliente(int codigo, String nombre, String ciudad, Sucursal sucursal, double descuento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.sucursal = sucursal;
        this.descuento = descuento;
    }

    // Imprimimos
    @Override
    public String toString() {
        return "Cliente [codigo=" + codigo + ", nombre=" + nombre + ", ciudad=" + ciudad + ", sucursal=" + sucursal
                + ", descuento=" + descuento + "]";
    }  
}
