package Actividades.Actividad7;

public class Animal {
    protected String nombre;
    protected String tipo_alimetacion;
    protected int edad;

    public Animal(){

    }

    public Animal(String nombre, String tipo_alimetacion, int edad) {
        this.nombre = nombre;
        this.tipo_alimetacion = tipo_alimetacion;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_alimetacion() {
        return tipo_alimetacion;
    }

    public void setTipo_alimetacion(String tipo_alimetacion) {
        this.tipo_alimetacion = tipo_alimetacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Animal [nombre=" + nombre + ", tipo_alimetacion=" + tipo_alimetacion + ", edad=" + edad;
    }

    
    
}
