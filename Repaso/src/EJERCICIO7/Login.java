package EJERCICIO7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        HashMap<String, String> usuarios = new HashMap<>();
        File fichero = new File("src/EJERCICIO7/usuarios.txt");
        try {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");
                usuarios.put(datos[0], datos[1]);
            }
            br.close();

            Scanner sc = new Scanner(System.in);
            int intentos = 3;

            while (intentos > 0) {
                System.out.print("Usuario: ");
                String user = sc.nextLine();
                System.out.print("Password: ");
                String password = sc.nextLine();

                if (usuarios.containsKey(user) && usuarios.get(user).equals(password)) {
                    System.out.println("Acceso permitido");
                    return;
                } else {
                    intentos--;
                    System.out.println("Datos incorrectos");
                }
            }

            System.out.println("Acceso denegado");
        } catch (Exception e) {
            System.out.println("Error al leer");
        }
    }
}
