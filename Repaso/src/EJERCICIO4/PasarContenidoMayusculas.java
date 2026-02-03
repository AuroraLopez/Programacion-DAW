package EJERCICIO4;

import java.io.*;

public class PasarContenidoMayusculas {
    public static void main(String[] args) {
        File fichero = new File("src/EJERCICIO4/entrada.txt");
        File ficheroSalida = new File("src/EJERCICIO4/mayusculas.txt");
        try {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);
            BufferedWriter bw = new BufferedWriter(new FileWriter("mayusculas.txt"));

            String linea;
            while ((linea = br.readLine()) != null) {
                bw.write(linea.toUpperCase());
                bw.newLine();
            }

            br.close();
            bw.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
