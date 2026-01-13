package Actividades;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Tarea {
    public static void main(String[] args) {
        Map<String, List<Heroe>> heroes = new HashMap<>();
        try {
            // Lectura del contenido del fichero JSON
            Object ob = new JSONParser().parse(new FileReader(
                    "C:\\Users\\Auri\\Desktop\\1º DAW\\Programación\\Programacion-DAW\\Unidad5\\src\\Lecciones\\heroes.json"));
            // Convertir objeto a JSON y procesarlo
            JSONArray arr = (JSONArray) ob;

            for (Object item : arr) {
                JSONObject data = (JSONObject) item;

                String nombre = (String) data.get("superhero");
                String editorial = (String) data.get("publisher");

                Heroe heroe = new Heroe(nombre, editorial);
                if (!heroes.containsKey(editorial)) {
                    heroes.put(editorial, new ArrayList<>());
                }
                heroes.get(editorial).add(heroe);
            }

            System.out.println("Resultado de la agrupación");
            for (String editorial : heroes.keySet()) {
                System.out.println("key: "+editorial+" value: "+heroes.get(editorial));
            }
        } catch (Exception e) {
            System.out.println("Algo ha fallado");
        }
    }
}
