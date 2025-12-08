package Actividad4;

public class Empleado {
    private int id;
    private String nif;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private long telefono;
    private Sucursal sucursal;

    // Constructor
    public Empleado(){

    }

    public Empleado(int id, String nif, String nombre, String apellido1, String apellido2, long telefono,
            Sucursal sucursal) {
        this.id = id;
        this.nif = nif;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.telefono = telefono;
        this.sucursal = sucursal;
    }

    @Override
    public String toString() {
        return "Empleado [id=" + id + ", nif=" + nif + ", nombre=" + nombre + ", apellido1=" + apellido1
                + ", apellido2=" + apellido2 + ", telefono=" + telefono + ", sucursal=" + sucursal + "]";
    }
    
    
}
