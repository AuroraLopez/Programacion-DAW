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
        
    }
}
