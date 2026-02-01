package Actividad6;

public class Ave extends Mamifero{

    public Ave(String nombre, int numeropatas) {
        super(nombre, numeropatas);
    }

    @Override
    public String toString() {
        return "Ave [ nombre: "+nombre+" y numero de patas: "+numeropatas+"]";
    }
    
}
