import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Persona2 {
    String nombre;
    LocalDate fechaNacimiento;
    double estatura;
    final String DNI;
    static int hijos;
    Persona2 pareja;

    public Persona2(String DNI, String fecha) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaNacimiento = LocalDate.parse(fecha, fmt);
        this.DNI = DNI;
        hijos = 2;
        this.pareja = null;
    }

    public Persona2(String nombre, String fecha,String DNI, double estatura, int hijos, Persona2 pareja){
        this.estatura=estatura;
        this.nombre=nombre;
        this.DNI=DNI;
        this.pareja=pareja;
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaNacimiento = LocalDate.parse(fecha, fmt);
    }

    public void obtenerEdad() {
        Period periodo = Period.between(fechaNacimiento, LocalDate.now());
        System.out.println("Tienes " + periodo.getYears() + " años");
    }

    public void asignaPareja(Persona2 p) {
        this.pareja = p; // Hará referencia a la ya existente
    }

    public static void main(String[] args) {
        Persona2 p = new Persona2("12345678A", "15/08/1985");
        p.obtenerEdad();
        System.out.println("Tienes " + p.hijos + " hijos");
        Persona2 p2 = new Persona2("12345678B", "01/07/1987");
        p.hijos = 3;
        System.out.println("Tienes " + p2.hijos + " hijos");
        p.asignaPareja(p2);
    }
}
