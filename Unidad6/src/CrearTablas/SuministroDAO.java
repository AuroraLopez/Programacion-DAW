package CrearTablas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Conexiones.Conexion;

public class SuministroDAO {
     public static void insertar(int codigo_proveedor, int codigo_pieza, int cantidad, String fecha) {
        String sql = "INSERT INTO SUMINISTRA VALUES (?, ?, ?, ?)";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigo_proveedor);
            ps.setInt(2, codigo_pieza);
            ps.setInt(3, cantidad);
            ps.setString(4, fecha);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // READ (SELECT)
    public static void listar() {
        String sql = "SELECT * FROM SUMINISTRA";
        try (Connection conn = Conexion.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(
                        rs.getInt("codigo_proveedor") + " - " + rs.getInt("codigo_pieza")+ " - " +
                        rs.getInt("cantidad")+ " - " + rs.getString("fecha"));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // UPDATE
    public static void actualizar(int codigo_proveedor, int codigo_pieza, String fecha, int nuevacantidad) {
        String sql = "UPDATE SUMINISTRA SET cantidad=? WHERE codigo_proveedor=? and codigo_pieza=? and fecha=?";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, nuevacantidad);
            ps.setInt(2, codigo_proveedor);
            ps.setInt(3, codigo_pieza);
            ps.setString(4, fecha);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // DELETE
    public static void borrar(int codigo_proveedor, int codigo_pieza, String fecha) {
        String sql = "DELETE FROM SUMINISTRA WHERE codigo_proveedor=? and codigo_pieza=? and fecha=?";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigo_proveedor);
            ps.setInt(2, codigo_pieza);
            ps.setString(3, fecha);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
