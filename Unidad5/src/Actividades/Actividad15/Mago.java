package Actividades.Actividad15;

public class Mago extends Personaje{
    public Mago(String nombre, int vida) {
        super(nombre, vida);
    }

    @Override
    public int atacar() {
        int daño = random.nextInt(15) + 3; // 3-17 de daño
        System.out.println(nombre + " lanza un hechizo causando " + daño + " de daño.");
        return daño;
    }
}
