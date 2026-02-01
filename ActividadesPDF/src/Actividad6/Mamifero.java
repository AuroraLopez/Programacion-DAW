package Actividad6;

public class Mamifero extends Vertebrados{

    public Mamifero(String nombre, int numeropatas) {
        super(nombre, numeropatas);
    }

    @Override
    public String toString() {
        return "Mamifero [ nombre: "+nombre+" y numero de patas: "+numeropatas+"]";
    }
  
}
