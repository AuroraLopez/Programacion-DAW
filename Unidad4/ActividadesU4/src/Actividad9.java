import Actividad9.Juego;
import Actividad9.Jugador;

public class Actividad9 {
    /*
     * Ejercicio de cartas (Diapositiva 20)
     * El jugador saca una carta del mazo (Tiene del 1 al 12 con 4 palos).
     * ● Luego intenta predecir si la siguiente carta será mayor o menor en cada
     * ronda.
     * ● Si acierta, gana un punto y si falla, pierde un punto. Comienza con 10
     * puntos.
     * ● El juego continúa hasta que el mazo se acabe o el jugador decida salir.
     * Entonces
     * se mostrará el número de rondas y su puntuación
     */
    public static void main(String[] args) {
        Jugador jugador = new Jugador("Jugador 1");
        Juego juego = new Juego(jugador);
        juego.iniciar();
    }
}
