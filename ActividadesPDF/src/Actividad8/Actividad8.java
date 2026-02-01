package Actividad8;

import java.util.ArrayList;

import Actividad7.Coche;
import Actividad7.Vehiculo;

public class Actividad8 {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculosA8=new ArrayList<>();
        Coche c2=new Coche("Audi A6");
        Avion a1=new Avion("Airbus");
        Helicoptero h1=new Helicoptero("Airbus");

        // Aladir al ArrayList
        vehiculosA8.add(c2);
        vehiculosA8.add(a1);
        vehiculosA8.add(h1);

        // Recorres el array
        for(Vehiculo vehiculo : vehiculosA8){
            if (vehiculo instanceof Volador) {
                vehiculo.arrancar();
                ((Volador)vehiculo).volar();
            }
            else vehiculo.arrancar();
        }
    }
}
