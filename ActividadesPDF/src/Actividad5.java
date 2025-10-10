import java.util.Scanner;

public class Actividad5 {
    public static void main(String[] args) {
        // Escribe un programa que muestre tu horario de clase. Si le pides un día de la semana (1 a 5) te 
        // indicará las materias de ese día, si le indicas 6 devolverá el horario completo (hazle formato) y con 
        // 7 se cerrará el programa.
        Scanner teclado = new Scanner(System.in);
            int eleccion; 
            do{
            System.out.println("Introduce de que dia desea ver la asignaturas");
            System.out.println("1. Lunes");
            System.out.println("2. Martes");
            System.out.println("3. Miércoles");
            System.out.println("4. Jueves");
            System.out.println("5. Viernes");
            System.out.println("6. Horario completo");
            System.out.println("Para salir pulse 7");
            eleccion=teclado.nextInt();
            switch (eleccion) {
                case 1:
                    System.out.println("********Lunes********");
                    System.out.println("---------------------");
                    System.out.println("8:00/9:00    IPE.1");
                    System.out.println("9:00/10:00   SISTEMAS INFORMÁTICOS");
                    System.out.println("10:00/11:00  GBD");
                    System.out.println("11:00/11:30  RECREO");
                    System.out.println("11:30/12:30  GBD");
                    System.out.println("12:30/13:30  PROGRAMACIÓN");
                    System.out.println("13:30/14:30  PROGRAMACIÓN");
                    break;
                case 2:
                    System.out.println("********Martes********");
                    System.out.println("---------------------");
                    System.out.println("8:00/9:00    LMSGI");
                    System.out.println("9:00/10:00   SISTEMAS INFORMÁTICOS");
                    System.out.println("10:00/11:00  SISTEMAS INFORMÁTICOS");
                    System.out.println("11:00/11:30  RECREO");
                    System.out.println("11:30/12:30  PROGRAMACIÓN");
                    System.out.println("12:30/13:30  PROGRAMACIÓN");
                    System.out.println("13:30/14:30  ENTORNOS DE DESARROLLO");
                    break;
                case 3:
                    System.out.println("******Miércoles******");
                    System.out.println("---------------------");
                    System.out.println("8:00/9:00    GBD");
                    System.out.println("9:00/10:00   GBD");
                    System.out.println("10:00/11:00  SISTEMAS INFORMÁTICOS");
                    System.out.println("11:00/11:30  RECREO");
                    System.out.println("11:30/12:30  SISTEMAS INFORMÁTICOS");
                    System.out.println("12:30/13:30  PROGRAMACIÓN");
                    System.out.println("13:30/14:30  PROGRAMACIÓN");
                    break;
                case 4:
                    System.out.println("********Jueves********");
                    System.out.println("---------------------");
                    System.out.println("8:00/9:00    PROGRAMACIÓN");
                    System.out.println("9:00/10:00   ENTORNOS DE DESARROLLO");
                    System.out.println("10:00/11:00  ENTORNOS DE DESARROLLO");
                    System.out.println("11:00/11:30  RECREO");
                    System.out.println("11:30/12:30  IPE.1");
                    System.out.println("12:30/13:30  GBD");
                    System.out.println("13:30/14:30  SOSTENIBILIDAD");
                    break;
                case 5:
                    System.out.println("********Viernes********");
                    System.out.println("---------------------");
                    System.out.println("8:00/9:00    GBD");
                    System.out.println("9:00/10:00   DIGITALIZACIÓN");
                    System.out.println("10:00/11:00  LMSGI");
                    System.out.println("11:00/11:30  RECREO");
                    System.out.println("11:30/12:30  LMSGI");
                    System.out.println("12:30/13:30  IPE.1");
                    System.out.println("13:30/14:30  PROGRAMACIÓN");
                    break;
                case 6:
                    System.out.println("***********************HORARIO**************************");
                    System.out.println("--------------------------------------------------------");
                    System.out.println("HORAS       | LUNES | MARTES | MIÉRC | JUEVES | VIERNES");
                    System.out.println("--------------------------------------------------------");
                    System.out.println("8:00/9:00   | IPE.1 | LMSGI  |  GBD  | PROGR  |  GBD  |");
                    System.out.println("9:00/10:00  | SIST. | SIST.  |  GBD  | ENT.DE |  DIGI |");
                    System.out.println("11:00/11:30 |  GBD  | SIST.  | SIST. | ENT.DE | LMSGI |");
                    System.out.println("11:30/21:30 |***************** RECREO ****************|");
                    System.out.println("8:00/9:00   |  GBD  | PROGR  | SIST. | IPE.1  | LMSGI |");
                    System.out.println("8:00/9:00   | PROGR | PROGR  | PROGR |  GBD   |  GBD  |");
                    System.out.println("8:00/9:00   | PROGR | ENT.DE | PROGR | PROGR  |  GBD  |");

                    break;
                default:
                    break;
            }


        }while(eleccion!=7);
        teclado.close();

    }
}
