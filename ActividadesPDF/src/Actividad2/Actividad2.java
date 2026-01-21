package Actividad2;

import java.io.FileReader;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Actividad2 {
    public static void main(String[] args) {
        /*
        * 2. Lee el fichero heroes.json para obtener un formato tabla de salida con la información los héroes
        * de DC cuyo superhero empieza por ‘G’.
        */
       try {
        // Lectura del contenido del fichero JSON
        Object ob = new JSONParser().parse(new FileReader("C:\\Users\\Auri\\Desktop\\1DAW\\Programacion\\Programacion-DAW\\ActividadesPDF\\src\\Actividad2\\heroes.json"));
        // Convertir objeto a JSON y procesarlo
        JSONObject js = (JSONObject) ob;
        
        // Leyendo el array guardado en esa clave
        JSONArray arr = (JSONArray) js.get("publisher");
        // Recorrer cada elemento de ese array json
        for (Object item : arr) {
            JSONObject data = (JSONObject) item;
            String publiser= (String)data.get("publisher");
            String superheroe=(String)data.get("superhero");
            if (publiser.contains("DC") && superheroe.contains("G")) {
                System.out.println(data.get(arr));
            }
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
