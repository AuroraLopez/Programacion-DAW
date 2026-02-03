package EJERCICIO9;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class LeerJSON {
    public static void main(String[] args) {
        try {
            // Lectura del contenido del fichero JSON
            Object ob = new JSONParser().parse(new FileReader("src/EJERCICIO9/JSONFile.json"));
            // Convertir objeto a JSON y procesarlo
            JSONObject js = (JSONObject) ob;
            String firstName = (String) js.get("firstName");
            String lastName = (String) js.get("lastName");
            System.out.println("First name is: " + firstName);
            System.out.println("Last name is: " + lastName);
            JSONArray arr = (JSONArray) js.get("phoneNumbers");
            for (Object item : arr) {
                JSONObject data = (JSONObject) item;
                String post_id = (String) data.get("phone-number");
                System.out.println(post_id);
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
