package CrearTablas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Conexiones.Conexion;

public class PiezaDAO {
     // CREATE
    public static void insertar(int codigo, String nombre, String color, double precio, int categoria) {
        String sql = "INSERT INTO PIEZA VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigo);
            ps.setString(2, nombre);
            ps.setString(3, color);
            ps.setDouble(4, precio);
            ps.setObject(5, categoria);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // READ (SELECT)
    public static void listar() {
        String sql = "SELECT * FROM PIEZA";
        try (Connection conn = Conexion.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(
                        rs.getInt("codigo") + " - " + rs.getString("nombre")+ " - " +
                        rs.getString("color")+ " - " + rs.getDouble("precio")+ " - " + rs.getObject("codigo_categoria"));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // UPDATE
    public static void actualizar(int codigo, String nuevocolor) {
        String sql = "UPDATE pieza SET color=? WHERE codigo=?";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nuevocolor);
            ps.setInt(2, codigo);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // DELETE
    public static void borrar(int codigo) {
        String sql = "DELETE FROM pieza WHERE codigo=?";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
