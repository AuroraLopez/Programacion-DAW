package Actividades.Actividad4;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Conexiones.ConexionAct4;

public class AsignaturaDAO {
    // CREATE
    public void insertar(int codigo, String nombre, int num_horas, int id_profesor) {
        String sql = "INSERT INTO asignatura VALUES (?, ?, ?, ?)";
        try (Connection conn = ConexionAct4.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigo);
            ps.setString(2, nombre);
            ps.setInt(3, num_horas);
            ps.setInt(4, id_profesor);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // READ (SELECT)
    public void listar() {
        String sql = "SELECT * FROM asignatura";
        try (Connection conn = ConexionAct4.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(
                        rs.getInt("codigo") + " - " + rs.getString("nombre") + " - " + rs.getInt("num_horas")
                        + " - " + rs.getInt("id_profesor"));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // UPDATE
    public void actualizar(int codigo, String nuevonombre) {
        String sql = "UPDATE asignatura SET nombre=? WHERE codigo=?";
        try (Connection conn = ConexionAct4.getConnection();
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
        String sql = "DELETE FROM asignatura WHERE codigo=?";
        try (Connection conn = ConexionAct4.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
