package Actividades.Actividad3;

public class Main {
    public static void main(String[] args) {
        // Prueba de practica
        // PracticaDAO.insertar(3, "Actualización", "Medio");
        // PracticaDAO.listar();
        // System.out.println();
        // PracticaDAO.actualizar(2, "Registro");
        // PracticaDAO.listar();
        // System.out.println();
        // PracticaDAO.borrar(3);
        // PracticaDAO.listar();

        // // Prueba de alumno 
        // AlumnoDAO.insertar(1, "98765432L", "Segundo D", "Aurora", "López", "Fuentes");
        // AlumnoDAO.insertar(2, "1234678M", "Primero A", "Yeray", "Perez", "Garcia");
        // AlumnoDAO.insertar(3, "65498732P", "Tercero B", "Marcos", "García", "Rodriguez");
        // AlumnoDAO.listar();
        // System.out.println();
        // AlumnoDAO.actualizar(2, "Yolanda");
        // AlumnoDAO.listar();
        // System.out.println();
        // AlumnoDAO.borrar(3);
        // AlumnoDAO.listar();

        // Prueba de alumno 
        AlumnoDAO.insertar(1, "98765432L", "Segundo D", "Aurora", "López", "Fuentes");
        AlumnoDAO.insertar(2, "1234678M", "Primero A", "Yeray", "Perez", "Garcia");
        AlumnoDAO.insertar(3, "65498732P", "Tercero B", "Marcos", "García", "Rodriguez");
        AlumnoDAO.listar();
        System.out.println();
        AlumnoDAO.actualizar(2, "Yolanda");
        AlumnoDAO.listar();
        System.out.println();
        AlumnoDAO.borrar(3);
        AlumnoDAO.listar();
    }
}
