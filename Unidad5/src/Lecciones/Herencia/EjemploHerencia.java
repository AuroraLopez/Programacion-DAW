package Lecciones.Herencia;

public class EjemploHerencia {
    public static void main(String[] args) {
      Persona persona1=new Persona("Cristopher",22, 1.80);
      persona1.toString();  

      Empleado e1=new Empleado("Aurora", 22, 1.64, "informatica", 1200);
      System.out.println(e1.toString());

      Persona p2=new Empleado("Aurora", 22, 1.64, "informatica", 1200);
      System.out.println(p2.toString());
    }
}
