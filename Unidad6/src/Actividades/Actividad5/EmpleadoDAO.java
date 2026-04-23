package Actividades.Actividad5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Conexiones.ConexionAct5;

public class EmpleadoDAO {
    // CREATE
    public void insertar(int id, String nombre, String apellido1, String apellido2, String telefono, String direccion, String tipo) {
        String sql = "INSERT INTO empleados VALUES (?, ?, ?, ?, ?, ?, ? )";
        try (Connection conn = ConexionAct5.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.setString(2, nombre);
            ps.setString(3, apellido1);
            ps.setString(4, apellido2);
            ps.setString(5, telefono);
            ps.setString(6, direccion);
            ps.setString(7, tipo);

            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // READ (SELECT)
    public void listar() {
        String sql = "SELECT * FROM empleados";
        try (Connection conn = ConexionAct5.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") +" - " + rs.getString("nombre")
                        + " - " + rs.getString("apellido1") + " - " + rs.getString("apellido2") + " - " + rs.getString("telefono")
                        + " - " + rs.getString("direccion") + " - " + rs.getString("tipo"));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // UPDATE
    public void actualizar(int codigo, String nuevonombre) {
        String sql = "UPDATE empleados SET nombre=? WHERE id=?";
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
        String sql = "DELETE FROM empleados WHERE id=?";
        try (Connection conn = ConexionAct5.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
