package Actividad11;

import java.util.ArrayList;
import java.util.Collections;

public class Mazo {
    ArrayList<Carta> cartas =  new ArrayList<Carta>();

    // Constructores
    public Mazo(){

    }
    public Mazo(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    public void barajar(){
        Collections.shuffle(cartas);
    }
    public void sacarCarta(){

    }
    public void estaVacio(){

    }
}
