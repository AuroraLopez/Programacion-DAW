package Actividades.Actividad8.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Conexiones.ConexionAct8;

public class AsignaturaDAO {
     // READ (lista de Asignatura)
    public List<Asignatura> listar() {
        List<Asignatura> asignaturas = new ArrayList<>();
        String sql = "SELECT codigo, nombre, num_horas, id_profesor FROM asignatura";
        try (Connection conn = ConexionAct8.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                asignaturas.add(new Asignatura(rs.getInt("codigo"),
                        rs.getString("nombre"), rs.getInt("num_horas"), rs.getInt("id_profesor")
                         ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return asignaturas;
    }

    // CREATE
    public void insertar(Asignatura a) {
        String sql = "INSERT INTO asignatura (codigo, nombre, num_horas, id_profesor) VALUES (?, ?, ?, ?)";
        try (Connection conn = ConexionAct8.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, a.getCodigo());
            ps.setString(2, a.getNombre());
            ps.setInt(3, a.getNum_horas());
            ps.setInt(4, a.getId_profesor());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // UPDATE
    public void actualizar(Asignatura a) {
        String sql = "UPDATE asignatura SET nombre=? WHERE codigo=?";
        try (Connection conn = ConexionAct8.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, a.getNombre());
            ps.setInt(2, a.getCodigo());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void eliminar(int codigo) {
        String sql = "DELETE FROM asignatura WHERE codigo=?";
        try (Connection conn = ConexionAct8.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
