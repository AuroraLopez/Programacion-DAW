import java.time.LocalDateTime;

class Funciones {
    public static void main(String[] args){
        
        //Tratamiento de fechas JAVA
        LocalDateTime hoy = LocalDateTime.now();
        System.out.println(hoy.toString());
        // Tratamiento de math
        // Pow es para haer la potencia
        System.out.println(Math.pow(2,8));

        //Numeros aleatorios
        int min=1;
        int max=15;
        int aleatorio=(int)(Math.random()*(max-min+1))+min;
        System.out.println(aleatorio);

        //Operadores
        // Incremento ++, Decremento --
        // No es lo mismo variable++(coge el valor y lo incrementa) que ++variable(incrementa el valor y la usa)
        int valor=1;
        valor--;
        System.out.println(valor);
        valor=valor-1;
        System.out.println(valor);

        // Expresiones relacionales
        System.out.println((5>6)||(5>2));

        // Operación de asignación(opera-asigna)
        int num11=3;
        int num12=4;
        num11+=num12;
        System.out.println(num12);

        // Operador ternario(? va a comprobar la parte anterior y si se cumple hace lo siguiente(if else))
        int a=10;
        int b=5;
        int x=a==10?b*2:a;
        System.out.println(x);

    //     // Bucle for
    //     for(int i=0;i<5;i++){
    //         System.out.printl(i);
    //     }
    }

}
