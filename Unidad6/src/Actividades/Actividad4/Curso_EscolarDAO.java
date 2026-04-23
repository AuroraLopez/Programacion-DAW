package Actividades.Actividad4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Year;

import Conexiones.ConexionAct4;

public class Curso_EscolarDAO {
    // CREATE
    public void insertar(int id, Year año_inicio, Year año_fin) {
        String sql = "INSERT INTO curso_escolar VALUES (?, ?, ?)";
        try (Connection conn = ConexionAct4.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.setInt(2, año_inicio.getValue());
            ps.setInt(3, año_fin.getValue());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // READ (SELECT)
    public void listar() {
        String sql = "SELECT * FROM curso_escolar";
        try (Connection conn = ConexionAct4.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " - " + rs.getInt("año_inicio") + " - " + rs.getInt("año_fin"));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // UPDATE
    public void actualizar(int codigo, Year nuevoaño) {
        String sql = "UPDATE curso_escolar SET año_inicio=? WHERE id=?";
        try (Connection conn = ConexionAct4.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, nuevoaño.getValue());
            ps.setInt(2, codigo);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // DELETE
    public void borrar(int codigo) {
        String sql = "DELETE FROM curso_escolar WHERE id=?";
        try (Connection conn = ConexionAct4.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
