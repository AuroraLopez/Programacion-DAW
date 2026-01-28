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
        Object ob = new JSONParser().parse(new FileReader("C:\\Users\\USER\\Desktop\\1DAW\\Programación-DAW\\Programación\\ActividadesPDF\\src\\Actividad2\\heroes.json"));
        
        // Leyendo el array guardado en esa clave
        JSONArray arr = (JSONArray) ob;
        // Recorrer cada elemento de ese array json
        for (Object item : arr) {
            JSONObject data = (JSONObject) item;
            String publiser= (String)data.get("publisher");
            String superheroe=(String)data.get("superhero");
            String alter_ego=(String)data.get("alter_ego");
            String aparicion=(String)data.get("first_appearance");
            String character=(String)data.get("characters");
            if (publiser.contains("DC") && superheroe.startsWith("G")) {
                System.out.println("");
                System.out.println("-------------------------------");
                System.out.println("Superheroe: "+superheroe);
                System.out.println("Alter-ego: "+alter_ego);
                System.out.println("Primera aparición: "+aparicion);
                System.out.println("Character: "+character);
                System.out.println("-------------------------------");
            }
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
