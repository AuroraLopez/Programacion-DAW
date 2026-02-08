package Actividades.Actividad7;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Conexiones.ConexionAct7;

public class EmpleadoDAO {
    // CREATE
    public static void insertar(int id, String nif, String nombre, String apellido1, String apellido2, String telefono, int codigo_sucursal) {
        String sql = "INSERT INTO EMPLEADO VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = ConexionAct7.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.setString(2, nif);
            ps.setString(3, nombre);
            ps.setString(4, apellido1);
            ps.setString(5, apellido2);
            ps.setString(6, telefono);
            ps.setInt(7, codigo_sucursal);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // READ (SELECT)
    public static void listar() {
        String sql = "SELECT * FROM EMPLEADO";
        try (Connection conn = ConexionAct7.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " - " + rs.getString("nif") + " - " + rs.getString("nombre")
                        + " - " + rs.getString("apellido1") + " - " + rs.getString("apellido2")
                        + " - " + rs.getString("telefono")+ " - " + rs.getInt("codigo_sucursal"));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // UPDATE
    public static void actualizar(int codigo, String nuevonombre) {
        String sql = "UPDATE EMPLEADO SET nombre=? WHERE id=?";
        try (Connection conn = ConexionAct7.getConnection();
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
        String sql = "DELETE FROM EMPLEADO WHERE id=?";
        try (Connection conn = ConexionAct7.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
