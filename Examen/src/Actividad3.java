import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        /*
         * Realiza un programa que almacena tu horario de clase y a partir de un menú se
         * pueda realizar: 1- Mostrar el horario de clase, 2- Obtener las clases de un
         * día indicado, 3- Obtener
         * las clases de una hora indicada, 4- Modificar la clase de un día a otro,
         * donde se pida el día y hora de
         * origen y destino del cambio. Ej: Cambiar la clase del lunes a tercera por el
         * viernes a quinta. 5- Salir
         * del programa
         */
        Scanner teclado = new Scanner(System.in);
        String[][] horario = {
                { "LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES" },
                { "IPE.1", "LMSGI", "   GBD  ", "   PROG ", "GBD  " },
                { "SIST ", "SIST ", "   GBD  ", "   ENT.I", "DIGI " },
                { "GBD  ", "SIST ", "   SIST ", "   ENT.I", "LMSGI" },
                { "GBD  ", "PROG ", "   SIST ", "   IPE.1", "LMSGI" },
                { "PROG ", "PROG ", "   PROG ", "   GBD  ", "IPE.1" },
                { "PROG ", "ENT.I", "   PROG ", "   SOST ", "PROG " },
        };

        int opcion;
        do {
            System.out.println("Introduce una opción o 5 para salir:");
            System.out.println("1. Mostrar el horario de clase");
            System.out.println("2. Obtener las clases de un día indicado");
            System.out.println("3. Obtener las clases de una hora indicada");
            System.out.println("4. Modificar la clase de un día a otro");
            System.out.println("5. Salir");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    // Mostramos el horario
                    System.out.println("Horario");
                    for (int i = 0; i < horario.length; i++) {
                        for (int j = 0; j < horario[i].length; j++) {
                            System.out.print(horario[i][j] + "     ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    teclado.nextLine();
                    System.out.println("¿Qué dias desea ver? Pongalo en Mayúscula");
                    String dia = teclado.nextLine();
                    for (int i = 0; i < horario.length; i++) {
                        for (int j = 0; j < horario[i].length; j++) {
                            if (horario[0][j].equals(dia)) {
                                System.out.print(horario[i][j] + " ");
                            }
                        }
                    }
                    System.out.println("");
                    break;
                case 3:
                    teclado.nextLine();
                    System.out.println("¿Qué día desea ver? Escríbalo en mayúsculas:");
                    String dia2 = teclado.nextLine();
                    int colDia2 = -1;
                    for (int j = 0; j < horario[0].length; j++) {
                        if (horario[0][j].equals(dia2)) {
                            colDia2 = j;
                            break;
                        }
                    }

                    if (colDia2 == -1) {
                        System.out.println("Ese día no existe.");
                        break;
                    }

                    System.out.println("Seleccione la hora (1 = primera, 2 = segunda, ...):");
                    int hora = teclado.nextInt();
                    if (hora >= 1 && hora < horario.length) {
                        System.out.println("Materia: " + horario[hora][colDia2]);
                    } else {
                        System.out.println("Hora inválida.");
                    }

                    break;
                case 4:

                    break;
                default:
                    break;
            }
        } while (opcion != 5);
    }
}
