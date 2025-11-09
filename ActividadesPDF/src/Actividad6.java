public class Actividad6 {
    public static double [][] operacionesmatrices( int matriz1[][],int matriz2[][]){
        double matrizoperaciones [][] = new double[matriz1.length][3];
        for (int i = 0; i < matriz1.length; i++) {
            int suma = 0;
            int producto = 1;
            
            for (int j = 0; j < matriz1[i].length; j++) {
                suma=suma+matriz1[i][j]+matriz2[i][j];
                producto=producto*matriz1[i][j]*matriz2[i][j];
            }
            matrizoperaciones[i][0] = suma;         
            matrizoperaciones[i][1] = producto;   
            matrizoperaciones[i][2] = (double) suma / matriz1[i].length;
        }
    return matrizoperaciones;
    }
    public static void main(String[] args) {
        /*
         *  Escribir una función que dadas dos matrices devuelve la matriz donde la primera columna es la 
         * suma, la segunda columna el producto y la tercera columna la media de las correspondientes 
         * columnas de las matrices pasadas como argumento.
         */
         
         // Creamos las dos matrices
        int matriz1[][]={{1,2,3},{1,2,3}};
        int matriz2[][]={{4,2,1},{7,2,1}};

        // Creamos la matriz donde guardaremos el resultado
        double matrizresultado [][]=operacionesmatrices(matriz1, matriz2);
        
        // Mostramos la matriz
        System.out.println("Matriz resultado (suma, producto, media):");
        for (int i = 0; i < matrizresultado.length; i++) {
            for (int j = 0; j < matrizresultado[i].length; j++) {
                System.out.print(matrizresultado[i][j] + " ");
            }
            System.out.println();
        }
    }     
}
