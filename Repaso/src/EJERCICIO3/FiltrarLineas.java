package EJERCICIO3;

import java.io.*;

public class FiltrarLineas {
    public static void main(String[] args) {
        File fichero = new File("entrada.txt");
        File ficheroSalida = new File("salida.txt");
        try {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);
            BufferedWriter bw = new BufferedWriter(new FileWriter("salida.txt"));

            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.contains("ERROR")) {
                    bw.write(linea);
                    bw.newLine();
                }
            }

            br.close();
            bw.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
