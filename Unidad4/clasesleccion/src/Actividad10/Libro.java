package Actividad10;

public class Libro {
    private String nombre;
    private Autor autor;
    private String categoria;
    private int totalprestar;

    // Constructores
    public Libro(){

    }

    public Libro(String nombre, Autor autor, String categoria, int totalprestar) {
        this.nombre = nombre;
        this.autor = autor;
        this.categoria = categoria;
        this.totalprestar = totalprestar;
    }

    // Metodos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getTotalprestar() {
        return totalprestar;
    }

    public void setTotalprestar(int totalprestar) {
        this.totalprestar = totalprestar;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "nombre='" + nombre + '\'' +
                ", autor=" + autor +
                ", categoria='" + categoria + '\'' +
                ", totalprestar=" + totalprestar +
                '}';
    }
}

