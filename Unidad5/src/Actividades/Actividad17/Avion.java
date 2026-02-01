package Actividades.Actividad17;

public class Avion implements Movible,Sonoro{
    public Avion(){

    }

    @Override
    public void mover() {
        System.out.println("El avion vuela por el cielo");
    }

    @Override
    public void emitirSonido() {
        System.out.println("El hace ruido de motores:¡Vrooooom!");
    }
    
}
