package Actividades.Actividad5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Conexiones.ConexionAct5;

public class Prerrequisitos_CursosDAO {
    // CREATE
    public void insertar(int id_curso, int id_cursoanterior, boolean es_obligatorio) {
        String sql = "INSERT INTO prerrequisitos_cursos VALUES (?, ?, ?)";
        try (Connection conn = ConexionAct5.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id_curso);
            ps.setInt(2, id_cursoanterior);
            ps.setBoolean(3, es_obligatorio);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // READ (SELECT)
    public void listar() {
        String sql = "SELECT * FROM prerrequisitos_cursos";
        try (Connection conn = ConexionAct5.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id_curso") + " - " + rs.getInt("id_cursoanterior") + " - " + rs.getBoolean("es_obligatorio"));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // UPDATE
    public void actualizar(int codigo, int codigoanterior, Boolean nuevoobligatorio) {
        String sql = "UPDATE prerrequisitos_cursos SET es_obligatorio=? WHERE id_curso=? and id_cursoanterior=?";
        try (Connection conn = ConexionAct5.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setBoolean(1, nuevoobligatorio);
            ps.setInt(2, codigo);
            ps.setInt(3, codigoanterior);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // DELETE
    public void borrar(int codigo, int codigoanterior) {
        String sql = "DELETE FROM prerrequisitos_cursos WHERE id_curso=? and id_cursoanterior=?";
        try (Connection conn = ConexionAct5.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigo);
            ps.setInt(2, codigoanterior);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
