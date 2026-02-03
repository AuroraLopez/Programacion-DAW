package EJERCICIO14;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
import java.util.HashMap;

public class Empleados {
    public static void main(String[] args) {
        try {

            // Lectura del contenido del fichero JSON
            Object ob = new JSONParser().parse(new FileReader("src/EJERCICIO14/Empresa.json"));
            JSONObject js = (JSONObject) ob;
            // Mostrar nombre de la empresa
            String empresa = (String) js.get("empresa");
            System.out.println("Empresa: " + empresa);

            JSONArray arr = (JSONArray) js.get("empleados");

            long sumaSalariosIT = 0;
            int contadorIT = 0;

            HashMap<String, Integer> departamentos = new HashMap<>();

            for (Object item : arr) {
                JSONObject data = (JSONObject) item;
                String nombre = (String) data.get("nombre");
                long salario = (long) data.get("salario");
                String Departamento = (String) data.get("departamento");
                // Contar empleados por departamento
                departamentos.put(Departamento,departamentos.getOrDefault(Departamento, 0) + 1);
                // Mostrar solo IT
                if (Departamento.equals("IT")) {
                    System.out.println(nombre + " - " + salario + " - " + Departamento);
                    sumaSalariosIT += salario;
                    contadorIT++;
                }
            }
            if (contadorIT > 0) {
                double media = (double) sumaSalariosIT / contadorIT;
                System.out.println("Salario medio IT: " + media);
            }
            System.out.println("Empleados por departamento: " + departamentos);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
