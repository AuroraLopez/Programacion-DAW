package EJERCICIO2;
import java.io.*;
public class ContarPalabras {

        public static void main(String[] args) {
            File file = new File("src/EJERCICIO2/texto.txt");
            try {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                String linea;
                int lineas = 0, palabras = 0, caracteres = 0;

                while ((linea = br.readLine()) != null) {
                    lineas++;
                    caracteres += linea.length();
                    palabras += linea.split(" ").length;
                }

                br.close();

                System.out.println("Líneas: " + lineas);
                System.out.println("Palabras: " + palabras);
                System.out.println("Caracteres: " + caracteres);
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
    }

