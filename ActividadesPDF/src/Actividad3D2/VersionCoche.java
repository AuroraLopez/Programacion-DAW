package Actividad3D2;

public class VersionCoche {
    private int id;
    private String nombre;
    private String potencia;
    private double precio_base;
    private String tipo_combustible;
    private Modelo modelo;

    // Constructores
    public VersionCoche(){

    }

    public VersionCoche(int id, String nombre, String potencia, double precio_base, String tipo_combustible, Modelo modelo) {
        this.id = id;
        this.nombre = nombre;
        this.potencia = potencia;
        this.precio_base = precio_base;
        this.tipo_combustible = tipo_combustible;
        this.modelo = modelo;
    }

    // Imprimimos
    @Override
    public String toString() {
        return "Version [id=" + id + ", nombre=" + nombre + ", potencia=" + potencia + ", precio_base=" + precio_base
                + ", tipo_combustible=" + tipo_combustible + ", modelo=" + modelo + "]";
    }
}
