package Actividad1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {
        /*
         * 1. Crea una aplicación que pida la ruta de dos ficheros de texto y de una
         * ruta de destino (solo la ruta
         * del directorio). Debes copiar el contenido de los dos ficheros en uno, este
         * tendrá el nombre de los
         * dos ficheros separados por un guion bajo, este se guardará en la ruta de
         * destino que le hayamos
         * indicado.
         * Por ejemplo, si tengo un fichero A.txt con «ABC» como contenido, un fichero
         * B.txt con «DEF» y
         * una ruta de destino D:\, el resultado sera un fichero llamado A_B.txt en la
         * ruta D:\ con el contenido
         * «ABC DEF».
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Selecciona la ruta del primer fichero: ");
        String fichero1 = teclado.nextLine();
        System.out.println("Selecciona la ruta del segundo fichero: ");
        String fichero2 = teclado.nextLine();
        System.out.println("Selecciona la ruta del fichero de destino: ");
        String destino = teclado.nextLine();

        try {
            File file1 = new File(fichero1);
            FileReader filereader1 = new FileReader(file1);
            BufferedReader buffer1 = new BufferedReader(filereader1);
            File file2 = new File(fichero2);
            FileReader filereader2 = new FileReader(file2);
            BufferedReader buffer2 = new BufferedReader(filereader2);

            // Nombre A_B.txt
            String nombreDestino = file1.getName().replace(".txt", "") + "_" + file2.getName();
            File archivodestino = new File(destino, nombreDestino);

            // Iniciamos el Writer
            FileWriter escrito = new FileWriter(archivodestino);
            BufferedWriter bufferescrito = new BufferedWriter(escrito);

            // Escribimos linea a linea
            String linea;
            while ((linea = buffer1.readLine()) != null) {
                bufferescrito.write(linea);
            }
            bufferescrito.write(" ");
            while ((linea = buffer2.readLine()) != null) {
                bufferescrito.write(linea);
            }
            // Cerramos los buffers
            buffer1.close();
            buffer2.close();
            bufferescrito.close();
        } catch (Exception e) {
            System.out.println("Algo ha fallado");
        }
    }
}
