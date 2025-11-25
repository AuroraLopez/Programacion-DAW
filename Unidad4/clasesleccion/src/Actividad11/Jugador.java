package Actividad11;

public class Jugador {
    private String nombre;
    private int puntuacion;

    // Constructores
    public Jugador(){

    }
    public Jugador(String nombre, int puntuacion) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
    }

    //Metodos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public static void  sumarPunto(){
        int puntos=10;
    };
}
