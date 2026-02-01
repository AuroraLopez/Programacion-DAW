package Actividad8;

import Actividad7.Vehiculo;

public class Helicoptero extends Vehiculo implements Volador{

    public Helicoptero(String marca) {
        super(marca);
    }

    @Override
    public void arrancar() {
        System.out.println("El helicóptero ha arrancado");        
    }

    @Override
    public void volar() {
        System.out.println("El helicóptero empezó ha volar");
    }
    
}

