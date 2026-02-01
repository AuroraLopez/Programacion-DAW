package Actividades.Tarea2;

public class Persona implements Identificacion{
    private String DNI;
    private String nombre;
    private String pape;

    public Persona(){

    }

    public Persona(String dNI, String nombre, String pape) {
        DNI = dNI;
        this.nombre = nombre;
        this.pape = pape;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPape() {
        return pape;
    }

    public void setPape(String pape) {
        this.pape = pape;
    }

    @Override
    public void identificarse() {
        System.out.println("Hola soy "+nombre+" "+pape+" y mi DNI es "+DNI);
    }
    
    
}
