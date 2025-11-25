public class Actividad13 {
    
    //Función que devuelve el valor máximo de 2 números
    public static int maximo(int numero1, int numero2){
        if (numero1>=numero2) return numero1;
        return numero2;    
    }  
    public static void main(String[] args) {
        // Actividad diapositiva 22
        /*
         * Calcular el máximo de 3 números si existe la función maximo(a,b). 
         * Después aplica ambas para el caso de máximo de 5 números. Ten en cuenta que 
         * una función se puede utilizar en una expresión Ej: int a= 5+maximo(3,7); o int
         * b=maximo(maximo(2,3),4);
        */
        //Podemos hacerlo encadenando funciones
        System.out.println("El máximo de estos tres numeros es: "+maximo(maximo(3,7 ), 22));
        System.out.println("El máximo de estos cincos numeros es: "+maximo(maximo(maximo(maximo(12, 6), 32), 24 ), 22));
    }
}
