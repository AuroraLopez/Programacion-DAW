package Actividad3D2;

public class Modelo {
    private int id;
    private String nombre;
    private Marca marca;

    // Constructores
    public Modelo(){

    }

    public Modelo(int id, String nombre, Marca marca) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
    }

    // Imprimimos
    @Override
    public String toString() {
        return "Modelo [id=" + id + ", nombre=" + nombre + ", marca=" + marca + "]";
    }
}
