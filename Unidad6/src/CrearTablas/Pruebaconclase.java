package CrearTablas;

public class Pruebaconclase {
    public static void main(String[] args) {
        Categoria nuevo=CategoriaDAO.listar(1);
        System.out.println(nuevo);
        nuevo.setNombre("Tornillos");
        CategoriaDAO.actualizar(1, nuevo.getNombre());
        CategoriaDAO.actualizar(nuevo);
    }
}
