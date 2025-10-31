import java.util.Scanner;

public class Arrays {
    public static void imprimeArray(double[] array){
        System.out.println(array[1]);
    }
    public static double devolverArray(double[] a){
        return a[1]=(a[1]*3);
    }
    public static void main(String[] args) throws Exception {
        //Array estático
        double calificaciones[]={7,8,2,4,8,9};

        // Array dinámico
        double[] calificaciones2;
        System.out.println("Indica el tamaño del aray calificaciones2: ");
        Scanner teclado= new Scanner(System.in);
        calificaciones2=new double[teclado.nextInt()];
        System.out.println(calificaciones2);


        //Array que apunta al mismo sitio
        double calificacionesOtro[];
        calificacionesOtro =calificaciones2;
        System.out.println(calificacionesOtro[3]);
        System.out.println(calificaciones2[3]);

        double resultado=devolverArray(calificaciones);
        // System.out.println(resultado[1]);

        //Matrices
        String[][] comida={{"arroz","manzana","conejo"},{"verdura","pollo","fresa"},{"patatas", "pera", "lentejas"}};
        System.out.println(comida[0][2]);
        String[] aux=comida[1];
        System.out.println("Matriz "+comida[1][2]);
        System.out.println("Vector "+aux[2]);


        //Usar la memoria dinámica reservada
        calificaciones2[3]=5;
        System.out.println(calificaciones2[3]);
        System.out.println(calificaciones2[1]);

        // Recorrer un vector
        int[] vector={7,5,4,3};
        for(int i=0;i<vector.length;i++){
            System.out.print(vector[i]+" ");
        }
        System.out.println();

        // Recorrerlo al reves
        for(int i=vector.length-1;i>=0;i--){
            System.out.print(vector[i]+" ");
        }
        System.out.println();

        // Practica recorrer matrices
  
    }
}
