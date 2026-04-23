package Actividades.Actividad4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Conexiones.ConexionAct4;


public class ProfesorDAO {
    // CREATE
    public void insertar(int id, String nombre, String apellido1, String apellido2, String especialidad, String telefono) {
        String sql = "INSERT INTO PROFESOR VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = ConexionAct4.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.setString(2, nombre);
            ps.setString(3, apellido1);
            ps.setString(4, apellido2);
            ps.setString(5, especialidad);
            ps.setString(6, telefono);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // READ (SELECT)
    public void listar() {
        String sql = "SELECT * FROM PROFESOR";
        try (Connection conn = ConexionAct4.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(
                         rs.getInt("id") + " - " + rs.getString("nombre")
                         + " - " + rs.getString("apellido1") + " - " + rs.getString("apellido2")
                         + " - " + rs.getString("especialidad")+ " - " + rs.getString("telefono"));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // UPDATE
    public void actualizar(int codigo, String nuevoapellido) {
        String sql = "UPDATE PROFESOR SET apellido1=? WHERE id=?";
        try (Connection conn = ConexionAct4.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nuevoapellido);
            ps.setInt(2, codigo);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // DELETE
    public void borrar(int codigo) {
        String sql = "DELETE FROM PROFESOR WHERE id=?";
        try (Connection conn = ConexionAct4.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
