import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        //  Escribe un programa que nos diga el signo del zodiaco a partir del día y el mes de nacimiento. 
        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduce dia mes(numeros)");
        int dia = teclado.nextInt();
        int mes = teclado.nextInt();
        switch (mes) {
            case 1:
                if (dia>0 && dia<20) {
                    System.out.println("Dia: "+dia+ " Mes: "+mes+ " Es Capricornio");
                }
                else{
                    System.out.println("Dia: "+dia+ " Mes: "+mes+ " Es Acuario");
                }
                break;
            case 2:
                if (dia>=0 && dia<=18) {
                    System.out.println("Dia: "+dia+ " Mes: "+mes+ " Es Acuario");
                }
                else{
                    System.out.println("Dia: "+dia+ " Mes: "+mes+ " Es Piscis");
                }
                break;
            case 3:
                if (dia>=0 && dia<=20) {
                    System.out.println("Dia: "+dia+ " Mes: "+mes+ " Es Piscis");
                }
                else{
                    System.out.println("Dia: "+dia+ " Mes: "+mes+ " Es Aries");
                }
                break;
            case 4:
                if (dia>=0 && dia<=19) {
                    System.out.println("Dia: "+dia+ " Mes: "+mes+ " Es Aries");
                }
                else{
                    System.out.println("Dia: "+dia+ " Mes: "+mes+ " Es Tauro");
                }
                break; 
            case 5:
                if (dia>=0 && dia<=20) {
                    System.out.println("Dia: "+dia+ " Mes: "+mes+ " Es Tauro");
                }
                else{
                    System.out.println("Dia: "+dia+ " Mes: "+mes+ " Es Géminis");
                }
                break;   
            case 6:
                if (dia>=0 && dia<=18) {
                    System.out.println("Dia: "+dia+ " Mes: "+mes+ " Es Géminis");
                }
                else{
                    System.out.println("Dia: "+dia+ " Mes: "+mes+ " Es Cáncer");
                }
                break;
            case 7:
                if (dia>=0 && dia<=22) {
                    System.out.println("Dia: "+dia+ " Mes: "+mes+ " Es Cancer");
                }
                else{
                    System.out.println("Dia: "+dia+ " Mes: "+mes+ " Es Leo");
                }
                break;
            case 8:
                if (dia>=0 && dia<=22) {
                    System.out.println("Dia: "+dia+ " Mes: "+mes+ " Es Leo");
                }
                else{
                    System.out.println("Dia: "+dia+ " Mes: "+mes+ " Es Virgo");
                }
                break;
            case 9:
                if (dia>=0 && dia<=22) {
                    System.out.println("Dia: "+dia+ " Mes: "+mes+ " Es Virgo");
                }
                else{
                    System.out.println("Dia: "+dia+ " Mes: "+mes+ " Es Libra");
                }
                break;
            case 10:
                if (dia>=0 && dia<=21) {
                    System.out.println("Dia: "+dia+ " Mes: "+mes+ " Es Libra");
                }
                else{
                    System.out.println("Dia: "+dia+ " Mes: "+mes+ " Es Escorpio");
                }
                break;
            case 11:
                if (dia>=0 && dia<=21) {
                    System.out.println("Dia: "+dia+ " Mes: "+mes+ " Es Escorpio");
                }
                else{
                    System.out.println("Dia: "+dia+ " Mes: "+mes+ " Es Sagitario");
                }
                break;
            case 12:
                if (dia>=0 && dia<=19) {
                    System.out.println("Dia: "+dia+ " Mes: "+mes+ " Es Sagitario");
                }
                else{
                    System.out.println("Dia: "+dia+ " Mes: "+mes+ " Es Capricornio");
                }
                break;
            default:
                break;
        }
        teclado.close();
    }
}
