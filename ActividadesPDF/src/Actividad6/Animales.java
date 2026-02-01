package Actividad6;

public class Animales {
    protected String nombre;

    public Animales(){

    }

    public Animales(String nombre) {
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
        return "Animales [nombre=" + nombre + "]";
    }
}
