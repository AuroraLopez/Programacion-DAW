package Actividad6;

public class Reptil extends Mamifero{

    public Reptil(String nombre, int numeropatas) {
        super(nombre, numeropatas);
    }

    @Override
    public String toString() {
        return "Reptil [ nombre: "+nombre+" y numero de patas: "+numeropatas+"]";
    }
    
}
