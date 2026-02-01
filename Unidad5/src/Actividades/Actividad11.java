package Actividades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Actividad11 {
    public static void main(String[] args) {
        /*
        * Dada una lista de marcas de coches, crea un programa que
        * usa hashMap<String,Integer>, donde Integer tenga las veces que
        * aparece cada marca en la lista. Hazlo usando Map usando sus métodos
        * containsKey, get y put.
        */

        // Lista de marcas
        List<String> marcas = new ArrayList<>();
        marcas.add("Citroen");
        marcas.add("Seat");
        marcas.add("BMW");
        marcas.add("Citroen");
        marcas.add("Seat");
        marcas.add("BMW");
        marcas.add("Seat");

        // Map para contar apariciones
        Map<String, Integer> contador = new HashMap<>();

        // Recorremos la lista
        for (String marca : marcas) {

            if (contador.containsKey(marca)) {
                // Si ya existe, incrementamos
                int valorActual = contador.get(marca);
                contador.put(marca, valorActual + 1);
            } else {
                // Si no existe, lo añadimos con valor 1
                contador.put(marca, 1);
            }
        }

        // Mostrar resultados
        for (String marca : contador.keySet()) {
            System.out.println(marca + " : " + contador.get(marca));
        }
    }
}
