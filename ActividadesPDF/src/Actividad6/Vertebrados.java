package Actividad6;

public class Vertebrados extends Animales{
    protected int numeropatas;
    protected String alimentacion;
    public Vertebrados(int id, String nombre, String tipo, int numeropatas, String alimentacion) {
        super(id, nombre, tipo);
        this.numeropatas = numeropatas;
        this.alimentacion = alimentacion;
    }
    public int getNumeropatas() {
        return numeropatas;
    }
    public void setNumeropatas(int numeropatas) {
        this.numeropatas = numeropatas;
    }
    public String getAlimentacion() {
        return alimentacion;
    }
    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }
    @Override
    public String toString() {
        return "Vertebrados [id=" + id + ", numeropatas=" + numeropatas + ", nombre=" + nombre + ", alimentacion="
                + alimentacion + ", tipo=" + tipo + "]";
    }

    
}
