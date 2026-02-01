package Actividad6;

public class Equinodermo extends Invertebrados{

    public Equinodermo(String nombre, String alimentacion) {
        super(nombre, alimentacion);
    }

    @Override
    public String toString() {
        return "Equinodermo [ nombre: "+nombre+" y alimentación: "+alimentacion+"]";
    }
    
}
