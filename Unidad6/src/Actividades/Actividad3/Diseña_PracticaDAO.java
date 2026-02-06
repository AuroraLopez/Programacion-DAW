package Actividades.Actividad3;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Conexiones.ConexionAct3;

public class Diseña_PracticaDAO {
     // CREATE
    public static void insertar(int id_profesor, int id_practica, Date fecha) {
        String sql = "INSERT INTO DISEÑA_PRACTICA VALUES (?, ?, ?)";
        try (Connection conn = ConexionAct3.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id_profesor);
            ps.setInt(2, id_practica);
            ps.setDate(3, fecha);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // READ (SELECT)
    public static void listar() {
        String sql = "SELECT * FROM DISEÑA_PRACTICA";
        try (Connection conn = ConexionAct3.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id_profesor") + " - " + rs.getInt("id_practica")+ " - " + rs.getDate("fecha"));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // UPDATE
    public static void actualizar(int codigo_profesor, int codigo_practica, Date nuevaFecha) {
        String sql = "UPDATE DISEÑA_PRACTICA SET fecha=? WHERE id_profesor=? and id_practica=?";
        try (Connection conn = ConexionAct3.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setDate(1, nuevaFecha);
            ps.setInt(2, codigo_profesor);
            ps.setInt(3, codigo_practica);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // DELETE
    public static void borrar(int codigo_profesor, int codigo_practica, Date fecha) {
        String sql = "DELETE FROM DISEÑA_PRACTICA WHERE id_profesor=? and id_practica=? and fecha=?";
        try (Connection conn = ConexionAct3.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigo_profesor);
            ps.setInt(2, codigo_practica);
            ps.setDate(2, fecha);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
