package Actividad6;

public class Anfibio extends Vertebrados{

    public Anfibio(String nombre, int numeropatas) {
        super(nombre, numeropatas);
    }

    @Override
    public String toString() {
        return "Anfibio [ nombre: "+nombre+" y numero de patas: "+numeropatas+"]";
    }
}
