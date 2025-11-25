package clases;

public class Toma_Vuelo {
    private Turista turista;
    private Vuelo vuelo;
    private Surcusal surcusal;
    private String clase;

    // Constructores
    public Toma_Vuelo(){

    }

    public Toma_Vuelo(Turista turista, Vuelo vuelo, Surcusal surcusal, String clase) {
        this.turista = turista;
        this.vuelo = vuelo;
        this.surcusal = surcusal;
        this.clase = clase;
    }

    // Metodos

    public Turista getTurista() {
        return turista;
    }

    public void setTurista(Turista turista) {
        this.turista = turista;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Surcusal getSurcusal() {
        return surcusal;
    }

    public void setSurcusal(Surcusal surcusal) {
        this.surcusal = surcusal;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    // Imprimimos
    public void imprimeToma_Vuelos(){
        System.out.println("Turista: ");
        this.turista.imprimeTurista();
        System.out.println("Vuelo: ");
        this.vuelo.imprimeVuelo();
        System.out.println("Surcusal: ");
        this.surcusal.imprimeSucursal();
        System.out.println("Clase: "+clase);
    }
}
