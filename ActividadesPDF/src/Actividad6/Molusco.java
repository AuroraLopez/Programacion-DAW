package Actividad6;

public class Molusco extends Invertebrados{

    public Molusco(String nombre, String alimentacion) {
        super(nombre, alimentacion);
    }

    @Override
    public String toString() {
        return "Molusco [ nombre: "+nombre+" y alimentación: "+alimentacion+"]";
    }
    
}
