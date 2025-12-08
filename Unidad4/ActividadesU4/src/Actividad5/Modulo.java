package Actividad5;

public class Modulo {
    private int codigo;
    private String nombre;
    private Profesor profesor;

    // Constructores
    public Modulo(){

    }

    public Modulo(int codigo, String nombre, Profesor profesor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = profesor;
    }

    // Get Nombre  
    public String getNombre() {
        return nombre;
    }

    // Imprimimos
    @Override
    public String toString() {
        return "Modulo [codigo=" + codigo + ", nombre=" + nombre + ", profesor=" + profesor + "]";
    }


}
