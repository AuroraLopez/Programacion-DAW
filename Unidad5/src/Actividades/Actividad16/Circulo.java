package Actividades.Actividad16;

public class Circulo extends Figura{
    
    final static double PI=3.1415;
    double radio;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return PI*radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2*PI*radio;
    }
}
