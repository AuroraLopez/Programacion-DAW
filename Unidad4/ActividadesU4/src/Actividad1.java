import Actividad1.CuentaCorriente;
import Actividad1.Persona;

public class Actividad1 {
    /*
    * Crea las clase CuentaCorriente que tiene como atributos
    * una Persona (nombre, DNI, fechaNacimiento, dirección, género,
    * estado civil), el número de cuenta y su saldo. En ambas clases crea
    * sus correspondientes constructores y funciones necesarias para
    * mostrar información y modificar los valores de atributos. Haz uso de
    * ambas clases en otro fichero que tendrá el main.
    */
    public static void main(String[] args) {
        Persona cliente=new Persona("Luis", "123456789K", "calle estacion 27 1b", "masculino" , "Soltero", "17/1/2023");
        CuentaCorriente cuentaBancaria=new CuentaCorriente("12334455677890", 2000.35, cliente);

        System.out.println(cuentaBancaria.toString());
    }
}
