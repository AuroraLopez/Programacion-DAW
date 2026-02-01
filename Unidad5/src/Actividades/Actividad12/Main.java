package Actividades.Actividad12;

public class Main {
    public static void main(String[] args) {
        Animal pez=new Animal("pez dorado", "comida especifica", 2);
        Mamifero ballena=new Mamifero("Ballena Azul", "Plakton", 65, 7);
        Perro p1=new Perro("Lucky", "Carnivoro", 5, 3, "Bodeguero Andaluz");
        Gato g1=new Gato("Antonia", "Omnivora", 85, 3, "Siames");
        Caballo c1=new Caballo("Lucera", "Paja", 12, 3, "paja", 4);

        System.out.println(pez.toString());
        System.out.println(ballena.toString());
        System.out.println(p1.toString());
        System.out.println(g1.toString());
        System.out.println(c1.toString());
    }
}
