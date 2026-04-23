package Actividades.Actividad4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Conexiones.ConexionAct4;

public class MatriculaDAO {
    // CREATE
    public void insertar(int codigo_asignatura, int id_curso, int matricula_alumno) {
        String sql = "INSERT INTO matricula VALUES (?, ?, ?)";
        try (Connection conn = ConexionAct4.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigo_asignatura);
            ps.setInt(2, id_curso);
            ps.setInt(3, matricula_alumno);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // READ (SELECT)
    public void listar() {
        String sql = "SELECT * FROM matricula";
        try (Connection conn = ConexionAct4.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(
                        rs.getInt("codigo_asignatura") + " - " + rs.getInt("id_curso") + " - " + rs.getInt("matricula_alumno"));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // UPDATE
    public void actualizar(int codigo_asignatura, int id_curso, int matricula_alumno, int nuevaasignatura) {
        String sql = "UPDATE matricula SET codigo_asignatura=? WHERE codigo_asignatura=? and id_curso=? and matricula_alumno=?";
        try (Connection conn = ConexionAct4.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, nuevaasignatura);
            ps.setInt(2, codigo_asignatura);
            ps.setInt(3, id_curso);
            ps.setInt(4, matricula_alumno);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // DELETE
    public void borrar(int codigo_asignatura, int id_curso, int matricula_alumno) {
        String sql = "DELETE FROM matricula WHERE codigo_asignatura=? and id_curso=? and matricula_alumno=?";
        try (Connection conn = ConexionAct4.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigo_asignatura);
            ps.setInt(2, id_curso);
            ps.setInt(3, matricula_alumno);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
