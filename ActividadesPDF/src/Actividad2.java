import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {
        /*
         * 2. Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta que las 
         * horas ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se 
         * pagan a 16 euros la hora.
         * Ejemplos de salida:
         * Por favor, introduzca el número de horas trabajadas durante la semana: 36
         * El sueldo semanal que le corresponde es de 432 euros
         * Por favor, introduzca el número de horas trabajadas durante la semana: 55
         * El sueldo semanal que le corresponde es de 720 euros
         */
        /*
         * PSEUDOCODIGO
         * INICIO
         *      VARIABLE SALARIO
         *      LEER NUMERO SEMANAL
         *      SI HORAS <= 40
         *          SALARIO=HORAS*12
         *      SI HORAS > 40
         *          INT HORAS_EXTRAS;
         *          HORAS_EXTRAS=HORAS - 40
         *          SALARIO=(40*12)+(HORAS_EXTRAS*16)
         *      IMPRIME "El sueldo semanal que le responde es de SALARIO"
         * FIN   
         */
        Scanner teclado=new Scanner(System.in);
        System.out.println("Por favor, introduzca el número de horas trabajadas durante la semana: ");
        int salario;
        int horas=teclado.nextInt();
        if (horas<=40) {
            salario=horas*12;
            System.out.println("El sueldo semanal que le corresponde es de: "+salario+"euros");
        }
        else if (horas>40) {
            int horas_extras = horas-40;
            salario=(40*12)+(horas_extras*16);
            System.out.println("El sueldo semanal que le corresponde es de: "+salario+" euros");
        }
        else{
            System.out.println("Horas incorrectas");
        }
        teclado.close();
    }
}
