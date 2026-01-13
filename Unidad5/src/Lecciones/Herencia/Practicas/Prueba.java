package Lecciones.Herencia.Practicas;

public class Prueba {
    public static void main(String[] args) {
        Empleado e1=new Empleado("Critopher");
        System.out.println(e1.toString());
        Operario o1=new Operario("Nicolas");
        System.out.println(o1.toString());
        Oficial of1=new Oficial("Marggio");
        System.out.println(of1.toString());
        Tecnico t1= new Tecnico("Maria");
        System.out.println(t1.toString());
        Directivo d1=new Directivo("Aurora");
        System.out.println(d1.toString());
    }
}
