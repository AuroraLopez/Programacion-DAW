package Actividad9;

public class Vagon {
    private int numero;
    private int cargaMaxima;
    private int cargaActual;
    private String tipo;

    // Constructores
    public Vagon() {

    }
    public Vagon(int numero, int cargaMaxima, int cargaActual, String tipo) {
        this.numero = numero;
        this.cargaMaxima = cargaMaxima;
        this.cargaActual = cargaActual;
        this.tipo = tipo;
    }

    //Metodos

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public int getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(int cargaActual) {
        this.cargaActual = cargaActual;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Vagon{" +
                "numero=" + numero +
                ", cargaMaxima=" + cargaMaxima +
                ", cargaActual=" + cargaActual +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
