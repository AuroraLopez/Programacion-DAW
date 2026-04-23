package Actividades.Actividad5;

import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        // Creación de los DAO
        CursosDAO c1 = new CursosDAO();
        EdicionesDAO e1 = new EdicionesDAO();
        EmpleadoDAO em1 = new EmpleadoDAO();
        Empleados_Reciben_EdicionesDAO ere1 = new Empleados_Reciben_EdicionesDAO();
        Prerrequisitos_CursosDAO pr1 = new Prerrequisitos_CursosDAO();

        // Operaciones con CURSOS
        // c1.insertar(1, "Java", 80.99, 60, "Curso de programación Java");
        // c1.insertar(2, "HTML (Actualizar)",90.00 , 80, "Lenguaje de marcas");
        // c1.insertar(3, "PL/SQL (Borrar)", 109.99, 79, "Curso de PL/SQL para iniciar");
        // System.out.println();
        // System.out.println("Listado tras inserción");
        // c1.listar();
        // c1.actualizar(2, "HTMLL5 Y CSS");
        // System.out.println();
        // System.out.println("Listado tras actualización");
        // c1.listar();
        // c1.borrar(3);
        // System.out.println();
        // System.out.println("Listado tras borrado");
        // c1.listar();

        // // Operaciones con EMPLEADOS
        // em1.insertar(1, "Ana", "García", "López", "Calle Mayor 12", "654987321", "Profesor");
        // em1.insertar(2, "Luis (Actualizar)", "Martín", "Ruiz", "Av. España 45", "612345987", "Coordinador");
        // em1.insertar(3, "Pedro (Borrar)", "Sánchez", "Díaz", "Calle Sol 7", "698741236", "Profesor");
        // System.out.println();
        // System.out.println("Listado tras insercción");
        // em1.listar();
        // em1.actualizar(2, "Luis Miguel (Actualizado)");
        // System.out.println();
        // System.out.println("Listado tras actualización");
        // em1.listar();
        // em1.borrar(3);
        // System.out.println();
        // System.out.println("Listado tras borrado");
        // em1.listar();

        // Variables de fechas
        Date inicio = Date.valueOf("2025-01-10");
        Date fin = Date.valueOf("2025-02-10");
        Date inicio2 = Date.valueOf("2025-03-01");
        Date fin2 = Date.valueOf("2025-04-01");
        Date inicio3 = Date.valueOf("2025-05-01");
        Date fin3 = Date.valueOf("2025-06-01");

        // // Operaciones con EDICIONES
        // e1.insertar(1, inicio, fin, "Mañanas","Aula 101", 1 , 2);
        // e1.insertar(2, inicio2, fin2, "Tardes","Aula 102",1,2);
        // e1.insertar(3, inicio3, fin3, "Nocturno","Aula 103", 2, 2);
        // System.out.println();
        // System.out.println("Listado tras insercción");
        // e1.listar();
        // e1.actualizar(2, "Taciturno");
        // System.out.println();
        // System.out.println("Listado tras actualización");
        // e1.listar();
        // e1.borrar(3);
        // System.out.println();
        // System.out.println("Listado tras borrado");
        // e1.listar();

        // // EMPLEADOS RECIBEN EDICIONES
        // ere1.insertar(1,1);
        // ere1.insertar(1,2);
        // ere1.insertar(2,1);
        // System.out.println();
        // System.out.println("Listado tras insercción");
        // ere1.listar();
        // ere1.actualizar(2,1,2);
        // System.out.println();
        // System.out.println("Listado tras actualización");
        // ere1.listar();
        // ere1.borrar(1,2);
        // System.out.println();
        // System.out.println("Listado tras borrado");
        // ere1.listar();

        // PRERREQUISITOS CURSOS
        pr1.insertar(1, 2, true);
        pr1.insertar(1, 1, false);
        pr1.insertar(2, 1, false);
        System.out.println();
        System.out.println("Listado tras insercción");
        pr1.listar();
        pr1.actualizar(2,1, true);
        System.out.println();
        System.out.println("Listado tras actualización");
        pr1.listar();
        pr1.borrar(1, 2);
        System.out.println();
        System.out.println("Listado tras borrado");
        pr1.listar();
    }
}
