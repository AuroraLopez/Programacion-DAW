import java.util.Scanner;

public class Actividad4 {
    public static void main(String[] args) {
        /*
         * Calcula la nota de un trimestre de la asignatura Programación. El programa pedirá las dos 
         * notas que ha sacado el alumno en los dos primeros controles. Si la media de los dos controles da un 
         * número mayor o igual a 5, el alumno está aprobado y se mostrará la media. En caso de que la media 
         * sea un número menor que 5, el alumno habrá tenido que hacer el examen de recuperación que se 
         * califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál ha sido el resultado de la 
         * recuperación? (apto/no apto). Si el resultado de la recuperación es apto, la nota será un 5; en caso 
         * contrario, se mantiene la nota media anterior.
         */
        Scanner teclado= new Scanner(System.in);
        // Para introducir decimal en la terminal es con la , no con .
        // Pedimos la primera nota
        System.out.println("Introduce la primera nota");
        double nota1=teclado.nextDouble();
        // Pedimos la segunda nota
        System.out.println("Introduce la segunda nota");
        double nota2=teclado.nextDouble();
        double media=(nota1+nota2)/2;
        String recuperacion;
        if (media>=5 && media<=10) {
            System.out.println("Estás aprobado y tu media es de :"+media);
        }
        else{
            System.out.println("Estás supenso, ¿Cuál ha sido la nota de recuperación? (apto/noapto)");
            recuperacion=teclado.next();
            if (recuperacion.equals("apto")) {
                media=5;
                System.out.println("Estás aprobado con un 5");                
            }
            else if(recuperacion.equals("noapto")){
                System.out.println("Estás suspenso con un "+media);
            }
            else{
                System.out.println("Valor incorrecto");
            }
        }
        teclado.close();
    }
}
