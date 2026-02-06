package Actividades.Actividad3;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Conexiones.ConexionAct3;

public class Examen_TeoricoDAO {
    // CREATE
    public static void insertar(int id, String titulo, int num_preguntas, Date fecha, int id_profesor) {
        String sql = "INSERT INTO EXAMEN_TEORICO VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = ConexionAct3.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.setString(2, titulo);
            ps.setInt(3, num_preguntas);
            ps.setDate(4,fecha);
            ps.setInt(5, id_profesor);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // READ (SELECT)
    public static void listar() {
        String sql = "SELECT * FROM EXAMEN_TEORICO";
        try (Connection conn = ConexionAct3.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " - " + rs.getString("titulo")+ " - " + rs.getInt("num_preguntas") 
                        + " - " + rs.getDate("fecha") + " - " + rs.getInt("id_profesor"));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // UPDATE
    public static void actualizar(int codigo, String nuevotitulo) {
        String sql = "UPDATE EXAMEN_TEORICO SET titulo=? WHERE id=?";
        try (Connection conn = ConexionAct3.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nuevotitulo);
            ps.setInt(2, codigo);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // DELETE
    public static void borrar(int codigo) {
        String sql = "DELETE FROM EXAMEN_TEORICO WHERE id=?";
        try (Connection conn = ConexionAct3.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
