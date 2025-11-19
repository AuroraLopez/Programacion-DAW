package clases;

public class Surcusal {
    private int id;
    private String direccion;
    private String telefono;
    private String ciudad;
    private String provincia;

    // Constructor
    public Surcusal() {

    }

    public Surcusal(int id, String direccion, String telefono, String provincia, String ciudad) {
        this.id = id;
        this.direccion = direccion;
        this.telefono = telefono;
        this.provincia = provincia;
        this.ciudad = ciudad;
    }

    // Metodos

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    // Imprimimos
    public void imprimeSucursal(){
        System.out.println("Id: "+id);
        System.out.println("Direccion: "+direccion);
        System.out.println("Telefono: "+telefono);
        System.out.println("Provincia: "+provincia);
        System.out.println("Ciudad: "+ciudad);
    }
}
