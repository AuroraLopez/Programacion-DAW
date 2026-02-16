package Actividades.Tarea.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AlumnoDAO {
    // CREATE
    public void insertar(Alumno a) {
        String sql = "INSERT INTO ALUMNO (id, nif, nombre, apellido1, apellido2, grupo) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = ConexionTarea.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, a.getId());
            ps.setString(2, a.getNif());
            ps.setString(3, a.getNombre());
            ps.setString(4, a.getApellido1());
            ps.setString(5, a.getApellido2());
            ps.setString(6, a.getGrupo());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // READ (SELECT)
    public List<Alumno> listar() {
        List<Alumno> alumnos = new ArrayList<>();
        String sql = "SELECT id, nif, nombre, apellido1, apellido2, grupo FROM ALUMNO";
        try (Connection conn = ConexionTarea.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                alumnos.add(new Alumno(
                        rs.getInt("id"), rs.getString("nif"), rs.getString("grupo")
                        , rs.getString("nombre") , rs.getString("apellido1")
                        , rs.getString("apellido2")));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return alumnos;
    }

    // UPDATE
    public void actualizar(Alumno a) {
        String sql = "UPDATE ALUMNO SET nombre=? WHERE id=?";
        try (Connection conn = ConexionTarea.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, a.getNombre());
            ps.setInt(2, a.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // DELETE
    public void borrar(int codigo) {
        String sql = "DELETE FROM ALUMNO WHERE id=?";
        try (Connection conn = ConexionTarea.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
