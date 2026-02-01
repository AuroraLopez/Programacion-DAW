package Actividad6;

public class Invertebrados extends Animales{
    protected String alimentacion;

    public Invertebrados(String nombre, String alimentacion) {
        super(nombre);
        this.alimentacion = alimentacion;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    @Override
    public String toString() {
        return "Invertebrados [nombre=" + nombre + ", alimentacion=" + alimentacion + "]";
    }

}
