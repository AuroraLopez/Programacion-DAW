package Actividades.Actividad15;

import java.util.ArrayList;
import java.util.Random;

public class MainRPG {
    public static void main(String[] args) {
        // Crear equipos
        ArrayList<Personaje> heroes = new ArrayList<>();
        ArrayList<Personaje> orcos = new ArrayList<>();

        heroes.add(new Caballero("Marcos", 60));
        heroes.add(new Caballero("Yeray", 50));
        heroes.add(new Mago("Aurora", 55));

        orcos.add(new Orco("Spas", 70));
        orcos.add(new Orco("Flashito", 40));
        orcos.add(new Orco("Josué", 75));

        Random random = new Random();

        // Batalla
        while (!heroes.isEmpty() && !orcos.isEmpty()) {
            // Héroes atacan
            Personaje heroe = heroes.get(random.nextInt(heroes.size()));
            Personaje orco = orcos.get(random.nextInt(orcos.size()));

            System.out.println("\n" + heroe.nombre + " vs " + orco.nombre);

            orco.recibirDaño(heroe.atacar());
            if (!orco.estaVivo()) {
                System.out.println(orco.nombre + " ha sido derrotado!");
                orcos.remove(orco);
                System.out.println(heroe.nombre + " gana este enfrentamiento!");
            }

            if (orcos.isEmpty())
                break;

            // Orcos atacan
            Personaje orcoataque = orcos.get(random.nextInt(orcos.size()));
            Personaje heroesdef = heroes.get(random.nextInt(heroes.size()));

            System.out.println("\n" + orcoataque.nombre + " vs " + heroesdef.nombre);

            heroesdef.recibirDaño(orcoataque.atacar());
            if (!heroesdef.estaVivo()) {
                System.out.println(heroesdef.nombre + " ha sido derrotado!");
                heroes.remove(heroesdef);
                System.out.println(orcoataque.nombre + " gana este enfrentamiento!");
            }
        }

        // Resultado final
        if (heroes.isEmpty()) {
            System.out.println("\n¡Los orcos han ganado la batalla!");
        } else {
            System.out.println("\n¡Los héroes han ganado la batalla!");
        }
    }
}
