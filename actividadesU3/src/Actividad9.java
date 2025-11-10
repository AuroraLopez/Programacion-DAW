public class Actividad9 {
    final int Fila='0';
    public static void main(String[] args) {
        int tablero[][]={
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0}
        };

        int primeraColumna='0';
        for(int i=0;i<tablero.length;i++){
            for(int j=0;j<tablero[0].length;j++){

            }
        }

        if(resolver(tablero,1)==true){
            // imprimirTablero(tablero);
        }
        else{
            System.out.println("No hay solución con la reina en esa columna");
        }
    }
    public static boolean resolver(int [][] tablero, int fila){
        return true;
    }
}
