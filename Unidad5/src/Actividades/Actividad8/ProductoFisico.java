package Actividades.Actividad8;

public class ProductoFisico extends Producto{
    private double peso;
    private double costeEnvio;

    public ProductoFisico(){
        
    }

    public ProductoFisico(int id, String nombre, double precio, double peso, double costeEnvio) {
        super(id, nombre, precio);
        this.peso = peso;
        this.costeEnvio = costeEnvio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getCosteEnvio() {
        return costeEnvio;
    }

    public void setCosteEnvio(double costeEnvio) {
        this.costeEnvio = costeEnvio;
    }

    @Override
    public String toString() {
        if(peso>2.0)
        return "ProductoFisico [id=" + id + ", peso=" + peso + ", nombre=" + nombre + ", costeEnvio=" + costeEnvio
                + ", precio=" + precio + ", precioFinal()=" + precioFinal()+costeEnvio*1.1 + "]";
        else
            return "ProductoFisico [id=" + id + ", peso=" + peso + ", nombre=" + nombre + ", costeEnvio=" + costeEnvio
                + ", precio=" + precio + ", precioFinal()=" + precioFinal()+costeEnvio + "]";  
    }

    
}
