package Actividad6;

public class Aracnido extends Invertebrados{

    public Aracnido(String nombre, String alimentacion) {
        super(nombre, alimentacion);
    }

    @Override
    public String toString() {
        return "Aracnido [ nombre: "+nombre+" y alimentación: "+alimentacion+"]";
    }
    
}
