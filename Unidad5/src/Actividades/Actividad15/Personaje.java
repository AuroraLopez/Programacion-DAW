package Actividades.Actividad15;

import java.util.Random;

public abstract class Personaje {
        protected String nombre;
    protected int vida;
    protected Random random = new Random();

    public Personaje(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void recibirDaño(int daño) {
        vida -= daño;
        if (vida < 0) vida = 0;
        System.out.println(nombre + " recibe " + daño + " de daño. Vida restante: " + vida);
    }

    public abstract int atacar();
    
    @Override
    public String toString() {
        return nombre + " (Vida: " + vida + ")";
    }
}

