package EJERCICIO1;

import java.io.*;
import java.util.Scanner;

    public class LeerRuta {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Introduce el nombre del 1er fichero");
            String fichero1 = sc.nextLine();
            System.out.println("Introduce el nombre del 2º fichero");
            String fichero2 = sc.nextLine();
            System.out.println("Introduce el nombre del 3º fichero");
            String fichero3 = sc.nextLine();
            System.out.println("Introduce la ruta de destino");
            String rutaDestino = sc.nextLine();

            try {
                File ficheros1 = new File(fichero1);
                File ficheros2 = new File(fichero2);
                File ficheros3 = new File(fichero3);

                if (ficheros1.exists() && ficheros2.exists() && ficheros3.exists()) {

                    String nuevoNombre = ficheros1.getName() + "_" +
                            ficheros2.getName() + "_" +
                            ficheros3.getName();

                    File ficheroSalida = new File(rutaDestino, nuevoNombre);
                    BufferedWriter bw = new BufferedWriter(new FileWriter(ficheroSalida));

                    // FICHERO 1
                    FileReader fr1 = new FileReader(ficheros1);
                    BufferedReader br1 = new BufferedReader(fr1);
                    String linea;

                    while ((linea = br1.readLine()) != null) {
                        bw.write(linea);
                        bw.newLine();
                    }
                    br1.close();

                    bw.newLine();

                    // FICHERO 2
                    FileReader fr2 = new FileReader(ficheros2);
                    BufferedReader br2 = new BufferedReader(fr2);

                    while ((linea = br2.readLine()) != null) {
                        bw.write(linea);
                        bw.newLine();
                    }
                    br2.close();

                    bw.newLine();

                    // FICHERO 3
                    FileReader fr3 = new FileReader(ficheros3);
                    BufferedReader br3 = new BufferedReader(fr3);

                    while ((linea = br3.readLine()) != null) {
                        bw.write(linea);
                        bw.newLine();
                    }
                    br3.close();

                    bw.close();
                    System.out.println("Fichero creado correctamente");

                } else {
                    System.out.println("Alguno de los ficheros no existe");
                }

            } catch (Exception e) {
                System.out.println("Error");
            }
        }
    }


