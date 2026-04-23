package Actividades.Actividad4;

import java.sql.Date;
import java.time.Year;

public class Main {
    public static void main(String[] args) {
         // Variables para fecha
         Date fechanac = Date.valueOf("2003-02-16");
         Date fechanac2 = Date.valueOf("2007-03-26");

         // Creación de los DAO
         ProfesorDAO p1 = new ProfesorDAO();
         AsignaturaDAO as1 = new AsignaturaDAO();
         AlumnoDAO al1 = new AlumnoDAO();
         Curso_EscolarDAO ce1 = new Curso_EscolarDAO();
         MatriculaDAO m1 = new MatriculaDAO();       

        // // Operaciones con la tabla Profesor
        // p1.insertar(1, "Domingo", "López", "Oller", "Programar", "654987321");
        // p1.insertar(2, "Laura", "Gllén (Actualizar)", "Cárceles", "enseñar GBD", "789321654");
        // p1.insertar(3, "Gloria (borrado)", "García", "Segura", "Matemáticas", "528364197");
        // System.out.println();
        // System.out.println("Listado tras insercción");
        // p1.listar();
        // p1.actualizar(2, "Guillén (Corregido)");
        // System.out.println();
        // System.out.println("Listado tras actualización");
        // p1.listar();
        // p1.borrar(3);
        // System.out.println();
        // System.out.println("Listado tras borrado");
        // p1.listar();

        // // Operaciones con la tabla Asignatura
        // as1.insertar(1, "Programación", 145, 1);
        // as1.insertar(2, "Base de data (Actualizar)", 125, 2);
        // as1.insertar(3, "Lenguaje de marcas (borrado)", 100, 1);
        // System.out.println();
        // System.out.println("Listado tras insercción");
        // as1.listar();
        // as1.actualizar(2, "Base de datos (actualizado)");
        // System.out.println();
        // System.out.println("Listado tras actualización");
        // as1.listar();
        // as1.borrar(3);
        // System.out.println();
        // System.out.println("Listado tras borrado");
        // as1.listar();
        
        // // Operaciones con la tabla Alumno
        // al1.insertar(1, "Aurora", "López", "Fuentes", fechanac, "789456126");
        // al1.insertar(2, "Jos", "López", "Fuentes", fechanac2, "632514988");
        // al1.insertar(3, "Salvador", "Cardonna", "Ortolá", fechanac2, "256314987");
        // System.out.println();
        // System.out.println("Listado tras insercción");
        // al1.listar();
        // al1.actualizar(2, "Jose Luis");
        // System.out.println();
        // System.out.println("Listado tras actualización");
        // al1.listar();
        // al1.borrar(3);
        // System.out.println();
        // System.out.println("Listado tras borrado");
        // al1.listar();

        // // Operaciones con la tabla Curso_Escolar
        // ce1.insertar(1, Year.of(2025), Year.of(2026));
        // ce1.insertar(2, Year.of(2025), Year.of(2025));
        // ce1.insertar(3, Year.of(2026), Year.of(2026));
        // System.out.println();
        // System.out.println("Listado tras insercción");
        // ce1.listar();
        // ce1.actualizar(2, Year.of(2024));
        // System.out.println();
        // System.out.println("Listado tras actualización");
        // ce1.listar();
        // ce1.borrar(3);
        // System.out.println();
        // System.out.println("Listado tras borrado");
        // ce1.listar();

        // Operaciones con la tabla Matricula
        m1.insertar(1, 1, 1);
        m1.insertar(1, 1, 2);
        m1.insertar(2, 2, 1);
        System.out.println();
        System.out.println("Listado tras insercción");
        m1.listar();
        m1.actualizar(1, 1, 2, 2);
        System.out.println();
        System.out.println("Listado tras actualización");
        m1.listar();
        m1.borrar(2,2,1);
        System.out.println();
        System.out.println("Listado tras borrado");
        m1.listar();
    }
}
