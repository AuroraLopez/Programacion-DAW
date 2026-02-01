package Actividades.Actividad12;

public class Perro extends Mamifero{
    private String raza;

    public Perro(String nombre, String tipo_alimetacion, int edad, int gestacion, String raza) {
        super(nombre, tipo_alimetacion, edad, gestacion);
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro [nombre=" + nombre + ", gestacion=" + gestacion + ", raza=" + raza + ", tipo_alimetacion="
                + tipo_alimetacion + ", edad=" + edad + "]";
    }

    
}
