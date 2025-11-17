package clases;

public class Editorial {
    private int codigo;
    private String nombre;
    private int anyo;

    // Constructores
    public Editorial() {

    }
    public Editorial(int codigo, String nombre, int anyo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.anyo = anyo;
    }

    // Métodos set y get(setter y getter)

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

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public void imprimeEditorial(){
        System.out.println("Nombre de la editorial: "+this.nombre);
        System.out.println("Anio de la editorial: "+this.anyo);

    }
}
