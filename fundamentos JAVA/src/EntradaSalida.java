import java.util.Scanner;

public class EntradaSalida {
    public static void main(String[] args){
        // //Instrucciones de salida de pantalla
        // int valor=7;
        // System.out.println(valor);
        // //Usar printf
        // double precio=134.46677;
        // System.out.printf("El precio del producto %s tiene una valor de %5.2f y se han comprado %d", "Tablet", precio, valor);
        // System.out.println("Que ganas de una vacaciones  \u2661");
        // // Se usa hoy en dia formato reciente de System
        // System.out.println("El precio del producto "+"Tablet "+"tiene una valor de "+precio);
        // //Formato salida texto
        // System.out.printf( "%10s, %-10s", "Aurora", "Informática");
        // System.out.println();
        // //Formto tabla
        // System.out.println("|----------|----------|----------|");
        // System.out.printf("|%-10s | %-10s | %-10s| \n", "Producto","Cantidad","Valor");
        // System.out.println("|----------|----------|----------|");
        // System.out.printf("|%-10s | %d | %f | \n", "Producto",valor,precio);


        // System.out.println("|----------|----------|----------|");
        // System.out.println("|"+"Producto"+"|"+"Cantidad"+"|"+"Precio"+"|");
        // System.out.println("|----------|----------|----------|");
        // System.out.println("|"+"Tablet"+"|"+valor+"|"+precio+"|");
        // System.out.println("|----------|----------|----------|");

        //Operaciones con pedido de datos
        //Iniciar la entrada del teclado
        Scanner teclado = new Scanner(System.in);
           
            //Lee el nombre
            System.out.println("Introduce: Nombre");
            String nombre = teclado.nextLine();
            //Lee el apellido
            System.out.println("Introduce: Apellido");
            String apellido = teclado.nextLine(); //Si se pidiera de uno en uno hay que poner nextLine()
            
            //Lee la edad
            System.out.println("Introduce: Edad");
            // int edad = teclado.nextInt();
            // // Opcion 1 para limpiar el buffer
            // teclado.nextLine(); // Para que no se lea el salto de linea del nextint(limpiar el buffer para el salto del linea)
            //Opcion 2 para limpiar el buffer
            int edad=Integer.parseInt(teclado.nextLine()); //Lee la cadena y la pasa a entero
            //Lee la profesion
            System.out.println("Introduce: Profesión");
            String profesion = teclado.nextLine();
            
            // Muestra el resultado
            System.out.println("El usuario se llama " + nombre +" "+ apellido+" .Tiene " + edad +" años y trabaja de " + profesion);
        // System.out.println("Introduce la cadena de texto deseada");
        // String frase=teclado.nextLine();
        // System.out.println("La cadena es: " +frase);
        // int numero=teclado.nextInt();
        // System.out.println("El numero introducido es: " +numero);





        teclado.close(); // cerrar el flujo de entrada
    }
}
