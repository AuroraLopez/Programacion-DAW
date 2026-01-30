package Actividades.Actividad4;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Actividad4 {
    public static void main(String[] args) {
        /*
         * ¿Y si tuvieras que escribir un array como la Bonoloto?
         */

        int bonoloto []={10,21,32,43,54};
        int num;
        try {
            FileWriter archivo=new FileWriter("C:\\Users\\Auri\\Desktop\\1DAW\\Programacion\\Programacion-DAW\\Unidad5\\src\\Actividades\\Actividad4\\bonoloto.txt");
            BufferedWriter escritor=new BufferedWriter(archivo);
            for (int i = 0; i < bonoloto.length; i++) {
                num=bonoloto[i];
                escritor.write(num + " ");
                escritor.flush();
            }
            escritor.close();
            System.out.println("El archivo ha sido escrito correctamente");
        } catch (Exception e) {
            System.out.println("Uy, algo ha ocurrido");
        }
        
    }
}
