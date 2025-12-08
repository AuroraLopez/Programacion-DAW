package Actividad3D2;

public class Extra {
    private int id;
    private String nombre;
    private String descripcion;

    // Constructores
    public Extra(){

    }

    public Extra(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    // Imprimimos
    @Override
    public String toString() {
        return "Extra [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
    }    
}
