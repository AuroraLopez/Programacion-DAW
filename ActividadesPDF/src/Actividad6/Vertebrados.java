package Actividad6;

public class Vertebrados extends Animales{
    protected int numeropatas;

    public Vertebrados(String nombre, int numeropatas) {
        super(nombre);
        this.numeropatas = numeropatas;
    }

    public int getNumeropatas() {
        return numeropatas;
    }

    public void setNumeropatas(int numeropatas) {
        this.numeropatas = numeropatas;
    }

    @Override
    public String toString() {
        return "Vertebrados [nombre=" + nombre + ", numeropatas=" + numeropatas + "]";
    }
    
}
