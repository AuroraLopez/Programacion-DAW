import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {
        /*
         * Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce su jugada 
         * y luego el ordenador genera la suya de manera aleatoria. Para ambos, el valor de la jugada será el
         * valor 1 o 2 o 3 que se corresponde con piedra, papel o tijera. Hay que evaluar el resultado y decir
         * quién gana o si hay empate. El juego termina cuando el usuario introduce -1 o el ordenador gana 5
         * veces. Realiza una función para solicitar la acción del humano, otra para generar la del ordenador y
         * el procedimiento con la salida final según si gana o no gana. Puedes crear más funciones si lo crees
         * necesario.
         */
        // Lee las variables
        Scanner teclado= new Scanner(System.in);
        int jugada; int contador=0;
        // Bucle para repetición
        do{
            System.out.println("Selecciona tu jugada: 1=piedra, 2=papel y 3=tijeras");
            jugada=teclado.nextInt();
            int max=3; int min=1; 
            int aleatorio=(int)(Math.random()*(max-min+1))+min;
            // Condiciones para cada ocasión
            switch (jugada) {
                case 1:
                    if (aleatorio==2) {
                        contador++;
                        System.out.println("Ha ganado la máquina");
                    }
                    else if(aleatorio==3){
                    System.out.println("Has ganado");
                    }
                    else{
                        System.out.println("Has empatado");
                    }
                    break;
                case 2:
                    if (aleatorio==3) {
                        contador++;
                        System.out.println("Ha ganado la máquina");
                    }
                    else if(aleatorio==1){
                    System.out.println("Has ganado");
                    }
                    else{
                        System.out.println("Has empatado");
                    }
                    break;
                case 3:
                    if (aleatorio==1) {
                        contador++;
                        System.out.println("Ha ganado la máquina");
                    }
                    else if(aleatorio==2){
                    System.out.println("Has ganado");
                    }
                    else{
                        System.out.println("Has empatado");
                    }
                    break;
                default:
                    break;
            }
            System.out.println("Ha ganado la máquina :" + contador);
        }while(jugada!=-1 && contador!=5);
       

    }
}
