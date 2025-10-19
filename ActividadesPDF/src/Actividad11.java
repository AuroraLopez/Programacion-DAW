import java.util.Scanner;

public class Actividad11 {
    // Función de suma
    public static int suma(int num, int num2){
        return num+num2;
    }
    //Función de resta
    public static int resta(int num, int num2){
        return num-num2;
    }
    // Función de multiplicación
    public static int multiplicar(int num, int num2){
        return num*num2;
    }
    // Función de división
    public static int dividir(int num, int num2){
        // Condiciones para ver cual es mayor
        if(num>num2){
            int mayor=num;
            return mayor/num2; 
        }
        else{
            int mayor=num2;
            return mayor/num;
        }
    }
    public static void main(String[] args) {
        /*
         *  Desarrolla un programa que use funciones creadas para simular una calculadora según la opción 
         *  introducida y que pida los operandos hasta que introduces -1. El menú será un procedimiento.
         */
        

         // Leemos variables
         Scanner teclado =  new Scanner(System.in);
         int eleccion;
         // Bucle del menu
         do{
            System.out.println("Introduce que elección desea:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("Para salir pulse -1");
            
            eleccion=teclado.nextInt();
            switch (eleccion) {
            case 1:
                System.out.println("Introduzca dos números");
                int num=teclado.nextInt();
                int num2=teclado.nextInt();
                System.out.println("Al sumar da "+(suma(num, num2)));
                break;
            case 2:
                System.out.println("Introduzca dos números");
                num=teclado.nextInt();
                num2=teclado.nextInt();
                System.out.println("Al restar da "+(resta(num, num2)));
                break;
            case 3:
                System.out.println("Introduzca dos números");
                num=teclado.nextInt();
                num2=teclado.nextInt();
                System.out.println("Al multiplicar da "+(multiplicar(num, num2)));
                break;
            case 4:
                System.out.println("Introduzca dos números");
                num=teclado.nextInt();
                num2=teclado.nextInt();
                System.out.println("Al dividir da "+(dividir(num, num2)));;
                break;
            default:
                break;
        }
         }while(eleccion!=-1);

         
        teclado.close();
    }
}
