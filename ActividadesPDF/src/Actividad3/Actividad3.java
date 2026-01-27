package Actividad3;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Actividad3 {
    public static void main(String[] args) {
        /*
         * Crea un programa que lea el siguiente formato JSON y muestre por cada alumno
         * la media actual
         * y en un HashMap<String,Integer>, cuántos suspensos, aprobados, notable y
         * sobresalientes tenemos.
         */
        // Declaramos el hashmap
        Map<String, Integer> daw = new HashMap<>();
        try {

            // Leemos el fichero
            Object ob = new JSONParser().parse(new FileReader(
                    "C:\\Users\\Auri\\Desktop\\1DAW\\Programacion\\Programacion-DAW\\ActividadesPDF\\src\\Actividad3\\DAW.json"));

             // Convertir objeto a JSON y procesarlo
            JSONArray arr = (JSONArray) ob;

            for (Object item : arr) {
                JSONObject data = (JSONObject) item;

                String nombre = (String) data.get("nombre");
                int nota=(int) data.get("notas");

            }

            // // Mostrar la media actual de cada alumno
            // String alumno=daw.get("nombre")
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
