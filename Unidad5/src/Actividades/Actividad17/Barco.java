package Actividades.Actividad17;

public class Barco implements Movible,Sonoro{
    public Barco(){

    }

    @Override
    public void mover() {
        System.out.println("El barco navega por el mar");
    }

    @Override
    public void emitirSonido() {
        System.out.println("El barco hace sonar la bocina: ¡Buuuuu!");
    }
    
}
