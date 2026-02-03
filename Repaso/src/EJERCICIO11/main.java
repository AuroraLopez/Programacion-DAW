package EJERCICIO11;

public class main {
    public static void main(String[] args) {
        ListaGenericaDatos<Persona> persona = new ListaGenericaDatos<>();
        persona.añadir(new Persona("Ana"));
        persona.añadir(new Persona("Juan"));

        persona.mostrar();
    }
    }
