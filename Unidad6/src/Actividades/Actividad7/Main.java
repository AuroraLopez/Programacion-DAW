package Actividades.Actividad7;

public class Main {
    public static void main(String[] args) {
        java.sql.Date fecha1 = java.sql.Date.valueOf("2024-02-25");
        java.sql.Date fecha2 = java.sql.Date.valueOf("2024-02-26");
        // // Prueba Sucursal
        // SucursalDAO.insertar(1, "c: cualquiera numero", "987654321", "Ciudad Cualquiera", "Provincia cualquiera");
        // SucursalDAO.insertar(2, "c: cualquiera 2 numero 2", "987654321", "Ciudad Cualquiera 2", "Provincia cualquiera 2");
        // SucursalDAO.insertar(3, "c: cualquiera 3 numero 3", "987654321", "Ciudad Cualquiera 3", "Provincia cualquiera 3");
        // SucursalDAO.insertar(4, "c: cualquiera 4 numero 4", "987654321", "Ciudad Cualquiera 4", "Provincia cualquiera 4");
        // SucursalDAO.listar();
        // System.out.println();
        // SucursalDAO.actualizar(2, "c: cualquiera 2 numero 2 cambio");
        // SucursalDAO.listar();
        // System.out.println();
        // SucursalDAO.borrar(4);
        // SucursalDAO.listar();

        // // Prueba Empleado
        // EmpleadoDAO.insertar(1, "98765432L", "Aurora", "López", "Fuentes", "654321987", 1);
        // EmpleadoDAO.insertar(2, "65321489M", "Marcos", "Gómez", "Fernández", "531697424", 2);
        // EmpleadoDAO.insertar(3, "51346287Q", "Salvador", "Cardonna", "Ortolá", "762316548", 1);
        // EmpleadoDAO.insertar(4, "12369874K","Raul", "Fernandez", "García", "512369874", 2);
        // EmpleadoDAO.listar();
        // System.out.println();
        // EmpleadoDAO.actualizar(2, "Witty");
        // EmpleadoDAO.listar();
        // System.out.println();
        // EmpleadoDAO.borrar(4);
        // EmpleadoDAO.listar();

        // // Prueba Revista
        // RevistaDAO.insertar(1, "Semanal", "ABC", "Revista escrita");
        // RevistaDAO.insertar(2, "Anual", "Revista 2", "Online");
        // RevistaDAO.insertar(3, "Anual", "Revista 3", "Libro");
        // RevistaDAO.insertar(4, "Anual", "Revista 4", "Periodico");
        // RevistaDAO.listar();
        // System.out.println();
        // RevistaDAO.actualizar(2, "Mensual");
        // RevistaDAO.listar();
        // System.out.println();
        // RevistaDAO.borrar(4);
        // RevistaDAO.listar();

        // // Prueba Periodista
        // PeriodistaDAO.insertar(1, "Aurora", "López", "Fuentes", "654321987", "Histórico");
        // PeriodistaDAO.insertar(2, "Yolanda", "López", "Parra", "654216987", "Entretenimiento");
        // PeriodistaDAO.insertar(3, "Eduardo", "Gimenez", "Fuentes", "654323287", "Entrevista");
        // PeriodistaDAO.insertar(4, "Moises", "Fernandez", "Fernandez", "695321987", "Detective");
        // PeriodistaDAO.listar();
        // System.out.println();
        // PeriodistaDAO.actualizar(2, "Yoli");
        // PeriodistaDAO.listar();
        // System.out.println();
        // PeriodistaDAO.borrar(4);
        // PeriodistaDAO.listar();

        // // Prueba Sucursal_Publica_Revista
        // Sucursal_Publica_RevistaDAO.insertar(1,1);
        // Sucursal_Publica_RevistaDAO.insertar(1,2);
        // Sucursal_Publica_RevistaDAO.insertar(2,1);
        // Sucursal_Publica_RevistaDAO.insertar(2,2);
        // Sucursal_Publica_RevistaDAO.listar();
        // System.out.println();
        // Sucursal_Publica_RevistaDAO.actualizar(1, 3, 2);
        // Sucursal_Publica_RevistaDAO.listar();
        // System.out.println();
        // Sucursal_Publica_RevistaDAO.borrar(2,2);
        // Sucursal_Publica_RevistaDAO.listar();

        // // Prueba Revista_Escribe_Periodista
        // Revista_Escribe_PeriodistaDAO.insertar(1,1);
        // Revista_Escribe_PeriodistaDAO.insertar(1,2);
        // Revista_Escribe_PeriodistaDAO.insertar(2,1);
        // Revista_Escribe_PeriodistaDAO.insertar(2,2);
        // Revista_Escribe_PeriodistaDAO.listar();
        // System.out.println();
        // Revista_Escribe_PeriodistaDAO.actualizar(1, 3, 2);
        // Revista_Escribe_PeriodistaDAO.listar();
        // System.out.println();
        // Revista_Escribe_PeriodistaDAO.borrar(2,2);
        // Revista_Escribe_PeriodistaDAO.listar();

        // // Prueba Sección
        // SeccionDAO.insertar(1,"Salseo", "doble página");
        // SeccionDAO.insertar(2,"Salseo", "página 2");
        // SeccionDAO.insertar(1,"Manzana", "página 6");
        // SeccionDAO.insertar(3,"Portatil", "página 4");
        // SeccionDAO.listar();
        // System.out.println();
        // SeccionDAO.actualizar(2, "Patata", "Salseo");
        // SeccionDAO.listar();
        // System.out.println();
        // SeccionDAO.borrar(3,"Portatil");
        // SeccionDAO.listar();

        // Prueba Ejemplar
        EjemplarDAO.insertar(1,fecha1, 50, 30);
        EjemplarDAO.insertar(2,fecha2, 80, 50);
        EjemplarDAO.insertar(3,fecha2, 60, 40);
        EjemplarDAO.insertar(3,fecha1, 70, 20);
        EjemplarDAO.listar();
        System.out.println();
        EjemplarDAO.actualizar(2,45, fecha2);
        EjemplarDAO.listar();
        System.out.println();
        EjemplarDAO.borrar(3,fecha1);
        EjemplarDAO.listar();
    }
}
