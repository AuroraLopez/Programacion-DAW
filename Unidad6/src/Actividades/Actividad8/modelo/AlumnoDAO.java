package Actividades.Actividad8.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Conexiones.ConexionAct8;

public class AlumnoDAO {
    // READ (lista de Alumno)
    public List<Alumno> listar() {
        List<Alumno> alumnos = new ArrayList<>();
        String sql = "SELECT num_matricula, nombre, apellido1, apellido2, fecha_nacimiento, telefono FROM alumno";
        try (Connection conn = ConexionAct8.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                alumnos.add(new Alumno(rs.getInt("num_matricula"),
                        rs.getString("nombre"), rs.getString("apellido1"), rs.getString("apellido2"),
                            rs.getDate("fecha_nacimiento"), rs.getString("telefono")
                         ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return alumnos;
    }

    // CREATE
    public void insertar(Alumno a) {
        String sql = "INSERT INTO alumno (num_matricula, nombre, apellido1, apellido2, fecha_nacimiento, telefono) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = ConexionAct8.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, a.getNum_matricula());
            ps.setString(2, a.getNombre());
            ps.setString(3, a.getApellido1());
            ps.setString(4, a.getApellido2());
            ps.setDate(5, a.getFecha_nacimiento());
            ps.setString(6, a.getTelefono());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // UPDATE
    public void actualizar(Alumno a) {
        String sql = "UPDATE alumno SET nombre=? WHERE num_matricula=?";
        try (Connection conn = ConexionAct8.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, a.getNombre());
            ps.setInt(2, a.getNum_matricula());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void eliminar(int num_matricula) {
        String sql = "DELETE FROM alumno WHERE num_matricula=?";
        try (Connection conn = ConexionAct8.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, num_matricula);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
