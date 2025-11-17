public class Persona{
    private String nombre;
    private String domicilio;
    private String telefono;

    // Constructor
    public Persona(){

    }
    public Persona(String nombre, String domicilio, String telefono){
        this.domicilio=domicilio;
        this.telefono=telefono;
        this.nombre=nombre;
    }

    //Metodos
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    public String getDomicilio() {
        return domicilio;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTelefono() {
        return telefono;
    }

    // Imprimir
    public void imprimePersona(){
        System.out.println("Se llama "+nombre+" vive en "+domicilio+" y su telefono es: "+telefono);
    }
}