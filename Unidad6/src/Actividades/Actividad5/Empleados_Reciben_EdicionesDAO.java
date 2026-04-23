package Actividades.Actividad5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Conexiones.ConexionAct5;

public class Empleados_Reciben_EdicionesDAO {
    // CREATE
    public void insertar(int id_edicion, int id_empleado ) {
        String sql = "INSERT INTO empleados_reciben_ediciones VALUES (?, ?)";
        try (Connection conn = ConexionAct5.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id_edicion);
            ps.setInt(2, id_empleado);

            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // READ (SELECT)
    public void listar() {
        String sql = "SELECT * FROM empleados_reciben_ediciones";
        try (Connection conn = ConexionAct5.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id_edicion") +" - " + rs.getInt("id_empleado"));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // UPDATE
    public void actualizar(int codigo_edicion, int codigo_empleado, int nuevoempleado) {
        String sql = "UPDATE empleados_reciben_ediciones SET id_empleado=? WHERE id_edicion=? and id_empleado=?";
        try (Connection conn = ConexionAct5.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, nuevoempleado);
            ps.setInt(2, codigo_edicion);
            ps.setInt(3, codigo_empleado);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // DELETE
    public void borrar(int codigo_edicion, int codigo_empleado) {
        String sql = "DELETE FROM empleados_reciben_ediciones WHERE id_edicion=? and id_empleado=?";
        try (Connection conn = ConexionAct5.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigo_edicion);
            ps.setInt(2, codigo_empleado);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
