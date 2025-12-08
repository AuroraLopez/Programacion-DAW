package Actividad5;

public class Profesor {
    private String DNI;
    private String nombre;
    private String direccion;
    private long tfno;

    // Constructores
    public Profesor(){

    }

    public Profesor(String dNI, String nombre, String direccion, long tfno) {
        DNI = dNI;
        this.nombre = nombre;
        this.direccion = direccion;
        this.tfno = tfno;
    }

    // Imprimimos
    @Override
    public String toString() {
        return "Profesor [DNI=" + DNI + ", nombre=" + nombre + ", direccion=" + direccion + ", tfno=" + tfno + "]";
    }  
}
