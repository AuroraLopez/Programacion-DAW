package Actividades.Actividad7;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Conexiones.ConexionAct7;

public class RevistaDAO {
    // CREATE
    public static void insertar(int numero_registro, String periocidad, String titulo, String tipo) {
        String sql = "INSERT INTO REVISTA VALUES (?, ?, ?, ?)";
        try (Connection conn = ConexionAct7.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, numero_registro);
            ps.setString(2, periocidad);
            ps.setString(3, titulo);
            ps.setString(4, tipo);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // READ (SELECT)
    public static void listar() {
        String sql = "SELECT * FROM REVISTA";
        try (Connection conn = ConexionAct7.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(
                        rs.getInt("numero_registro") + " - " + rs.getString("periocidad") + " - " + rs.getString("titulo")
                        + " - " + rs.getString("tipo"));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // UPDATE
    public static void actualizar(int numero_registro, String nuevaperiocidad) {
        String sql = "UPDATE REVISTA SET periocidad=? WHERE numero_registro=?";
        try (Connection conn = ConexionAct7.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nuevaperiocidad);
            ps.setInt(2, numero_registro);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // DELETE
    public static void borrar(int codigo) {
        String sql = "DELETE FROM REVISTA WHERE numero_registro=?";
        try (Connection conn = ConexionAct7.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
