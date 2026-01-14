package Lecciones.Herencia.Abstracta;

public class Cuadrado extends Figura{
    private int lado;
    @Override
    public double calcularArea() {
        return lado*lado;
    }

    @Override
    public double calcularPerimetro() {
        return lado*4;
    }
    
}
