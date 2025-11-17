package clases;

public class Libro {
    private String titulo;
    private String isbn;
    private String anyo;
    private double precio;
    Editorial editorial;

    // Constructores
    // Uno por defecto vacio siempre
    public Libro(){

    }
    // Y otro con
    public Libro(String titulo, String isbn, String anyo, double precio){
        this.titulo = titulo;
        this.isbn = isbn;
        this.anyo = anyo;
        this.precio = precio;
    }

    // Métodos get y set (Getter y Setter)
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAnyo() {
        return anyo;
    }

    public void setAnyo(String anyo) {
        this.anyo = anyo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial=new Editorial();
        this.editorial.setAnyo(editorial.getAnyo());
        this.editorial.setNombre(editorial.getNombre());
        this.editorial.setCodigo(editorial.getCodigo());
    }

    public Editorial getEditorial() {
        return editorial;
    }


    public void imprimeLibro(){
        System.out.println("Nombre del libro: "+this.titulo);
        System.out.println("Isbn del libro: "+this.isbn);
        System.out.println("Anio del libro: "+this.anyo);
        System.out.println("Precio del libro: "+this.precio);
    }
}
