package Actividad4;

public class Seccion {
    private Revista revista;
    private String titulo;
    private String extension;

    // Constructor
    public Seccion(){

    }

    public Seccion(Revista revista, String titulo, String extension) {
        this.revista = revista;
        this.titulo = titulo;
        this.extension = extension;
    }

    @Override
    public String toString() {
        return "Seccion [revista=" + revista + ", titulo=" + titulo + ", extension=" + extension + "]";
    }
    
    
}
