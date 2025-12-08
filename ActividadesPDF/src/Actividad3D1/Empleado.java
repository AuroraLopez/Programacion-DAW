package Actividad3D1;

public class Empleado {
    private String legajo;
    private String DNI;
    private String nombre;
    private String domicilio;
    private long telefono;

    // Constructores
    public Empleado(){

    }

    public Empleado(String legajo, String dNI, String nombre, String domicilio, long telefono) {
        this.legajo = legajo;
        DNI = dNI;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    // Imprimimos
    @Override
    public String toString() {
        return "Empleado [legajo=" + legajo + ", DNI=" + DNI + ", nombre=" + nombre + ", domicilio=" + domicilio
                + ", telefono=" + telefono + "]";
    }
}
