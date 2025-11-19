package clases;

public class Vuelo {
    private int id;
    private String fecha;
    private String hora;
    private String origen;
    private String destino;
    private int plazasTotales;

    // Constructor
    public Vuelo(){

    }

    public Vuelo(int id, String fecha, String hora, String origen, String destino, int plazasTotales) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.origen = origen;
        this.destino = destino;
        this.plazasTotales = plazasTotales;
    }

    // Metodos

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getPlazasTotales() {
        return plazasTotales;
    }

    public void setPlazasTotales(int plazasTotales) {
        this.plazasTotales = plazasTotales;
    }

    // Imprimimos
    public void imprimeVuelo(){
        System.out.println("Vuelo: "+id);
        System.out.println("Fecha: "+fecha);
        System.out.println("Hora: "+hora);
        System.out.println("Origen: "+origen);
        System.out.println("Destino: "+destino);
        System.out.println("Plazas totales: "+plazasTotales);

    }
}
