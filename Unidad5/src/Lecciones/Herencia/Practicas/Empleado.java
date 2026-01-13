package Lecciones.Herencia.Practicas;

public class Empleado {
    protected String nombre;
    public Empleado(){

    }
    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + "]";
    }
    
}
