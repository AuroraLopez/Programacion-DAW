public class Recursividad {
    // public static int factorial(int n){
    //     //Caso base
    //     if(n==0){
    //         return 1;
    //     }
    //     else{
    //         return n*factorial(n-1);
    //     }
    // }

    // public static int suma(int a){
    //     if (a==1) {
    //         return 1;
    //     }
    //     else{
    //         return a+suma(a-1);
    //     }
    // }
    // public static void main(String[] args) {
    //     System.out.println(factorial(7));
    //     System.out.println(suma(4));
    // }
    public static void main(String[] args) {
        int a = 254;
        System.out.println(funcion(a, 2));
        incre(4);
    }
    public static int funcion(int num, int pos){
        if(num < 10){
            return num;
        }else{
            return (num % 10) * (int) Math.pow(10, pos) + (funcion(num/10, pos-1));
        }
    }
    public static void incre(int n){
        if(n>0){
            incre(n-1);
            System.out.println(n);
        }
        else
            System.out.println();
        }

}
