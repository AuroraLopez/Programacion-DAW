package Actividades.Actividad3;

public class Main {
    public static void main(String[] args) {
        java.sql.Date fecha1 = java.sql.Date.valueOf("2024-02-25");
        java.sql.Date fecha2 = java.sql.Date.valueOf("2024-02-26");
        java.sql.Date fecha3 = java.sql.Date.valueOf("2024-02-27");
        java.sql.Date fecha4 = java.sql.Date.valueOf("2024-02-23");
        java.sql.Date fecha5 = java.sql.Date.valueOf("2024-02-24");

        // // Prueba de practica
        // PracticaDAO.insertar(1, "Repaso", "Fácil");
        // PracticaDAO.insertar(2, "Instalación", "Fácil");
        // PracticaDAO.insertar(3, "Actualización", "Medio");
        // PracticaDAO.insertar(4, "Diseño", "Dificil");
        // PracticaDAO.listar();
        // System.out.println();
        // PracticaDAO.actualizar(2, "Registro");
        // PracticaDAO.listar();
        // System.out.println();
        // PracticaDAO.borrar(4);
        // PracticaDAO.listar();

        // // // Prueba de alumno 
        // AlumnoDAO.insertar(1, "98765432L", "Segundo D", "Aurora", "López", "Fuentes");
        // AlumnoDAO.insertar(2, "1234678M", "Primero A", "Yeray", "Perez", "Garcia");
        // AlumnoDAO.insertar(3, "65498732P", "Tercero B", "Marcos", "García", "Rodriguez");
        // AlumnoDAO.insertar(4, "63526987P", "Tercero A", "Peter", "Gomez", "Fernandez");
        // AlumnoDAO.listar();
        // System.out.println();
        // AlumnoDAO.actualizar(2, "Yolanda");
        // AlumnoDAO.listar();
        // System.out.println();
        // AlumnoDAO.borrar(4);
        // AlumnoDAO.listar();

        // Prueba de Realiza_practica
        // Realiza_PracticaDAO.insertar(1, 1, fecha1, 8.89);
        // Realiza_PracticaDAO.insertar(2, 1, fecha2, 7.65);
        // Realiza_PracticaDAO.insertar(3, 1, fecha3, 5.65);
         // Realiza_PracticaDAO.insertar(4, 1, fecha4, 5.65);
        // Realiza_PracticaDAO.listar();
        // System.out.println();
        // Realiza_PracticaDAO.actualizar(2,1,8.50);
        // Realiza_PracticaDAO.listar();
        // System.out.println();
        // Realiza_PracticaDAO.borrar(4, 1);
        // Realiza_PracticaDAO.listar();

        // Prueba de profesor
        // ProfesorDAO.insertar(1, "34216892L", "Domingo", "López", "Oller");
        // ProfesorDAO.insertar(2, "1234678M", "Laura", "Garcia", "Fuentes");
        // ProfesorDAO.insertar(3, "65498732P", "Marco", "German", "Jimenez");
         // ProfesorDAO.insertar(4, "7896321P", "Jose Antonio", "Morgado", "Berruezo");
        // ProfesorDAO.listar();
        // System.out.println();
        // ProfesorDAO.actualizar(2, "Gloria");
        // ProfesorDAO.listar();
        // System.out.println();
        // ProfesorDAO.borrar(4);
        // ProfesorDAO.listar();

        // Prueba de Diseña_practica
        // Diseña_PracticaDAO.insertar(1, 1, fecha1);
        // Diseña_PracticaDAO.insertar(2, 1, fecha2);
        // Diseña_PracticaDAO.insertar(3, 1, fecha3);
        // Diseña_PracticaDAO.insertar(3, 2, fecha4);
        // Diseña_PracticaDAO.listar();
        // System.out.println();
        // Diseña_PracticaDAO.actualizar(2,1,fecha5);
        // Diseña_PracticaDAO.listar();
        // System.out.println();
        // Diseña_PracticaDAO.borrar(2, 1, fecha2);
        // Diseña_PracticaDAO.listar();

        // // Prueba de Examen_Teórico
        // Examen_TeoricoDAO.insertar(1, "Unidad 1", 20, fecha1, 1);
        // Examen_TeoricoDAO.insertar(2, "Unidad 2", 25, fecha2, 1);
        // Examen_TeoricoDAO.insertar(3, "Unidad 3", 15, fecha3, 2);
        // Examen_TeoricoDAO.insertar(4, "Unidad 4", 30, fecha4, 2);
        // Examen_TeoricoDAO.listar();
        // System.out.println();
        // Examen_TeoricoDAO.actualizar(2, "Unidad 2 Prog");
        // Examen_TeoricoDAO.listar();
        // System.out.println();
        // Examen_TeoricoDAO.borrar(4);
        // Examen_TeoricoDAO.listar();

        // Prueba de Hace_Examen
        Hace_ExamenDAO.insertar(1, 1, 8.89);
        Hace_ExamenDAO.insertar(2, 1,  7.65);
        Hace_ExamenDAO.insertar(3, 1, 5.65);
        Hace_ExamenDAO.insertar(1, 2, 5.65);
        Hace_ExamenDAO.listar();
        System.out.println();
        Hace_ExamenDAO.actualizar(2,1,8.50);
        Hace_ExamenDAO.listar();
        System.out.println();
        Hace_ExamenDAO.borrar(4, 1);
        Hace_ExamenDAO.listar();
    }
}
