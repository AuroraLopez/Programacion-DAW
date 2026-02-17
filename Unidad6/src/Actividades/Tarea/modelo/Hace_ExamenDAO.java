package Actividades.Tarea.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Conexiones.ConexionAct3;

public class Hace_ExamenDAO {
     // CREATE
    public void insertar(Hace_Examen he) {
        String sql = "INSERT INTO HACE_EXAMEN (id_alumno, id_examen, nota) VALUES (?, ?, ?)";
        try (Connection conn = ConexionAct3.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, he.getId_alumno());
            ps.setInt(2, he.getId_examen());
            ps.setDouble(3, he.getNota());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // READ (SELECT)
    public List<Hace_Examen> listar() {
        List<Hace_Examen> hace_examenes = new ArrayList<>();
        String sql = "SELECT id_alumno, id_examen, nota FROM HACE_EXAMEN";
        try (Connection conn = ConexionAct3.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                hace_examenes.add(new Hace_Examen(rs.getInt("id_alumno"),rs.getInt("id_examen")
                        ,rs.getDouble("nota")));
                        
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return hace_examenes;
    }

    // // UPDATE
    // public static void actualizar(int codigo_alumno, int codigo_examen, double notanueva) {
    //     String sql = "UPDATE HACE_EXAMEN SET nota=? WHERE id_alumno=? and id_examen=?";
    //     try (Connection conn = ConexionAct3.getConnection();
    //             PreparedStatement ps = conn.prepareStatement(sql)) {
    //         ps.setDouble(1, notanueva);
    //         ps.setInt(2, codigo_alumno);
    //         ps.setInt(3, codigo_examen);
    //         ps.executeUpdate();
    //     } catch (SQLException e) {
    //         System.err.println(e.getMessage());
    //     }
    // }

    // // DELETE
    // public static void borrar(int codigo_alumno, int codigo_examen) {
    //     String sql = "DELETE FROM HACE_EXAMEN WHERE id_alumno=? and id_examen=?";
    //     try (Connection conn = ConexionAct3.getConnection();
    //             PreparedStatement ps = conn.prepareStatement(sql)) {
    //         ps.setInt(1, codigo_alumno);
    //         ps.setInt(2, codigo_examen);
    //         ps.executeUpdate();
    //     } catch (SQLException e) {
    //         System.err.println(e.getMessage());
    //     }
    // }
}
