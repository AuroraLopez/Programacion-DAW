package Actividades.Actividad16;

public class Rectangulo extends Figura{
    private int ancho;
    private int alto;
    
    public Rectangulo(String nombre, int ancho, int alto) {
        super(nombre);
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double calcularArea() {
        return ancho*alto;
    }

    @Override
    public double calcularPerimetro() {
        return 2*(ancho+alto);
    }
}
