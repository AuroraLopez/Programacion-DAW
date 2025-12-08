import java.util.ArrayList;

import Actividad5.Alumno;
import Actividad5.Alumno_cursa_Modulo;
import Actividad5.Modulo;
import Actividad5.Profesor;

public class Actividad5 {
    public static void main(String[] args) {
        /*
        * Crea las clases en JAVA con sus correspondientes
        * constructores y funciones necesarias para mostrar información y
        * modificar los atributos del siguiente diagrama E-R:
        * Profesor, modulo, alumno, relaciones.
        * (Diapositiva 16)
        */

        // Profesores
        Profesor profesorGBD= new Profesor("35654987K", "Laura", "su casa donde vive", 645321987);
        Profesor profesorProg= new Profesor("15789321P", "Domingo", "Su direccion y casa", 167289354);
        Profesor profesorLSMGI= new Profesor("39148625A", "Jose Antonio", "Casa morgui", 249358617);
        Profesor profesorSost= new Profesor("36987123T", "Santiago Tomás", "Casa Sostenible", 657129349);
        Profesor profesorsistemas= new Profesor("624985235M", "María", "Casa maria", 1233648456);
        
        // Modulos
        Modulo GBD=new Modulo(1, "GBD", profesorGBD);
        Modulo Entornos=new Modulo(2, "Entornos de desarrollo", profesorGBD);
        Modulo Prog=new Modulo(3, "Programación", profesorProg);
        Modulo LSMGI=new Modulo(7, "Lenguaje de marcas", profesorLSMGI);
        Modulo Sosten= new Modulo(4, "Sostinibilidad", profesorSost);
        Modulo Digit = new Modulo(5, "Digitalización", profesorSost);
        Modulo SistemasInf= new Modulo(6, "Sistemas Informaticos", profesorsistemas);

        // Alumnos
        Alumno Alu1= new Alumno(1, "Aurora", "López Fuentes", "16/02/2003", "No es delegado");
        Alumno Alu2= new Alumno(2, "Cristopher", "Quiñones", "25/08/2003", "Es delegado");
        Alumno Alu3= new Alumno(3, "Maria", "García García", "30/11/2005", "Es sub delegada");
        Alumno Alu4= new Alumno(4, "Nicolas", "Asencio Cruz", "13/07/2008", "No es delegado");

        // Alumnos cursan modulos
        // Alumno 1 primera forma de imprimirlo
        ArrayList<Modulo> modulosAlu1 = new ArrayList<>();
        modulosAlu1.add(GBD);
        modulosAlu1.add(Entornos);
        modulosAlu1.add(Prog);
        modulosAlu1.add(Sosten);
        modulosAlu1.add(Digit);
        modulosAlu1.add(SistemasInf);

        Alumno_cursa_Modulo Alu1Matri= new Alumno_cursa_Modulo(Alu1, modulosAlu1);
        System.out.println("");
        System.out.println(Alu1Matri.toString());
        System.out.println("==================================================================");

        // Otra manera de mostrarlo
        System.out.println(Alu1.toString());
        System.out.println("Modulos en los que esta matriculado:");
        System.out.println("---------------------------------------------------------------");
        for (int i = 0; i < modulosAlu1.size(); i++) {
            System.out.println(modulosAlu1.get(i));
        }

        // // Alumno 2
        // ArrayList<Modulo> modulosAlu2 = new ArrayList<>();
        // modulosAlu2.add(GBD);
        // modulosAlu2.add(Entornos);
        // modulosAlu2.add(Prog);
        // modulosAlu2.add(Sosten);
        // modulosAlu2.add(Digit);
        // modulosAlu2.add(SistemasInf);
        // modulosAlu2.add(LSMGI);

        // Alumno_cursa_Modulo Alu2Matri= new Alumno_cursa_Modulo(Alu2, modulosAlu2);
        // System.out.println("");
        // System.out.println(Alu2Matri.toString());

        // // Alumno 3
        // ArrayList<Modulo> modulosAlu3 = new ArrayList<>();
        // modulosAlu3.add(GBD);
        // modulosAlu3.add(Entornos);
        // modulosAlu3.add(Prog);
        // modulosAlu3.add(Sosten);
        // modulosAlu3.add(Digit);
        // modulosAlu3.add(SistemasInf);
        // modulosAlu3.add(LSMGI);

        // Alumno_cursa_Modulo Alu3Matri= new Alumno_cursa_Modulo(Alu3, modulosAlu3);
        // System.out.println("");
        // System.out.println(Alu3Matri.toString());

    }
}
