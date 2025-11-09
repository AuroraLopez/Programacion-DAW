import java.util.ArrayList;
import java.util.Scanner;

public class Actividad9 {

    public static void main(String[] args) {
        /*
         * Utilizando ArrayList<Integer> crea un programa con un menú que permita al usuario:
         * 1. Agregar un número (si es negativo se le pedirá que meta otro)
         * 2. Eliminar un número (tantos como haya)
         * 3. Mostrar todos los números
         * 4. Comprobar si un número está en la lista
         * 5. Eliminar todos los números
         *  6. Consultar el tamaño de la lista
         */
        Scanner teclado= new Scanner(System.in);
        // Inicializamos variables
        int opcion; int numero;
        ArrayList<Integer> arraydatos=new ArrayList<>();
        // Realizamos el bucle del menu
        do{
            System.out.println("Introduce que elección desea:");
            System.out.println("1. Agregar un número");
            System.out.println("2. Eliminar un número");
            System.out.println("3. Mostrar todos los números");
            System.out.println("4. Comprobar si un número está en la lista");
            System.out.println("5. Eliminar todos los números");
            System.out.println("6. Consultar el tamaño de la lista");
            System.out.println("Para salir pulse -1");
            opcion=teclado.nextInt();
            // Ponemos condiciones o instrucciones a cada opcion
            switch (opcion) {
                case 1:
                    System.out.println("¿Qué numero desea añadir?");
                    // Bucle para pedir solo positivos
                    do{
                        numero=teclado.nextInt();
                        System.out.println("Error elija un número que no sea negativo");
                    }while (numero<0);
                    // Linea para añadir el numero al array
                    arraydatos.add(numero);
                    break;
                 case 2:
                    System.out.println("Estos son los numeros que hay.");
                    // Bucle que recorre los datos y los enseña
                    for(int i=0;i<arraydatos.size();i++){
                        System.out.print(arraydatos.get(i)+" ");
                    }
                    System.out.println();
                    // Eleccion del numero deseado a eliminar
                    System.out.println("¿Qué numero desea eliminar?");
                    final int numeroeliminar=teclado.nextInt(); // Tiene que ser final porque si no no funciona el removeIf
                    arraydatos.removeIf(n->n==numeroeliminar);
                    
                    // Para borrar lo hice asi porque no vi la parte final del pdf por eso esto está comentado
                    // for(int i=0;i<arraydatos.size();i++){
                    //     if (arraydatos.get(i)==numero) {
                    //         arraydatos.remove(i);                        
                    //     }
                    //     else{
                    //         System.out.println("Ese número no está en la lista");
                    //     }
                    // }
                    break;
                 case 3:
                    // Muestra todos los datos recorriendo el array
                    for(int i=0;i<arraydatos.size();i++){
                        System.out.print(arraydatos.get(i)+" ");
                    }
                    System.out.println();
                    break;
                 case 4:
                    System.out.println("Introduzca el numero que desea comprobar");
                    numero=teclado.nextInt();
                    // Condición para comprobar si el numero esta o no
                    if (arraydatos.contains(numero)) {
                        System.out.println("El " +numero+" si está en la lista");
                    }
                    else{
                        System.out.println("El "+numero+" no está en la lista");
                    }
                    break;
                 case 5:
                    // Comando de arraylist para eliminar todos los datos
                    arraydatos.removeAll(arraydatos);
                    System.out.println("Todos los numeros han sido eliminados");
                    break;
                 case 6:
                    // Comando de arralist para poder ver el tamaño del array
                    System.out.println("El tamaño de la lista es de: "+arraydatos.size()+ "elementos");
                    break;
            
                default:
                    break;
            }
        }while(opcion!=-1);
        teclado.close();

    }
}
