package Actividad3D2;

public class Marca {
    private int id;
    private String nombre;

    // Constructores
    public Marca(){

    }

    public Marca(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // Imprimimos
    @Override
    public String toString() {
        return "Marca [id=" + id + ", nombre=" + nombre + "]";
    }
}
