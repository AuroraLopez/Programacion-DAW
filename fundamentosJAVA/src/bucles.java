import java.util.Scanner;

public class bucles {
    public static void main(String[] args) {
        // // Caso básico bucle
        // for(int i=0;i<5;i++){
        //     System.out.println(i);
        // }
        // // Bucle infinito while
        // int j=0;
        // while (j<5) {
        //     System.out.println(j);
        //     j++; //Poner para romper el bucle
        // }
        // // Bucle do while
        // int k=0;
        // do{ //Haz mientras se cumpla , pero al menos 1
        //     System.out.println(k);
        //     k++;
        // } while(k<5);

        // boolean continua=true;
        // // Cosas que no quiere ver en nuestros codigos

        // for(int i=0;i<5;i++){
        //     System.out.println(i);
        //     if (i==3) break;
        // }
        // // Mejorarlo sin usar el brak
        // for(int i=0;i<5&&continua;i++){
        //     System.out.println(i);
        //     if (i==3) continua=false;
        // }
        // // Hacerlo mejor con un bucle while
        // int j=0;
        // while(j<5 && continua){
        //     System.out.println(j);
        //     if (j==3) continua=false;
        //     j++;
        // }

        Scanner teclado = new Scanner(System.in);
        int numero=0;
        do{
        System.out.println("Escribe un mensaje entre 1 y 5");
        numero=teclado.nextInt();
        }while(numero<1||numero>5);
}
}
