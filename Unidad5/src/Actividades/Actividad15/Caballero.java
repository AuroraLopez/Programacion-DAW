package Actividades.Actividad15;

public class Caballero extends Personaje{

    
    public Caballero(String nombre, int vida) {
        super(nombre, vida);
    }

    @Override
    public int atacar() {
        int daño = random.nextInt(10) + 5; // 5-14 de daño
        System.out.println(nombre + " ataca con espada causando " + daño + " de daño.");
        return daño;
    }
    
}
