package Actividades.Actividad9.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Conexiones.ConexionAct4;

public class MatriculaDAO {
    public List<Matricula> listar() {

        List<Matricula> matriculas = new ArrayList<>();
        String sql = "SELECT codigo_asignatura, id_curso, matricula_alumno FROM matricula";

        try (Connection conn = ConexionAct4.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                matriculas.add(new Matricula(
                        rs.getInt("codigo_asignatura"),
                        rs.getInt("id_curso"),
                        rs.getInt("matricula_alumno")
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return matriculas;
    }


    // CREATE
    public void insertar(Matricula m) {

        String sql = "INSERT INTO matricula (codigo_asignatura, id_curso, matricula_alumno) VALUES (?, ?, ?)";

        try (Connection conn = ConexionAct4.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, m.getCodigo_asignatura());
            ps.setInt(2, m.getId_curso());
            ps.setInt(3, m.getMatricula_alumno());

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    // UPDATE
    public void actualizar(Matricula m, int nuevaAsignatura) {

        String sql = "UPDATE matricula SET codigo_asignatura=? WHERE codigo_asignatura=? AND id_curso=? AND matricula_alumno=?";

        try (Connection conn = ConexionAct4.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, nuevaAsignatura);
            ps.setInt(2, m.getCodigo_asignatura());
            ps.setInt(3, m.getId_curso());
            ps.setInt(4, m.getMatricula_alumno());

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    // DELETE
    public void eliminar(Matricula m) {

        String sql = "DELETE FROM matricula WHERE codigo_asignatura=? AND id_curso=? AND matricula_alumno=?";

        try (Connection conn = ConexionAct4.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, m.getCodigo_asignatura());
            ps.setInt(2, m.getId_curso());
            ps.setInt(3, m.getMatricula_alumno());

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
