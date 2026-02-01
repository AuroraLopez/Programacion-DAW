package Actividad6;

public class Miriapodo extends Invertebrados{

    public Miriapodo(String nombre, String alimentacion) {
        super(nombre, alimentacion);
    }

    @Override
    public String toString() {
        return "Miriapodo [ nombre: "+nombre+" y alimentación: "+alimentacion+"]";
    }
    
}
