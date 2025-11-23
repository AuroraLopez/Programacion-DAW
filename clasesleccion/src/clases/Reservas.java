package clases;

public class Reservas {
    private Hotel hotel;
    private Turista turista;
    private Surcusal surcusal;
    private String fechaEntrada;
    private String fechaSalida;
    private String regimen;

    // Constructores
    public Reservas() {

    }

    public Reservas(Hotel hotel, Turista turista, Surcusal surcusal, String fechaEntrada, String fechaSalida, String regimen) {
        this.hotel = hotel;
        this.turista = turista;
        this.surcusal = surcusal;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.regimen = regimen;
    }

    // Metodos

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Turista getTurista() {
        return turista;
    }

    public void setTurista(Turista turista) {
        this.turista = turista;
    }

    public Surcusal getSurcusal() {
        return surcusal;
    }

    public void setSurcusal(Surcusal surcusal) {
        this.surcusal = surcusal;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getRegimen() {
        return regimen;
    }

    public void setRegimen(String regimen) {
        this.regimen = regimen;
    }

    // Imprimimos
    public void imprimeReservas(){
        System.out.println("Hotel: "); this.hotel.imprimeHotel();
        System.out.println("Turista: "); this.turista.imprimeTurista();
        System.out.println("Surcusal:"); this.surcusal.imprimeSucursal();
        System.out.println("Fecha Entrada:"+fechaEntrada);
        System.out.println("Fecha Salida:"+fechaSalida);
        System.out.println("Regimen:"+regimen);
    }
}
