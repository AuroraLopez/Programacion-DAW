package Actividad4;

public class Sucursal {
    private int codigo;
    private String provincia;
    private String ciudad;
    private String telefono;
    private String direccion;

    // Constructor
    public Sucursal(){

    }

    public Sucursal(int codigo, String provincia, String ciudad, String telefono, String direccion) {
        this.codigo = codigo;
        this.provincia = provincia;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Sucursal [codigo=" + codigo + ", provincia=" + provincia + ", ciudad=" + ciudad + ", telefono="
                + telefono + ", direccion=" + direccion + "]";
    }
    
    
}
