package Actividad6;

public class Main {
    public static void main(String[] args) {
        /*
        * 6. Emplea la herencia para implementar la clasificación de animales según la siguiente web:
        * https://www.mundoestudiante.com/clasificacion-animales-vertebrados-invertebrados/ Realiza tanto
        * las clases como métodos necesarios y ejemplos de ejecución.
        */
       // Vertebrados
       Anfibio amf1=new Anfibio("Sapo 1", 4);
       Reptil rep1=new Reptil("Donatello", 4);
       Ave ave1=new Ave("Rapaz", 2);
       Mamifero perro1=new Mamifero("Bodeguero", 4);
       Pez pez1=new Pez("Payaso", 0);

       // Imprimirlos
       System.out.println("Vertebrados");
       System.out.println(amf1.toString());
       System.out.println(rep1.toString());
       System.out.println(ave1.toString());
       System.out.println(perro1.toString());
       System.out.println(pez1.toString());
       System.out.println("-------------------------");

       // Invertebrados
       Molusco mol1=new Molusco("Molusco", "Omnivoros");
       Equinodermo eq1=new Equinodermo("Patricio Estrella", "Omnivoros");
       Aracnido arañ1=new Aracnido("Viuda Negra", "Carnivora");
       Miriapodo mir1=new Miriapodo("Cienpiés", "Carnivoro");

       // Imprimirlos
       System.out.println("Invertebrados");
       System.out.println(mol1.toString());
       System.out.println(eq1.toString());
       System.out.println(arañ1.toString());
       System.out.println(perro1.toString());
       System.out.println(mir1.toString());
       System.out.println("-------------------------");

    }
}
