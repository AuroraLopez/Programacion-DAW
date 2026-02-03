package Actividades.Actividad3;

public class Main {
    public static void main(String[] args) {
        PracticaDAO.insertar(3, "Actualización", "Medio");
        PracticaDAO.listar();
        System.out.println();
        PracticaDAO.actualizar(2, "Registro");
        PracticaDAO.listar();
        System.out.println();
        PracticaDAO.borrar(3);
        PracticaDAO.listar();
    }
}
