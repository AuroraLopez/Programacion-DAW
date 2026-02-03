package EJERCICIO5;

import java.io.*;

public class SepararParesImpares {
    public static void main(String[] args) {
        File fichero = new File("src/EJERCICIO5/texto.txt");

        try {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            BufferedWriter pares = new BufferedWriter(new FileWriter("src/EJERCICIO5/pares.txt"));
            BufferedWriter impares = new BufferedWriter(new FileWriter("src/EJERCICIO5/impares.txt"));

            String linea;
            int contador = 1;

            while ((linea = br.readLine()) != null) {
                if (contador % 2 == 0) {
                    pares.write(linea);
                    pares.newLine();
                } else {
                    impares.write(linea);
                    impares.newLine();
                }
                contador++;
            }
            System.out.println("Completado");
            br.close();
            pares.close();
            impares.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
