public class EntradaSalida {
    public static void main(String[] args){
        //Instrucciones de salida de pantalla
        int valor=7;
        System.out.println(valor);
        //Usar printf
        double precio=134.46677;
        System.out.printf("El precio del producto %s tiene una valor de %5.2f y se han comprado %d", "Tablet", precio, valor);
        System.out.println("Que ganas de una vacaciones  \u2661");
        // Se usa hoy en dia formato reciente de System
        System.out.println("El precio del producto "+"Tablet "+"tiene una valor de "+precio);
        //Formato salida texto
        System.out.printf( "%10s, %-10s", "Aurora", "Informática");
        System.out.println();
        //Formto tabla
        System.out.println("|----------|----------|----------|");
        System.out.printf("|%-10s | %-10s | %-10s| \n", "Producto","Cantidad","Valor");
        System.out.println("|----------|----------|----------|");
        System.out.printf("|%-10s | %d | %f | \n", "Producto",valor,precio);


        System.out.println("|----------|----------|----------|");
        System.out.println("|"+"Producto"+"|"+"Cantidad"+"|"+"Precio"+"|");
        System.out.println("|----------|----------|----------|");
        System.out.println("|"+"Tablet"+"|"+valor+"|"+precio+"|");
        System.out.println("|----------|----------|----------|");
    }
}
