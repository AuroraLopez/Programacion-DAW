package Actividades.Actividad12;

public class Caballo extends Mamifero{
    private String comida;
    private int ejercicio;


    public Caballo(String nombre, String tipo_alimetacion, int edad, int gestacion, String comida, int ejercicio) {
        super(nombre, tipo_alimetacion, edad, gestacion);
        this.comida = comida;
        this.ejercicio = ejercicio;
    }


    @Override
    public String toString() {
        return "Caballo [nombre=" + nombre + ", gestacion=" + gestacion + ", comida=" + comida + ", tipo_alimetacion="
                + tipo_alimetacion + ", ejercicio=" + ejercicio + ", edad=" + edad + "]";
    }

    
}
