package Actividad3D2;

public class Cliente {
    private int id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String direccion;
    private long telefono;

    // Constructores
    public Cliente(){

    }

    public Cliente(int id, String nombre, String apellido1, String apellido2, String direccion, long telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // Imprimimos
    @Override
    public String toString() {
        return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
                + ", direccion=" + direccion + ", telefono=" + telefono + "]";
    }
}
