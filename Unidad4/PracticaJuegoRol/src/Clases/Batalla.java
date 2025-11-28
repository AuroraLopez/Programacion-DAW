package Clases;

import java.util.ArrayList;
import java.util.Scanner;

public class Batalla {
    private ArrayList<Personaje> heroes= new ArrayList<>();
    private ArrayList<Personaje> orcos = new ArrayList<>();

    public void inicioBatalla(){
        while(!heroes.isEmpty() && !orcos.isEmpty()){
            int aleatorioheroe=(int)(Math.random()*(heroes.size()));
            int aleatorioorcos=(int)(Math.random()*(orcos.size()));

            Personaje heroe = heroes.get(aleatorioheroe);;
            Personaje orco = orcos.get(aleatorioorcos);

            System.out.println(heroe);
            System.out.println(orco);

          while (heroe.estavivo() && orco.estavivo()) {

            heroe.atacar(orco);

            // Si el orco muere, la condición del while fallará y saldrá
            if (orco.estavivo()) {
                orco.atacar(heroe);
            }
        }

        // Quitar personajes muertos
        if (!heroe.estavivo()) heroes.remove(heroe);
        if (!orco.estavivo())  orcos.remove(orco);

        if (heroes.isEmpty() && !orcos.isEmpty()) {
            System.out.println("Han ganado los orcos");
        }
        else if (orcos.isEmpty() && !heroes.isEmpty()) {
            System.out.println("Han ganado los heroes");
        }
        else{
            System.out.println("Han empatado");
        }
        }
    }
    public void crearPersonaje(Tipo tipo){
       Scanner teclado = new Scanner(System.in);
       System.out.println("Ingrese el nombre del personaje");
       String nombre=teclado.nextLine();
       System.out.println("Ingrese el ataque del personaje");
       int ataque=teclado.nextInt();
       System.out.println("Ingrese el defensa del personaje");
       int defensa=teclado.nextInt();
        System.out.println("Ingrese la vida del personaje");
       int vida=teclado.nextInt();

       Personaje personaje= new Personaje(nombre,ataque,defensa,vida,null);

       if (tipo==Tipo.CABALLERO || tipo==Tipo.MAGO){
           heroes.add(personaje);
           personaje.setTipo(tipo);
       }
       else{
           orcos.add(personaje);
           personaje.setTipo(tipo);
       }
    }

    public void muestraListas(){
        System.out.println("Lista de heroes:");
        for (int i = 0; i < heroes.size(); i++) {
            System.out.println(heroes.get(i));
        }
        System.out.println("Lista de orcos:");
        for (int i = 0; i < orcos.size(); i++) {
            System.out.println(orcos.get(i));
        }
    }
    public void mostrarmenu(){
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Bienevenido, elija sus opciones para la batalla o -1 para salir");
            System.out.println("1. Añadir Caballero");
            System.out.println("2. Añadir Mago");
            System.out.println("3. Añadir Orco");
            System.out.println("4. Mostrar Listas");
            System.out.println("5. Inicio de Batalla");
            System.out.println("-1. Salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    crearPersonaje(Tipo.CABALLERO);
                    break;
                case 2:
                    crearPersonaje(Tipo.MAGO);
                    break;
                case 3:
                    crearPersonaje(Tipo.ORCO);
                    break;
                case 4:
                    muestraListas();
                    break;
                case 5:
                    inicioBatalla();
                    break;
                default:
                    break;
            }
        }while (opcion!=-1);
    }
}
