package Actividades.Actividad5;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Conexiones.ConexionAct5;

public class EdicionesDAO {
    // CREATE
    public void insertar(int id, Date fecha_inicio, Date fecha_fin, String horario, String lugar, int id_curso, int id_empleadoscapacitados) {
        String sql = "INSERT INTO ediciones VALUES (?, ?, ?, ?, ?, ?, ? )";
        try (Connection conn = ConexionAct5.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.setDate(2, fecha_inicio);
            ps.setDate(3, fecha_fin);
            ps.setString(4, horario);
            ps.setString(5, lugar);
            ps.setInt(6, id_curso);
            ps.setInt(7, id_empleadoscapacitados);

            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // READ (SELECT)
    public void listar() {
        String sql = "SELECT * FROM ediciones";
        try (Connection conn = ConexionAct5.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") +" - " + rs.getDate("fecha_inicio")
                        + " - " + rs.getDate("fecha_fin") + " - " + rs.getString("horario") + " - " + rs.getString("lugar")
                        + " - " + rs.getInt("id_curso") + " - " + rs.getInt("id_empleadoscapacitados"));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // UPDATE
    public void actualizar(int codigo, String nuevohorario) {
        String sql = "UPDATE ediciones SET horario=? WHERE id=?";
        try (Connection conn = ConexionAct5.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nuevohorario);
            ps.setInt(2, codigo);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // DELETE
    public void borrar(int codigo) {
        String sql = "DELETE FROM ediciones WHERE id=?";
        try (Connection conn = ConexionAct5.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
