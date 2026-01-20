package Actividades.Tarea2;

public class Propietario extends Persona{
    private String direccion;

    public Propietario(String dNI, String nombre, String pape, String direccion) {
        super(dNI, nombre, pape);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public void identificarse() {
        super.identificarse();
        System.out.println("Soy Propietario y esta es mi direccion: "+ direccion);
    }

    
}
