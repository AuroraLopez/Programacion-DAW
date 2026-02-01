package Actividades.Actividad15;

public class Orco extends Personaje{

    public Orco(String nombre, int vida) {
        super(nombre, vida);
    }

    @Override
    public int atacar() {
        int daño = random.nextInt(12) + 4; // 4-15 de daño
        System.out.println(nombre + " golpea con fuerza causando " + daño + " de daño.");
        return daño;
    }
}
