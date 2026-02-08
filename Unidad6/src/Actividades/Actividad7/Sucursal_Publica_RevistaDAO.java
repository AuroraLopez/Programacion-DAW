package Actividades.Actividad7;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Conexiones.ConexionAct7;

public class Sucursal_Publica_RevistaDAO {
    // CREATE
    public static void insertar(int codigo_sucursal, int num_registro_revista) {
        String sql = "INSERT INTO SUCURSAL_PUBLICA_REVISTA VALUES (?, ?)";
        try (Connection conn = ConexionAct7.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigo_sucursal);
            ps.setInt(2, num_registro_revista);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // READ (SELECT)
    public static void listar() {
        String sql = "SELECT * FROM SUCURSAL_PUBLICA_REVISTA";
        try (Connection conn = ConexionAct7.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(
                        rs.getInt("codigo_sucursal") + " - " + rs.getString("num_registro_revista"));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // UPDATE
    public static void actualizar(int codigo_sucursal, int nuevonum_registro_revista, int num_registro_revista) {
        String sql = "UPDATE SUCURSAL_PUBLICA_REVISTA SET num_registro_revista=? WHERE codigo_sucursal=? and num_registro_revista=?";
        try (Connection conn = ConexionAct7.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, nuevonum_registro_revista);
            ps.setInt(2, codigo_sucursal);
            ps.setInt(3, num_registro_revista);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // DELETE
    public static void borrar(int codigo_sucursal, int num_registro_revista) {
        String sql = "DELETE FROM SUCURSAL_PUBLICA_REVISTA WHERE codigo_sucursal=? and num_registro_revista=?";
        try (Connection conn = ConexionAct7.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
                    ps.setInt(1, codigo_sucursal);
                    ps.setInt(2, num_registro_revista);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
