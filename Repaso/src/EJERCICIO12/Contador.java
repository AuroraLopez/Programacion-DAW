package EJERCICIO12;

import java.util.HashMap;

public class Contador {
    public static void main(String[] args) {

        String texto = "hola hola adios hola";

        HashMap<String, Integer> contador = new HashMap<>();

        for (String palabra : texto.split(" ")) {
            contador.put(palabra, contador.getOrDefault(palabra, 0) + 1);
        }

        System.out.println(contador);
    }
}
