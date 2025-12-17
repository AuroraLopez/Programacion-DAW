import Actividad6.Hotel;
import Actividad6.Reservas;
import Actividad6.Surcusal;
import Actividad6.Toma_Vuelo;
import Actividad6.Turista;
import Actividad6.Vuelo;

public class Actividad6 {
    public static void main(String[] args) {
        /*
        * Crea las clases en JAVA con sus correspondientes
        * constructores y funciones necesarias para mostrar información y
        * modificar los atributos del siguiente diagrama E-R. Hotel, Turista, Vuelo, Sucursal.
        * (Diapositiva 17)
        */
        Turista turista = new Turista(1, "Cristopher", "Quiñones", "987654321", "Calle Granada");
        Hotel hotel = new Hotel(1, "Zurich", "Calle granada", "1234556789", "Huercal overa", 45);
        Surcusal sucursal = new Surcusal(1, "Calle Estacion", "456789123", "Almeria", "Huercal-Overa");
        Vuelo vuelo = new Vuelo(1, "17/12/2025", "12:24", "Huercal-overa", "Dublin", 124);
        Reservas reserva = new Reservas(hotel, turista, sucursal, "17/12/20", "20/12/2025", "parcial");
        Toma_Vuelo toma = new Toma_Vuelo(turista, vuelo, sucursal, "Turista");

        toma.imprimeToma_Vuelos();
        reserva.imprimeReservas();
    }
}
