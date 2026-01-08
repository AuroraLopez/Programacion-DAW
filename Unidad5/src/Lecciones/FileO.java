package Lecciones;

import java.io.*;

public class FileO {

    public static void main(String[] args)
            throws FileNotFoundException, IOException {
        FileInputStream in = new FileInputStream("C:\\Users\\Auri\\Desktop\\1º DAW\\Programación\\Programacion-DAW\\Unidad5\\src\\Lecciones\\heroes.json");
        FileOutputStream out = new FileOutputStream("salida.txt");
        int n = 0, c;
        System.out.print("\nCopiando ...");
        while ((c = in.read()) != -1) {
            out.write(c);
            n++;
        }
        in.close();
        out.close();
        System.out.print("\nSe han copiado " + n + " Bytes\n");
    }
}
