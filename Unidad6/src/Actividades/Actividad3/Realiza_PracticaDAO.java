package Actividades.Actividad3;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Conexiones.ConexionAct3;

public class Realiza_PracticaDAO {
     // CREATE
    public static void insertar(int id_alumno, int id_practica, Date fecha, double nota) {
        String sql = "INSERT INTO REALIZA_PRACTICA VALUES (?, ?, ?, ?)";
        try (Connection conn = ConexionAct3.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id_alumno);
            ps.setInt(2, id_practica);
            ps.setDate(3, fecha);
            ps.setDouble(4, nota);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // READ (SELECT)
    public static void listar() {
        String sql = "SELECT * FROM REALIZA_PRACTICA";
        try (Connection conn = ConexionAct3.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id_alumno") + " - " + rs.getInt("id_practica")+ " - " + rs.getDate("fecha")
                        + " - " + rs.getDouble("nota"));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // UPDATE
    public static void actualizar(int codigo_alumno, int codigo_practica, double notanueva) {
        String sql = "UPDATE REALIZA_PRACTICA SET nota=? WHERE id_alumno=? and id_practica=?";
        try (Connection conn = ConexionAct3.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setDouble(1, notanueva);
            ps.setInt(2, codigo_alumno);
            ps.setInt(3, codigo_practica);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // DELETE
    public static void borrar(int codigo_alumno, int codigo_practica) {
        String sql = "DELETE FROM REALIZA_PRACTICA WHERE id_alumno=? and id_practica=?";
        try (Connection conn = ConexionAct3.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigo_alumno);
            ps.setInt(2, codigo_practica);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
