package Lecciones.Herencia.Abstracta;

public class Circulo extends Figura{
    private int radio;
    @Override
    public double calcularArea() {
        return radio*3.14;
    }

    @Override
    public double calcularPerimetro() {
        return 2*3.14*radio;
    }
    
}
