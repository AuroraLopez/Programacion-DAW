import Actividad2.Racional;

public class Actividad2 {
    public static void main(String[] args) {
        /*
         * 2. Construir una clase Racional que permita representar y manipular números racionales. Un
         * número racional permite representar la relación a/b entre dos números enteros siendo a el
         * numerador y b el denominador (distinto de cero). Se deben implementar los siguientes métodos para
         * la clase Racional:  asignaNumerador(int x), asignaDenominador(int y), imprimirRacional(),
         * las operaciones de suma, resta, producto y división y esIgual(Racional b). En main haz uso de ellas.
         */

        Racional r1=new Racional(2,4);
        Racional r2=new Racional(6,9);
        r1.imprimirRacional();
        r2.imprimirRacional();
        if (r1.esIgual(r2)== true) {
            System.out.println("Son iguales");
        }
        else{
            System.out.println("No son iguales");
        }
        System.out.println("Suma de ambos racionales");
        r1.sumaRacionales(r2);
        System.out.println("Resta de ambos racionales");
        r1.restaRacional(r2);
        System.out.println("Multiplicación de ambos racionales");
        r1.multiplicacionRacional(r2);
        System.out.println("División de ambos racionales");
        r1.divisionRacional(r2);
    }
}
