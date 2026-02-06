package Actividades.Actividad3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Conexiones.ConexionAct3;

public class Hace_ExamenDAO {
     // CREATE
    public static void insertar(int id_alumno, int id_examen, double nota) {
        String sql = "INSERT INTO HACE_EXAMEN VALUES (?, ?, ?)";
        try (Connection conn = ConexionAct3.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id_alumno);
            ps.setInt(2, id_examen);
            ps.setDouble(3, nota);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // READ (SELECT)
    public static void listar() {
        String sql = "SELECT * FROM HACE_EXAMEN";
        try (Connection conn = ConexionAct3.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id_alumno") + " - " + rs.getInt("id_examen")
                        + " - " + rs.getDouble("nota"));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // UPDATE
    public static void actualizar(int codigo_alumno, int codigo_examen, double notanueva) {
        String sql = "UPDATE HACE_EXAMEN SET nota=? WHERE id_alumno=? and id_examen=?";
        try (Connection conn = ConexionAct3.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setDouble(1, notanueva);
            ps.setInt(2, codigo_alumno);
            ps.setInt(3, codigo_examen);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // DELETE
    public static void borrar(int codigo_alumno, int codigo_examen) {
        String sql = "DELETE FROM HACE_EXAMEN WHERE id_alumno=? and id_examen=?";
        try (Connection conn = ConexionAct3.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigo_alumno);
            ps.setInt(2, codigo_examen);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
