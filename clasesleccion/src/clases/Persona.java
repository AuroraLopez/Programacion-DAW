package clases;

public class Persona {
    private String nombre;
    private String DNI;
    private String direccion;
    private String genero;
    private String estado_civil;
    private String fecha;

    public Persona() {

    }
    public Persona(String nombre, String DNI, String direccion, String genero,  String estado_civil, String fecha) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.direccion = direccion;
        this.genero = genero;
        this.estado_civil = estado_civil;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public void imprimePersona(){
        System.out.println("Imprime persona");
    }
}
