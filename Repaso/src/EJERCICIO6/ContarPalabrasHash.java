package EJERCICIO6;

import java.io.*;
import java.util.HashMap;

public class ContarPalabrasHash {
    public static void main(String[] args) {
        File fichero = new File("src/EJERCICIO6/texto.txt");
        try {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);
            //=====CLAVE=====VALOR===
            HashMap<String, Integer> mapa = new HashMap<>();
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] palabras = linea.split(" ");
                for (String p : palabras) {
                    mapa.put(p, mapa.getOrDefault(p, 0) + 1);
                }
            }

            br.close();
            System.out.println(mapa);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
