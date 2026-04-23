package Conexiones;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionAct6 {
    private static final String URL = "jdbc:mysql://localhost:3306/act6prog";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "root";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, PASSWORD);
    }
}