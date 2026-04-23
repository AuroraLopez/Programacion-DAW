package Actividades.Actividad4;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Conexiones.ConexionAct4;

public class AlumnoDAO {
    // CREATE
    public void insertar(int num_matricula, String nombre, String apellido1, String apellido2, Date fecha_nacimiento, String telefono) {
        String sql = "INSERT INTO ALUMNO VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = ConexionAct4.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, num_matricula);
            ps.setString(2, nombre);
            ps.setString(3, apellido1);
            ps.setString(4, apellido2);
            ps.setDate(5, fecha_nacimiento);
            ps.setString(6, telefono);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // READ (SELECT)
    public void listar() {
        String sql = "SELECT * FROM ALUMNO";
        try (Connection conn = ConexionAct4.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(
                        rs.getInt("num_matricula") + " - " + rs.getString("nombre") + " - " + rs.getString("apellido1")
                        + " - " + rs.getString("apellido2")+ " - " + rs.getDate("fecha_nacimiento") + " - " + rs.getString("telefono"));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // UPDATE
    public void actualizar(int codigo, String nuevonombre) {
        String sql = "UPDATE ALUMNO SET nombre=? WHERE num_matricula=?";
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
        String sql = "DELETE FROM ALUMNO WHERE num_matricula=?";
        try (Connection conn = ConexionAct4.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
