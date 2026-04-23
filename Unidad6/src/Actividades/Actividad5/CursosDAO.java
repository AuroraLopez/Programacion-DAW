package Actividades.Actividad5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Conexiones.ConexionAct5;

public class CursosDAO {
    // CREATE
    public void insertar(int id, String nombre, double coste, int duracion, String descripcion) {
        String sql = "INSERT INTO cursos VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = ConexionAct5.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.setString(2, nombre);
            ps.setDouble(3, coste);
            ps.setInt(4, duracion);
            ps.setString(5, descripcion);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // READ (SELECT)
    public void listar() {
        String sql = "SELECT * FROM cursos";
        try (Connection conn = ConexionAct5.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " - " + rs.getString("nombre") + " - " + rs.getDouble("coste")
                        + " - " + rs.getInt("duracion")+ " - " + rs.getString("descripcion"));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // UPDATE
    public void actualizar(int codigo, String nuevonombre) {
        String sql = "UPDATE cursos SET nombre=? WHERE id=?";
        try (Connection conn = ConexionAct5.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nuevonombre);
            ps.setInt(2, codigo);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // DELETE
    public void borrar(int codigo) {
        String sql = "DELETE FROM cursos WHERE id=?";
        try (Connection conn = ConexionAct5.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
