public class FuncionesJava {//Si le quitamos el static tendremos que crear un objeto con FuncionesJava objeto=new FuncionesJava(); para poder usar esta función
    final static double PI=3.14159;    
    public static int suma(int numero1, int numero2) {
        return numero1+numero2;
    }
    public static int suma(int numero1, int numero2, int numero3) {
        return numero1+numero2+3;
    }
    public static double suma(double numero1, double numero2) {
        return numero1+numero2+PI;
    }
    public static void escribir3saludos() {
        System.out.println("Hola Aurora");
        System.out.println("Hola 2");
        System.out.println("Hola 3");
    }

    //Función que devuelve el valor máximo de 2 números

    public static int maximo(int numero1, int numero2){
        if (numero1>=numero2) return numero1;
        return numero2;    
    }   
    public static void main(String[] args) {
        /*
         * 
         * 
        */
        escribir3saludos();
        /*
         * 
         * 
         * 
         */
        escribir3saludos();

        //Operación
        System.out.println(suma(3,5));//Suma con parametros enteros
        System.out.println(suma(1.5,3.7));//Suma con parametros reales
        System.out.println(maximo(maximo(3,7 ), 22)); // Puedes encadenar funciones
    }
}
