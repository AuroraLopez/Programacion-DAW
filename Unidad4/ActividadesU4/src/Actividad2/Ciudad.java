package Actividad2;

public class Ciudad {
    private int codigo;
    private String nombre;
    private int indicativo;

    // Constructores
    public Ciudad(){

    }

    public Ciudad(int codigo, String nombre, int indicativo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.indicativo = indicativo;
    }

    // Metodos
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIndicativo() {
        return indicativo;
    }

    public void setIndicativo(int indicativo) {
        this.indicativo = indicativo;
    }

    @Override
    public String toString() {
        return "Ciudad [codigo=" + codigo + ", nombre=" + nombre + ", indicativo=" + indicativo + "]";
    }
    
    
}
