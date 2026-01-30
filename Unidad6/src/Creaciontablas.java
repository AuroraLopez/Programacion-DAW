import CrearTablas.CategoriaDAO;
import CrearTablas.ProveedorDAO;

public class Creaciontablas {
    public static void main(String[] args) {
        // Insertar
        // CategoriaDAO.insertar(1, "Herramientas");
        // CategoriaDAO.insertar(2, "JASHDJDADH");
        // CategoriaDAO.insertar(3, "Borrar");
        // ProveedorDAO.insertar(1, "Calle cualquiera numero 24", "Unaciudad", "Unaprovincia");
        // ProveedorDAO.insertar(2, "Calle cualquie24", "Unacudad", "Unovincia");

        // Actualizar
        // CategoriaDAO.actualizar(2, "Hardware PC");
        ProveedorDAO.actualizar(2, "Calle patata numero 34");;

        // Borrar
        // CategoriaDAO.borrar(3);
        ProveedorDAO.borrar(2);

        // Imprimir el contenido de la tabla
        // CategoriaDAO.listar();
        ProveedorDAO.listar();
    }

}
