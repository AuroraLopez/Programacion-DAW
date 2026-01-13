package Lecciones.Herencia.Practicas;

public class Tecnico extends Empleado {
    
    public Tecnico() {
    }

    public Tecnico(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        
        return super.toString()+"Tecnico []";
    }
}
