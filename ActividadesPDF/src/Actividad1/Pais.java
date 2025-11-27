package Actividad1;

public class Pais {
    private String nombre;
    private int poblacion;
    private long PIB;

    // Constructor
    public Pais(){

    }
    public Pais(String nombre, int poblacion, long pIB) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        PIB = pIB;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getPoblacion() {
        return poblacion;
    }
    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }
    public long getPIB() {
        return PIB;
    }
    public void setPIB(long pIB) {
        PIB = pIB;
    }

    public long pibPerCapita(long pIB){
        long pibpercapita=(pIB*100000)/poblacion;
        return pibpercapita;
    }

    // Imprimir
    @Override
    public String toString() {
        return "Pais [nombre=" + nombre + ", poblacion=" + poblacion + ", PIB=" + PIB + ", PIB per capita=" + pibPerCapita(PIB) +"]";
    }

    
    
}
