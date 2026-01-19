package Actividades.Actividad12;

public abstract class Figura {
    protected String nombre;

    public Figura(){

    }

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    @Override
    public String toString() {
        return "Figura [nombre=" + nombre + ", calcularArea()=" + calcularArea() + ", calcularPerimetro()="
                + calcularPerimetro() + "]";
    }
}
