import java.util.Scanner;

public class Actividad10 {
    public static void main(String[] args) {
        // Desarrolla un programa que simule una calculadora según la opción introducida y que pida los operandos hasta que introduces -1
        int eleccion; int num; int num2; int suma; int resta; int multiplicar; int dividir;
        Scanner teclado= new Scanner(System.in);
        do{
            System.out.println("Introduce que elección desea");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("Para salir pulse -1");
            eleccion=teclado.nextInt();
            switch (eleccion) {
                case 1:
                    System.out.println("Introduxca dos números");
                    num=teclado.nextInt();
                    num2=teclado.nextInt();
                    System.out.println("La suma es "+(num+num2));
                    break;
                case 2:
                                
                default:
                    break;
            }


        }while(eleccion!=-1);

        teclado.close();
    }
}
