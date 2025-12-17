package Actividad3;

public class Pieza {
    private int codigo;
    private String nombre;
    private String color;
    private double precio;
    private Categoria codigo_categoria;

    // Constructor
    public Pieza(){

    }
    public Pieza(int codigo, String nombre, String color, double precio){
        this.codigo=codigo;
        this.color=color;
        this.nombre= nombre;
        this.precio=precio;
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
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double getCat() {
        return precio;
    }
    public void setCat(Categoria codigo_categoria) {
        this.codigo_categoria = codigo_categoria;
    }
   
    // Imprimos las piezas
    public void imprimePieza(){
        if (codigo_categoria!=null) {
            System.out.println("La pieza tiene de codigo "+codigo+" con un nombre "+nombre+ "de color "+color+ " con un precio de "+precio+" de la categoria "+codigo_categoria.toString());
        }
        else{
            System.out.println("La pieza tiene de codigo "+codigo+" con un nombre "+nombre+ "de color "+color+ " con un precio de "+precio);
        }
        
    }
    
}
