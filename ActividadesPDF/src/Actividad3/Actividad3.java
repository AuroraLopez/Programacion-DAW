package Actividad3;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Actividad3 {

    public static void main(String[] args) {

        Map<String, Integer> daw = new HashMap<>();

        try {
            Object ob = new JSONParser().parse(
                    new FileReader("C:\\Users\\USER\\Desktop\\1DAW\\Programación-DAW\\Programación\\ActividadesPDF\\src\\Actividad3\\DAW.json")
            );

            // JSON raíz → objeto
            JSONObject raiz = (JSONObject) ob;

            // Sacamos el array de alumnos
            JSONArray alumnos = (JSONArray) raiz.get("alumnos");

            for (Object item : alumnos) {

                JSONObject alumno = (JSONObject) item;

                String nombre = (String) alumno.get("nombre");
                JSONArray notas = (JSONArray) alumno.get("notas");

                double suma = 0;

                for (Object n : notas) {
                    long nota = (long) n;
                    suma += nota;
                }

                double media = suma / notas.size();

                System.out.println("Alumno: " + nombre + " Media: " + media);

                if (media < 5) {
                    daw.put("suspensos", daw.getOrDefault("suspensos", 0) + 1);
                } else if (media < 7) {
                    daw.put("aprobados", daw.getOrDefault("aprobados", 0) + 1);
                } else if (media < 9) {
                    daw.put("notables", daw.getOrDefault("notables", 0) + 1);
                } else {
                    daw.put("sobresalientes", daw.getOrDefault("sobresalientes", 0) + 1);
                }
            }

            System.out.println("\nResumen:");
            System.out.println(daw);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}