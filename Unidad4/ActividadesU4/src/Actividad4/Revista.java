package Actividad4;

public class Revista {
    private int numero_registro;
    private String titulo;
    private String tipo;
    private String periocidad;

    // Constructor
    public Revista(){

    }

    public Revista(int numero_registro, String titulo, String tipo, String periocidad) {
        this.numero_registro = numero_registro;
        this.titulo = titulo;
        this.tipo = tipo;
        this.periocidad = periocidad;
    }

    @Override
    public String toString() {
        return "Revista [numero_registro=" + numero_registro + ", titulo=" + titulo + ", tipo=" + tipo + ", periocidad="
                + periocidad + "]";
    }
}
