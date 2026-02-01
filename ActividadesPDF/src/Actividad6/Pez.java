package Actividad6;

public class Pez extends Vertebrados{

    public Pez(String nombre, int numeropatas) {
        super(nombre, numeropatas);
    }

    @Override
    public String toString() {
        return "Pez [ nombre: "+nombre+" y numero de patas: "+numeropatas+"]";
    }
    
}
