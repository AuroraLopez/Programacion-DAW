package Actividad4;

public class Periodista {
    private int id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private long telefono;
    private String especialidad;

    // Constructor
    public Periodista(){

    }

    public Periodista(int id, String nombre, String apellido1, String apellido2, long telefono, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.telefono = telefono;
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Periodista [id=" + id + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
                + ", telefono=" + telefono + ", especialidad=" + especialidad + "]";
    }

    
    
}
