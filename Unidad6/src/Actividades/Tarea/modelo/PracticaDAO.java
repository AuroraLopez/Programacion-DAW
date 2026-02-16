package Actividades.Tarea.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PracticaDAO {
    // CREATE
    public void insertar(Practica p) {
        String sql = "INSERT INTO PRACTICA(id, titulo, dificultad) VALUES (?, ?, ?)";
        try (Connection conn = ConexionTarea.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, p.getId());
            ps.setString(2, p.getTitulo());
            ps.setString(3, p.getDificultad());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // READ (lista de Practicas)
    public List<Practica> listar() {
        List<Practica> practicas = new ArrayList<>();
        String sql = "SELECT id, titulo, dificultad FROM PRACTICA";
        try (Connection conn = ConexionTarea.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                practicas.add(new Practica(
                        rs.getInt("id"), rs.getString("titulo"), rs.getString("dificultad")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return practicas;
    }

    // UPDATE
    public static void actualizar(Practica p) {
        String sql = "UPDATE PRACTICA SET titulo=? WHERE id=?";
        try (Connection conn = ConexionTarea.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, p.getTitulo());
            ps.setInt(2, p.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // DELETE
    public static void borrar(int codigo) {
        String sql = "DELETE FROM PRACTICA WHERE id=?";
        try (Connection conn = ConexionTarea.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
