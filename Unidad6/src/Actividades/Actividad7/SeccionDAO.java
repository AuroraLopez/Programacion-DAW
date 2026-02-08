package Actividades.Actividad7;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Conexiones.ConexionAct7;

public class SeccionDAO {
    // CREATE
    public static void insertar(int num_registro_revista, String titulo, String extension) {
        String sql = "INSERT INTO SECCION VALUES (?, ?, ?)";
        try (Connection conn = ConexionAct7.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, num_registro_revista);
            ps.setString(2, titulo);
            ps.setString(3, extension);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // READ (SELECT)
    public static void listar() {
        String sql = "SELECT * FROM SECCION";
        try (Connection conn = ConexionAct7.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(
                        rs.getInt("num_registro_revista") + " - " + rs.getString("titulo") + " - " + rs.getString("extension"));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // UPDATE
    public static void actualizar(int num_registro_revista, String nuevotitulo, String titulo) {
        String sql = "UPDATE SECCION SET titulo=? WHERE num_registro_revista=? and titulo=?";
        try (Connection conn = ConexionAct7.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nuevotitulo);
            ps.setInt(2, num_registro_revista);
            ps.setString(3, titulo);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // DELETE
    public static void borrar(int num_registro_revista, String titulo) {
        String sql = "DELETE FROM SECCION WHERE num_registro_revista=? and titulo=?";
        try (Connection conn = ConexionAct7.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, num_registro_revista);
            ps.setString(2, titulo);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
