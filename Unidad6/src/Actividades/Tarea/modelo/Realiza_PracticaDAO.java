package Actividades.Tarea.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Realiza_PracticaDAO {
     // CREATE
    public void insertar(Realiza_Practica rp) {
        String sql = "INSERT INTO REALIZA_PRACTICA (id_alumno, id_practico, fecha, nota) VALUES (?, ?, ?, ?)";
        try (Connection conn = ConexionTarea.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, rp.getId_alumno());
            ps.setInt(2, rp.getId_practico());
            ps.setDate(3, rp.getFecha());
            ps.setDouble(4, rp.getNota());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // READ (SELECT)
    public List<Realiza_Practica> listar() {
        List<Realiza_Practica> realiza_practicas= new ArrayList<>();
        String sql = "SELECT id_alumno, id_practica, fecha, nota FROM REALIZA_PRACTICA";
        try (Connection conn = ConexionTarea.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                        realiza_practicas.add(new Realiza_Practica(rs.getInt("id_alumno"), rs.getInt("id_practica"), rs.getDate("fecha")
                        ,rs.getDouble("nota")));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return realiza_practicas;
    }

    // // UPDATE
    // public static void actualizar(int codigo_alumno, int codigo_practica, double notanueva) {
    //     String sql = "UPDATE REALIZA_PRACTICA SET nota=? WHERE id_alumno=? and id_practica=?";
    //     try (Connection conn = ConexionTarea.getConnection();
    //             PreparedStatement ps = conn.prepareStatement(sql)) {
    //         ps.setDouble(1, notanueva);
    //         ps.setInt(2, codigo_alumno);
    //         ps.setInt(3, codigo_practica);
    //         ps.executeUpdate();
    //     } catch (SQLException e) {
    //         System.err.println(e.getMessage());
    //     }
    // }

    // // DELETE
    // public static void borrar(int codigo_alumno, int codigo_practica) {
    //     String sql = "DELETE FROM REALIZA_PRACTICA WHERE id_alumno=? and id_practica=?";
    //     try (Connection conn = ConexionTarea.getConnection();
    //             PreparedStatement ps = conn.prepareStatement(sql)) {
    //         ps.setInt(1, codigo_alumno);
    //         ps.setInt(2, codigo_practica);
    //         ps.executeUpdate();
    //     } catch (SQLException e) {
    //         System.err.println(e.getMessage());
    //     }
    // }
}
