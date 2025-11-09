public class Actividad7 {
    public static void main(String[] args) {
        /*
         * Realiza un programa que sea capaz de rotar todos los elementos de una matriz cuadrada una 
         * posición en el sentido de las agujas del reloj. La matriz debe tener 5 filas por 5 columnas y debe 
         * contener números generados al azar entre 0 y 100. Se debe mostrar tanto la matriz original como la 
         * matriz resultado. No necesitas hacer un código que te automatice para cualquier tamaño de matriz, 
         * sino que se trata de utilizar asignación de datos en una matriz.
         */
        int [][] matrizoriginal = new int [5][5];
        // Rellenar matriz aleatoriamente
        for(int i=0;i<5;i++ ){
            for(int j=0;j<5;j++){
                int aleatorio=(int)(Math.random()*(100-0+1))+0;
                matrizoriginal[i][j]=aleatorio;
            }
        }

        // Mostrar matriz original
        System.out.println("Matriz original");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrizoriginal[i][j] + " ");
            }
            System.out.println();
        }
        
        // Crear la nueva matriz rotada
        int matrizrotada[][]= new int[matrizoriginal.length][matrizoriginal.length];

        // Para hacerlo me ayude de esta pagina https://lineadecodigo.com/java/rotar-una-matriz/
        // Rotar la matriz 90 grados
        for (int i=0;i<matrizoriginal.length;i++) {
            for (int j=0;j<matrizoriginal.length;j++) {
            matrizrotada[j][matrizoriginal.length-1-i] = matrizoriginal[i][j];
            }   
        }

        // Mostrar matriz rotada
        System.out.println("Matriz rotada 90º");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrizrotada[i][j] + " ");
            }
            System.out.println();
        }
    }
}
