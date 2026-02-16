package Actividades.Tarea.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProfesorDAO {
    // CREATE
    public void insertar(Profesor p) {
        String sql = "INSERT INTO profesor (id, nif, nombre, apellido1, apellido2) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = ConexionTarea.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, p.getId());
            ps.setString(2, p.getNif());
            ps.setString(3, p.getNombre());
            ps.setString(4, p.getApellido1());
            ps.setString(5, p.getApellido2());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // READ (lista de Profesor)
    public List<Profesor> listar() {
        List<Profesor> profesores = new ArrayList<>();
        String sql = "SELECT id, nif ,nombre, apellido1, apellido2 FROM profesor";
        try (Connection conn = ConexionTarea.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                profesores.add(new Profesor(rs.getInt("id"),
                        rs.getString("nif"), rs.getString("nombre")
                         , rs.getString("apellido1") , rs.getString("apellido2")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return profesores;
    }

    // UPDATE
    public void actualizar(Profesor p) {
        String sql = "UPDATE profesor SET nombre=? WHERE id=?";
        try (Connection conn = ConexionTarea.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, p.getNombre());
            ps.setInt(2, p.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void eliminar(int codigo) {
        String sql = "DELETE FROM PROFESOR WHERE id=?";
        try (Connection conn = ConexionTarea.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
