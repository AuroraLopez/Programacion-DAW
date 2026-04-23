package Actividades.Actividad2;

import java.sql.Date;

public class Pruebaconclase {
    public static void main(String[] args) {
        // Creación de los DAO
        CategoriaDAO c1 = new CategoriaDAO();
        PiezaDAO pi1 = new PiezaDAO();
        ProveedorDAO pr1 = new ProveedorDAO();
        SuministroDAO s1 = new SuministroDAO();

        // Operaciones con la tabla Categoria
        // c1.insertar(1, "Heeramientas");
        // c1.insertar(2, "Tornillos para actualizar");
        // c1.insertar(3, "Para el borrado");
        // System.out.println();
        // System.out.println("Listado tras insercción");
        // c1.listar();
        // c1.actualizar(2, "Tornillos");
        // System.out.println();
        // System.out.println("Listado tras actualización");
        // c1.listar();
        // c1.borrar(3);
        // System.out.println();
        // System.out.println("Listado tras borrado");
        // c1.listar();

        // Operaciones con la tabla Pieza
        // pi1.insertar(1, "Martillo", "Rojo", 21.99, 1);
        // pi1.insertar(2, "8mm", "Acero", 5.99, 2);
        // pi1.insertar(3, "Borrado", "Blanco", 1.00, 2);      
        // System.out.println();
        // System.out.println("Listado tras insercción");
        // pi1.listar();
        // pi1.actualizar(2, "Metálico");
        // System.out.println();
        // System.out.println("Listado tras actualización");
        // pi1.listar();
        // pi1.borrar(3);
        // System.out.println();
        // System.out.println("Listado tras borrado");
        // pi1.listar();

        // Operaciones con la tabla Proveedor
        // pr1.insertar(1, "Avenida cualquiera 1", "Ciudad cualquiera 1", "Provincia cualquiera 1");
        // pr1.insertar(2, "Avenida cualquiera 2 (actualizar)", "Ciudad cualquiera 2", "Provincia cualquiera 2");
        // pr1.insertar(3, "Borrado", "Ciudad cualquiera 3", "Provincia cualquiera 3");
        // System.out.println();
        // System.out.println("Listado tras insercción");
        // pr1.listar();
        // pr1.actualizar(2, "Avenida cualquiera 2 actualizada");
        // System.out.println();
        // System.out.println("Listado tras actualización");
        // pr1.listar();
        // pr1.borrar(3);
        // System.out.println();
        // System.out.println("Listado tras borrado");
        // pr1.listar();

        // Operaciones con la tabla Suministro
        s1.insertar(1, 1, 30, Date.valueOf("2026-02-12"));
        s1.insertar(1, 2, 50, Date.valueOf("2026-02-24"));
        s1.insertar(2, 2, 50, Date.valueOf("2026-02-20"));
        System.out.println();
        System.out.println("Listado tras insercción");
        s1.listar();
        s1.actualizar(1, 2, Date.valueOf("2026-02-24"), 35);
        System.out.println();
        System.out.println("Listado tras actualización");
        s1.listar();
        s1.borrar(2, 2, Date.valueOf("2026-02-20"));
        System.out.println();
        System.out.println("Listado tras borrado");
        s1.listar();
    }
}
