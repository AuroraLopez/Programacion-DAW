import java.util.ArrayList;
import java.util.Scanner;

public class Actividad1 {
    public static ArrayList<Integer> validacion(int[] temasestudiados, ArrayList<Integer> temascaidos) {
        ArrayList<Integer> temascoincidentes = new ArrayList<>(5);
        for (int i = 0; i < temasestudiados.length; i++) {
            if (temascaidos.contains(temasestudiados[i])) {
                temascoincidentes.add(temasestudiados[i]);
            }
        }
        temascoincidentes.sort((a, b) -> {
            return -1 * a.compareTo(b);
        });
        return temascoincidentes;
    }

    public static void main(String[] args) {
        /*
         * 1. (3 puntos) Para las oposiciones de informática se van a sacar 5 bolas de
         * entre 65 temas a estudiar.
         * El opositor se ha estudiado los temas: 4, 11, 23, 34, 35, 36, 39, 50, 60 y
         * 65. En un menú tendrás las
         * siguientes acciones:
         * 1. Generar un vector aleatorio donde asegures que no se repita ningún número.
         * Ejemplo:
         * {1,60,44,12,23} (1,5 puntos)
         * 2. Realiza un función que valide el vector generado con el vector del
         * opositor y devuelva los
         * temas que coinciden ordenados. Si hay coincidencias dile enhorabuena y si no,
         * que lo
         * sientes. En el ejemplo, dirá: “Temas coincidentes: 23, 60. Enhorabuena” (1,5
         * puntos)
         * Elabora este programa utilizando la clase ArrayList<Integer>.
         */
        Scanner teclado = new Scanner(System.in);
        int[] temasestudiados = { 4, 11, 23, 34, 35, 36, 39, 50, 60, 65 };
        ArrayList<Integer> temascaidos = new ArrayList<>(5);
        ArrayList<Integer> temascoincidentes = new ArrayList<>(5);
        int opcion;
        do {
            System.out.println("Introduzca una opción o -1 para salir");
            System.out.println(" 1. Generar un vector aleatorio donde asegures que no se repita ningún número.");
            System.out.println(
                    " 2. Realiza un función que valide el vector generado con el vector del opositor y devuelva lo temas que coinciden ordenados.");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    for (int i = 0; i < 5; i++) {
                        int numero = (int) (Math.random() * (65 - 1 + 1)) + 1;
                        if (temascaidos.contains(numero)) {
                            System.out.println("Ese numero está repetido");
                        } else {
                            temascaidos.add(i, numero);
                        }
                    }
                    // Mostrar la matriz
                    System.out.println("Matriz de examen");
                    for (int i = 0; i < temascaidos.size(); i++) {
                        System.out.println(temascaidos.get(i) + " ");
                    }
                    break;
                case 2:
                    temascoincidentes = validacion(temasestudiados, temascaidos);
                    System.out.println("Temas coincidentes: ");
                    for (int i = 0; i < temascoincidentes.size(); i++) {
                        System.out.println(temascoincidentes.get(i));
                    }
                    System.out.println("¡EHNORABUENA!");
                    break;
                default:
                    break;
            }
        } while (opcion != -1);
    }
}
