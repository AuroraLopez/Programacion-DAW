import clases.CuentaCorriente;
import clases.Persona;

public class Actividad2 {
    public static void main(String[] args) {
        Persona cliente=new Persona("Luis", "123456789K", "calle estacion 27 1b", "masculino" , "Soltero", "17/1/2023");
        CuentaCorriente cuentaBancaria=new CuentaCorriente("12334455677890", 2000, cliente);
    }
}
