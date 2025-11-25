package Actividad11;

public class Carta {
    private int valor;
    private String palo;

    // Constructores
    public Carta(){

    }

    public Carta(int valor, String palo) {
        this.valor = valor;
        this.palo = palo;
    }

    // Metodos


    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    // Imprimir

    @Override
    public String toString() {
        return "Carta{" +
                "valor=" + valor +
                ", palo='" + palo + '\'' +
                '}';
    }
}
