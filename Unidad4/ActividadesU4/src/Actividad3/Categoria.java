package Actividad3;

public class Categoria {
    private int codigo;
    private String nombre;

    // Constructor
    public Categoria(){

    }
    public Categoria(int codigo, String nombre){
        this.codigo=codigo;
        this.nombre=nombre;
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

    // Imprimimos la categoria

    public void imprimeCategoria(){
        System.out.println("Esta categoria tiene de codigo "+codigo+" y de nombre "+nombre);
    }    
}
