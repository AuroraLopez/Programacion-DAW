package Actividad4;

public class Ejemplar {
    private Revista revista;
    private String fecha;
    private int num_pag;
    private int num_ejemplares;

    // Constructor
    public Ejemplar(){

    }

    public Ejemplar(Revista revista, String fecha, int num_pag, int num_ejemplares) {
        this.revista = revista;
        this.fecha = fecha;
        this.num_pag = num_pag;
        this.num_ejemplares = num_ejemplares;
    }

    @Override
    public String toString() {
        return "Ejemplar [revista=" + revista + ", fecha=" + fecha + ", num_pag=" + num_pag + ", num_ejemplares="
                + num_ejemplares + "]";
    }
}
