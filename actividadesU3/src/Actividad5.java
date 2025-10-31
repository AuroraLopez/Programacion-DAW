import java.util.ArrayList;
import java.util.Scanner;

public class Actividad5 {
    public static void main(String[] args) {
        /*
         * Usa un ArrayList<String> para almacenar nombres
         * introducidos por el usuario hasta que escriba “fin”. Interesa que no se
         * repitan nombres y al terminar muestra todos los nombres ordenados.
         */

        do{
        Scanner teclado= new Scanner(System.in);
        ArrayList<String> array=new ArrayList<>();
        array.add(teclado.nextLine());
        }while(array!="fin")
    }
}
