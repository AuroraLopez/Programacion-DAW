package Actividades.Actividad3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Conexiones.ConexionAct3;

public class AlumnoDAO {
    // CREATE
    public static void insertar(int id, String nif, String grupo, String nombre, String apellido1, String apellido2) {
        String sql = "INSERT INTO ALUMNO VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = ConexionAct3.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.setString(2, nif);
            ps.setString(3, grupo);
            ps.setString(4, nombre);
            ps.setString(5, apellido1);
            ps.setString(6, apellido2);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // READ (SELECT)
    public static void listar() {
        String sql = "SELECT * FROM ALUMNO";
        try (Connection conn = ConexionAct3.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " - " + rs.getString("nif")+ " - " + rs.getString("grupo")
                        + " - " + rs.getString("nombre") + " - " + rs.getString("apellido1")
                        + " - " + rs.getString("apellido2"));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // UPDATE
    public static void actualizar(int codigo, String nuevonombre) {
        String sql = "UPDATE ALUMNO SET nombre=? WHERE id=?";
        try (Connection conn = ConexionAct3.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nuevonombre);
            ps.setInt(2, codigo);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // DELETE
    public static void borrar(int codigo) {
        String sql = "DELETE FROM ALUMNO WHERE id=?";
        try (Connection conn = ConexionAct3.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
