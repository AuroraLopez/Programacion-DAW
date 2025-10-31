import java.util.Scanner;

public class Actividad6 {
    public static void main(String[] args) {
        /*
         *  6. Escribe un programa que genere la nómina (bien desglosada) de un empleado según las 
         * siguientes condiciones:
         *      • Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 – Jefe de proyecto), 
         *      los días que ha estado de viaje visitando clientes durante el mes y su estado civil (1 - 
         *      Soltero, 2 - Casado).
         *      • El sueldo base según el cargo es de 950€, 1200€ y 1600€ euros según si se trata de un prog. 
         *      junior, un prog. senior o un jefe de proyecto respectivamente.
         *      • Por cada día de viaje visitando clientes se pagan 30 euros extra en concepto de dietas. Al 
         *      sueldo neto hay que restarle el IRPF, que será de un 25% en caso de estar soltero y un 20% 
         *      en caso de estar casado
         */

         Scanner teclado = new Scanner(System.in);
        // Leemos las distintas variables
         System.out.println("Introduce tu cargo: 1(Prog. junior), 2(Prog. senior) y 3(Jefe del proyecto)");
         int cargo=teclado.nextInt();
         System.out.println("Cuántos días ha estado de viaje visitando clientes?");
         int dias=teclado.nextInt();
         System.out.println("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
         int estcivil=teclado.nextInt();
         double salario =0; double IRPF=0; double dietas=0; double sueldobruto=0;
        // Ponemos el salario por cargo
         switch (cargo) {
            case 1:
                salario=950;
                dietas=dias*30;
                sueldobruto= salario+dietas;
                break;
            case 2:
                salario=1200;
                dietas=dias*30;
                sueldobruto= salario+dietas;
                break;
            case 3:
                salario=1600;
                dietas=dias*30;
                sueldobruto= salario+dietas;
                break;
            default:
                break;
         }
         // Aplicación del IRPF
         if (estcivil==1){
            IRPF=sueldobruto*0.25;
         }
         else if(estcivil==2){
            IRPF=sueldobruto*0.20;
         }
         else{
            System.out.println("Valor incorrecto");
         }
         // hacemos el sueldo neto
         double sueldoneto=sueldobruto-IRPF;
         // Imprimimos la nómina
         System.out.println("---------------------------------------------");
         System.out.println("| Sueldo base                  "+salario+"      |");
         System.out.println("| Dietas ( "+dias+" viajes)            "+dietas+"      |");
         System.out.println("|------------------------------------------|");
         System.out.println("|Sueldo bruto                  "+sueldobruto+"      |");
         System.out.println("|Retención IRPF                "+IRPF+"       |");
         System.out.println("|------------------------------------------|");
         System.out.println("|Sueldo neto                   "+sueldoneto+"       |");
         System.out.println("---------------------------------------------");
         
         teclado.close();
    }
}
