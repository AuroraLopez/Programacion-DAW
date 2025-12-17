import java.util.Scanner;

public class Actividad2 {
    public static void imprimeMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[] generaFila(int min, int max) {
        int[] fila = new int[5];

        for (int i = 0; i < fila.length; i++) {
            fila[i] = (int) (Math.random() * (max - min + 1)) + min;
        }

        return fila;
    }

    public static void mediaColumnas(int[][] matriz) {
        for (int j = 0; j < matriz[0].length; j++) {
            int suma = 0;
            int media = 0;
            for (int i = 0; i < matriz.length; i++) {
                suma += matriz[i][j];
            }
            System.out.println("Columna " + j + ": " + suma / 5);
        }
    }

    public static void maxMin(int[][] matriz) {
        int max = matriz[0][0], min = matriz[0][0];
        int filaMax = 0, colMax = 0, filaMin = 0, colMin = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                    filaMax = i;
                    colMax = j;
                }

                if (matriz[i][j] < min) {
                    min = matriz[i][j];
                    filaMin = i;
                    colMin = j;
                }
            }
        }

        System.out.println("Máximo: " + max + " (fila " + filaMax + ", col " + colMax + ")");
        System.out.println("Mínimo: " + min + " (fila " + filaMin + ", col " + colMin + ")");
    }

    public static void main(String[] args) {
        /*
         * Escribe un programa que trabaje con una matriz de enteros de tamaño 5 × 5. El
         * programa a través de un menú debe:
         * 1. Rellenar la matriz automáticamente con números enteros aleatorios que el
         * usuario introduce
         * entre un mínimo y máximo para cada fila. Tendrás que verificar que se cumple
         * que
         * mínimo<maximo. En este caso, harás una función generaFila(min,max) y la
         * asignarás a cada
         * fila de la matriz 5x5. (1 punto)
         * 2. Mostrar la matriz en formato de tabla. (0,25 puntos)
         * 3. Calcular y mostrar los siguientes valores sobre la matriz: (1,25 puntos)
         * • La suma de cada diagonal de la matriz.
         * • La media de cada columna.
         * • El valor máximo y mínimo de toda la matriz y su posición (fila y columna).
         * 4. Modifica el valor de una coordenada introducida por el usuario. Hay que
         * verificar que no se
         * introducen valores fuera de sus límites. (0,5 puntos)
         * 
         */
        Scanner teclado = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int opcion;
        do {
            System.out.println("Introduce una opción o -1 para salir");
            System.out.println("1. Rellena la matriz");
            System.out.println("2. Mostrar la matriz en una tabla");
            System.out.println("3. Operaciones con matrices");
            System.out.println("4. Modificar una coordenada");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    matriz[0] = generaFila(1, 50);
                    matriz[1] = generaFila(1, 50);
                    matriz[2] = generaFila(1, 50);
                    matriz[3] = generaFila(1, 50);
                    matriz[4] = generaFila(1, 50);
                    break;
                case 2:
                    System.out.println("Matriz generada");
                    imprimeMatriz(matriz);
                    break;
                case 3:
                    System.out.println("Media por columnas");
                    mediaColumnas(matriz);
                    System.out.println("Máximo y mínimo");
                    maxMin(matriz);
                    break;
                case 4:
                    System.out.println("Introduce la fila que desea modificar");
                    int fila;
                    do {
                       fila=teclado.nextInt(); 
                    } while (fila>5);
                    System.out.println("Introduce la columna que desee modificar");
                    int columna;
                    do {
                       columna=teclado.nextInt(); 
                    } while (columna>=5);
                    System.out.println("Introduce el valor por el cual quieres cambiar el valor de ese sitio");
                    int valor=teclado.nextInt();

                    matriz[fila][columna]= valor;
                    imprimeMatriz(matriz);
                    break;
                default:
                    break;
            }
        } while (opcion != -1);
    }
}
