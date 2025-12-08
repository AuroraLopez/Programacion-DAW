package Actividad6;

public class Hotel {
    private int id;
    private String nombre;
    private String direccion;
    private String telefono;
    private int plazas;
    private String ciudad;

    // Constructores
    public Hotel(){

    }
    public Hotel(int id, String nombre, String direccion, String telefono, String ciudad, int plazas) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.plazas = plazas;
        this.ciudad = ciudad;
    }

    // Metodos

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    // Imprimimos hotel
    public void imprimeHotel(){
        System.out.println("Id: "+id);
        System.out.println("Nombre: "+nombre);
        System.out.println("Direccion: "+direccion);
        System.out.println("Telefono: "+telefono);
        System.out.println("Plazas: "+plazas);
        System.out.println("Ciudad: "+ciudad);
    }
}
