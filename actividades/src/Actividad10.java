import java.util.Scanner;

public class Actividad10 {
    public static void main(String[] args) {
        // EJERCICIO 6 DIAPOSITIVA 17
        // Desarrolla un programa que simule una calculadora según la opción introducida y que pida los operandos hasta que introduces -1
        // Inicializamos variables para su posterior uso
        int eleccion; int num; int num2;
        Scanner teclado= new Scanner(System.in);
        // Bucle para mostrar el menu todo el rato hasta que se cancele
        do{
            System.out.println("Introduce que elección desea:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("Para salir pulse -1");
            eleccion=teclado.nextInt();
            // Para la elección hacer sus respectivas cuentas
            switch (eleccion) {
                case 1:
                    System.out.println("Introduzca dos números");
                    num=teclado.nextInt();
                    num2=teclado.nextInt();
                    System.out.println("La suma es "+(num+num2));
                    break;
                case 2:
                    System.out.println("Introduzca dos números");
                    num=teclado.nextInt();
                    num2=teclado.nextInt();
                    System.out.println("La resta es "+(num-num2));
                    break;
                case 3:
                    System.out.println("Introduzca dos números");
                    num=teclado.nextInt();
                    num2=teclado.nextInt();
                    System.out.println("La multiplicación es "+(num*num2));
                    break;
                case 4:
                    System.out.println("Introduzca dos números");
                    num=teclado.nextInt();
                    num2=teclado.nextInt();
                    System.out.println("La división es "+(num/num2));
                    break;
                default:
                    break;
            }
        }while(eleccion!=-1);

        teclado.close();
    }
}
