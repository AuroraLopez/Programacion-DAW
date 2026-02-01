package Actividades.Actividad17;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Movible> vehiculosM = new ArrayList<>();
        ArrayList<Sonoro>  vehiculosS=new ArrayList<>();
        Coche c1 = new Coche();
        Barco b1 = new Barco();
        Avion a1 = new Avion();
        
        // Añadir vehiculos a Movible
        vehiculosM.add(a1);
        vehiculosM.add(b1);
        vehiculosM.add(c1);

        // Añadir vehiculos a Sonoro
        vehiculosS.add(a1);
        vehiculosS.add(b1);
        vehiculosS.add(c1);

        // Recorrer Movible y llamar a función
        System.out.println("Array de Movible");
        System.out.println("_______________________");
        for(Movible vehiculo : vehiculosM){
            vehiculo.mover();
        }
        System.out.println("-----------------------");

        // Recorrer Movible y llamar a función
        System.out.println("Array de Sonoro");
        System.out.println("_______________________");
        for(Sonoro vehiculo : vehiculosS){
            vehiculo.emitirSonido();
        }
        System.out.println("-----------------------");
    }
}
