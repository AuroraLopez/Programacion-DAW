import CrearTablas.CategoriaDAO;
import CrearTablas.PiezaDAO;
import CrearTablas.ProveedorDAO;
import CrearTablas.SuministroDAO;

public class Creaciontablas {
    public static void main(String[] args) {
        // Insertar
        // CategoriaDAO.insertar(1, "Herramientas");
        // CategoriaDAO.insertar(2, "JASHDJDADH");
        // CategoriaDAO.insertar(3, "Borrar");

        // ProveedorDAO.insertar(1, "Calle cualquiera numero 24", "Unaciudad", "Unaprovincia");
        // ProveedorDAO.insertar(2, "Calle cualquie24", "Unacudad", "Unovincia");

        // SuministroDAO.insertar(1, 1, 20, "10/12/12");
        // SuministroDAO.insertar(2, 1, 60, "16/12/12");

        // PiezaDAO.insertar(1, "tuerca", "metal", 1.80, 1);
        // PiezaDAO.insertar(3, "tornillo", "metal", 1.99, 1);

        // Actualizar
        // CategoriaDAO.actualizar(2, "Hardware PC");
        // ProveedorDAO.actualizar(2, "Calle patata numero 34");
        // PiezaDAO.actualizar(3, "negro metálico");
        SuministroDAO.actualizar(1, 1, "10/12/12", 30);

        // Borrar
        // CategoriaDAO.borrar(3);
        // ProveedorDAO.borrar(2);
        // PiezaDAO.borrar(3);
        SuministroDAO.borrar(2, 1, "16/12/12");

        // Imprimir el contenido de la tabla
        // CategoriaDAO.listar();
        // ProveedorDAO.listar();
        // PiezaDAO.listar();
        SuministroDAO.listar();
    }

}
