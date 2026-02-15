package Actividades.Actividad8.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Conexiones.ConexionAct8;

public class Curso_EscolarDAO {
    // READ (lista de curso_escolar)
    public List<Curso_Escolar> listar() {
        List<Curso_Escolar> cursoescolares = new ArrayList<>();
        String sql = "SELECT id, año_inicio, año_fin FROM curso_escolar";
        try (Connection conn = ConexionAct8.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                cursoescolares.add(new Curso_Escolar(rs.getInt("id"),
                        rs.getDate("año_inicio"), rs.getDate("año_fin")
                         ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cursoescolares;
    }

    // CREATE
    public void insertar(Curso_Escolar c) {
        String sql = "INSERT INTO curso_escolar (id, año_inicio, año_fin) VALUES (?, ?, ?)";
        try (Connection conn = ConexionAct8.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, c.getId());
            ps.setDate(2, c.getAño_inicio());
            ps.setDate(3, c.getAño_fin());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // UPDATE
    public void actualizar(Curso_Escolar c) {
        String sql = "UPDATE curso_escolar SET año_inicio=? WHERE id=?";
        try (Connection conn = ConexionAct8.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setDate(1, c.getAño_inicio());
            ps.setInt(2, c.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void eliminar(int id) {
        String sql = "DELETE FROM curso_escolar WHERE id=?";
        try (Connection conn = ConexionAct8.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
