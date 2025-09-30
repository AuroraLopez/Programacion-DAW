import java.util.Scanner;

public class Condicionales {
    public static void main(String [] args){
        //Mnaejo de if-else
        // int user = 17;
        // if(user <= 18){
        //     System.out.println("Usuario es muy joven");}
        // else{
        //     System.out.println("Usuario es mayor de edad");
        // }
        int user = 45;
        if(user <= 18){
            System.out.println("Usuario es muy joven");}
        else if(user > 18 && user < 40){
            System.out.println("Usuario está entre los 19 y 39 años");
        }
        else if(user == 45 || user == 50){
            System.out.println("Usuario tiene 40 o 50 años");
        }
        else{
            System.out.println("Usuario tiene más de 40 años");
        }
        // Comprobar si un numero es divisible por 2 y por 3
        /*
         * Pseudocodigo
         * INICIO
         *      LEER NUMERO
         *       SI ES DIVISIBLE
         *          IMPRIME SI ES DIVISIBOLE
         *       SI NO
         *          IMPRIME NO ES DIVISIBLE
         *       FIN_SI
         * FIN
        */
        int num=6;
        if (num%2==0 && num%3==0) {
            System.out.println("Es divisible entre 2 y 3");
        }
        else{

            System.out.println("No es divisible entre 2 y 3");           
        }

        //Haz un programa al que le pasas un entero y te dice el nombre del mes correspondiente.
        /*
         * PSEUDOCODIGO
         * INICIO
         *      LEER NUMERO
         *      COMPROBAR EL NUMERO
         *      IMPRIMIR EL MES
         * FIN
         */
        ;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int nummes = teclado.nextInt();
        //  if (nummes==1) {
        //     System.out.println("El mes 1 es Enero");
        //  }
        //  else if(nummes==2){
        //     System.out.println("El mes 2 es Febrero");
        //  }
        //  else if(nummes==3){
        //     System.out.println("El mes 3 es Marzo");
        //  }
        //  else if(nummes==4){
        //     System.out.println("El mes 4 es Abril");
        //  }
        //  else if(nummes==5){
        //     System.out.println("El mes 5 es Mayo");
        //  }
        //  else if(nummes==6){
        //     System.out.println("El mes 6 es Junio");
        //  }
        //  else if(nummes==7){
        //     System.out.println("El mes 7 es Julio");
        //  }
        //  else if(nummes==8){
        //     System.out.println("El mes 8 es Agosto");
        //  }
        //  else if(nummes==9){
        //     System.out.println("El mes 9 es Septiembre");
        //  }
        //  else if(nummes==10){
        //     System.out.println("El mes 10 es Octubre");
        //  }
        //  else if(nummes==11){
        //     System.out.println("El mes 11 es Noviembre");
        //  }
        //  else if(nummes==12){
        //     System.out.println("El mes 12 es Diciembre");
        //  }
        //  else{
        //     System.out.println("No ha proporcionado un numero válido");
        //  }


        // Vamos a hacerlo con un switch
        switch (nummes) {
            case 1:
                System.out.println("ENERO");
                break;
            case 2:
                System.out.println("FEBRERO");
                break;
            case 3:
                System.out.println("MARZO");
                break;
            case 4:
                System.out.println("ABRIL");
                break;
            case 5:
                System.out.println("MAYO");
                break;
            case 6:
                System.out.println("JUNIO");
                break;
            case 7:
                System.out.println("JULIO");
                break;
            case 8:
                System.out.println("AGOSTO");
                break;
            case 9:
                System.out.println("SEPTIEMBRE");
                break;
            case 10:
                System.out.println("OCTUBRE");
                break;
            case 11:
                System.out.println("NOVIEMBRE");
                break;
            case 12:
                System.out.println("DICIEMBRE");
                break;
            default:
                System.out.println("Valor Incorrecto");
                break;
        }
         teclado.close();
         
    }
}
