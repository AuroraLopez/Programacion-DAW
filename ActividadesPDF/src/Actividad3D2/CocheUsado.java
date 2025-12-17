package Actividad3D2;

public class CocheUsado {
    private int id;
    private String nombre;
    private String matricula;
    private double precio_tasacion;
    private Cliente cliente;
    private Modelo modelo;

    // Constructores
    public CocheUsado(){

    }

    public CocheUsado(int id, String nombre, String matricula, double precio_tasacion, Cliente cliente, Modelo modelo) {
        this.id = id;
        this.nombre = nombre;
        this.matricula = matricula;
        this.precio_tasacion = precio_tasacion;
        this.cliente = cliente;
        this.modelo = modelo;
    }

    // Imprimimos
    @Override
    public String toString() {
        return "CocheUsado [id=" + id + ", nombre=" + nombre + ", matricula=" + matricula + ", precio_tasacion="
                + precio_tasacion + ", cliente=" + cliente + ", modelo=" + modelo + "]";
    }
}
