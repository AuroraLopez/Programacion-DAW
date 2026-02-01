package Actividades;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Actividad6 {
    public static void main(String[] args) {
        try {
        String superheroe;
        String alterego;
        // Lectura del contenido del fichero JSON
        Object ob = new JSONParser().parse(new FileReader("C:\\Users\\USER\\Desktop\\1DAW\\Programación-DAW\\Programación\\Unidad5\\src\\Lecciones\\heroes.json"));
        // Convertir objeto a JSON y procesarlo
        JSONArray arr = (JSONArray) ob;
        // Recorrer cada elemento de ese array json
        for (Object item : arr) {
            JSONObject data = (JSONObject) item;
            String publiser= (String)data.get("publisher");
            if (publiser.contains("Marvel")) {
                superheroe=(String)data.get("superhero");
                alterego=(String)data.get("alter_ego");
                System.out.println("Superheroe: "+superheroe);
                System.out.println("AlterEgo: "+alterego);
            }
        }
        } catch(Exception e){
            System.out.println("Algo ha fallado");
        }
    }
}
