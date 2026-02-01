package Actividades.Actividad12;

public class Mamifero extends Animal{
    protected int gestacion;

    public Mamifero(int gestacion) {
        this.gestacion = gestacion;
    }

    public Mamifero(String nombre, String tipo_alimetacion, int edad, int gestacion) {
        super(nombre, tipo_alimetacion, edad);
        this.gestacion = gestacion;
    }

    @Override
    public String toString() {
        return "Mamifero [nombre=" + nombre + ", gestacion=" + gestacion + ", tipo_alimetacion=" + tipo_alimetacion
                + ", edad=" + edad + "]";
    }
    
}
