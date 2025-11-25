package Actividad10;

public class Autor {
    private String nombre;
    private String premio;

    // Constructores
    public Autor() {

    }

    public Autor(String premio, String nombre) {
        this.premio = premio;
        this.nombre = nombre;
    }

    // Metodos


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPremio() {
        return premio;
    }

    public void setPremio(String premio) {
        this.premio = premio;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                ", premio='" + premio + '\'' +
                '}';
    }
}
