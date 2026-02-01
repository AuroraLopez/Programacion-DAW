package Actividades.Actividad12;

public class Gato extends Mamifero{
    private String pedigri;

    public Gato(String nombre, String tipo_alimetacion, int edad, int gestacion, String pedigri) {
        super(nombre, tipo_alimetacion, edad, gestacion);
        this.pedigri = pedigri;
    }

    @Override
    public String toString() {
        return "Gato [nombre=" + nombre + ", gestacion=" + gestacion + ", pedigri=" + pedigri + ", tipo_alimetacion="
                + tipo_alimetacion + ", edad=" + edad + "]";
    }

    
}
