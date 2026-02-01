package Actividad7;

public class Actividad7 {
    public static void main(String[] args) {
        /*
        * Crea una clase abstracta Vehiculo con:
        * Atributo marca (String) y método arrancar() abstracto.
        * Método concreto frenar() que imprima “<marca> está frenando”.
        * Crea dos clases Coche y Moto que hereden de Vehiculo y sobreescriban arrancar().
        * En main, crea objetos de las clases Coche y Moto y llama a arrancar() y frenar() para ver el
        * resultado
        */

        Coche c1=new Coche("Seat Ibiza");
        Moto m1=new Moto("Kawasaki Ninja");

        // Acciones con coche
        System.out.println("Turno del coche");
        System.out.println("-------------------------");
        c1.arrancar();
        c1.frenar();
        System.out.println();

        // Acciones con moto
        System.out.println("Turno de la moto");
        System.out.println("-------------------------");
        m1.arrancar();
        m1.frenar();
    }
}
