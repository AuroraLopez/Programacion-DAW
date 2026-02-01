package Actividad5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Actividad5 {
    public static void main(String[] args) {
        HashMap<String, String> usuarios = new HashMap<>();
        String fichero = "C:\\Users\\USER\\Desktop\\1DAW\\Programacion-DAW\\Programacion\\ActividadesPDF\\src\\Actividad5\\usuarios.txt";

        // Leer usuarios del fichero
        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split("-");

                if (partes.length == 2) {
                    String usuario = partes[0];
                    String password = partes[1];
                    usuarios.put(usuario, password);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el fichero.");
            return;
        }

        Scanner sc = new Scanner(System.in);
        int intentos = 3;
        boolean acceso = false;

        while (intentos > 0 && !acceso) {
            System.out.print("Usuario: ");
            String usuario = sc.nextLine();

            System.out.print("Contraseña: ");
            String password = sc.nextLine();

            if (usuarios.containsKey(usuario) &&
                    usuarios.get(usuario).equals(password)) {

                acceso = true;
                System.out.println("Ha accedido al área restringida");

            } else {
                intentos--;
                System.out.println("Datos incorrectos. Intentos restantes: " + intentos);
            }
        }

        if (!acceso) {
            System.out.println("Lo siento, no tiene acceso al área restringida");
        }

        sc.close();
    }
}
