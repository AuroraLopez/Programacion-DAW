package Actividades.Actividad2;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Conexiones.Conexion;

public class SuministroDAO {
     public void insertar(int codigo_proveedor, int codigo_pieza, int cantidad, Date fecha) {
        String sql = "INSERT INTO SUMINISTRA VALUES (?, ?, ?, ?)";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigo_proveedor);
            ps.setInt(2, codigo_pieza);
            ps.setInt(3, cantidad);
            ps.setDate(4, fecha);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // READ (SELECT)
    public void listar() {
        String sql = "SELECT * FROM SUMINISTRA";
        try (Connection conn = Conexion.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(
                        rs.getInt("codigo_proveedor") + " - " + rs.getInt("codigo_pieza")+ " - " +
                        rs.getInt("cantidad")+ " - " + rs.getDate("fecha"));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // UPDATE
    public void actualizar(int codigo_proveedor, int codigo_pieza, Date fecha, int nuevacantidad) {
        String sql = "UPDATE SUMINISTRA SET cantidad=? WHERE codigo_proveedor=? and codigo_pieza=? and fecha=?";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, nuevacantidad);
            ps.setInt(2, codigo_proveedor);
            ps.setInt(3, codigo_pieza);
            ps.setDate(4, fecha);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // DELETE
    public void borrar(int codigo_proveedor, int codigo_pieza, Date fecha) {
        String sql = "DELETE FROM SUMINISTRA WHERE codigo_proveedor=? and codigo_pieza=? and fecha=?";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigo_proveedor);
            ps.setInt(2, codigo_pieza);
            ps.setDate(3, fecha);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
