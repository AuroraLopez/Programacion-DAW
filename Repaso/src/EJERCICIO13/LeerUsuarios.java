package EJERCICIO13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class LeerUsuarios {
        public static void main(String[] args) throws Exception {

            HashMap<String, String> usuarios = new HashMap<>();
            BufferedReader br = new BufferedReader(new FileReader("usuarios.txt"));
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");
                usuarios.put(datos[0], datos[1]);
            }

            br.close();
            System.out.println(usuarios);
        }
}
