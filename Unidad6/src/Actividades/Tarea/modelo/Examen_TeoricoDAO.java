package Actividades.Tarea.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Examen_TeoricoDAO {
    // CREATE
    public void insertar(Examen_Teorico et) {
        String sql = "INSERT INTO EXAMEN_TEORICO (id, titulo, num_preguntas, fecha, id_profesor) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = ConexionTarea.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, et.getId());
            ps.setString(2, et.getTitulo());
            ps.setInt(3, et.getNum_preguntas());
            ps.setDate(4,et.getFecha());
            ps.setInt(5, et.getId_profesor());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // READ (SELECT)
    public List<Examen_Teorico> listar() {
        List<Examen_Teorico> examenes = new ArrayList<>();
        String sql = "SELECT id, titulo, num_preguntas, fecha, id_profesor FROM EXAMEN_TEORICO";
        try (Connection conn = ConexionTarea.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                examenes.add(new Examen_Teorico(rs.getInt("id"), rs.getString("titulo"), rs.getInt("num_preguntas") 
                        , rs.getDate("fecha"),rs.getInt("id_profesor")));
                        
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return examenes;
    }

    // // UPDATE
    // public static void actualizar(int codigo, String nuevotitulo) {
    //     String sql = "UPDATE EXAMEN_TEORICO SET titulo=? WHERE id=?";
    //     try (Connection conn = ConexionTarea.getConnection();
    //             PreparedStatement ps = conn.prepareStatement(sql)) {
    //         ps.setString(1, nuevotitulo);
    //         ps.setInt(2, codigo);
    //         ps.executeUpdate();
    //     } catch (SQLException e) {
    //         System.err.println(e.getMessage());
    //     }
    // }

    // // DELETE
    // public static void borrar(int codigo) {
    //     String sql = "DELETE FROM EXAMEN_TEORICO WHERE id=?";
    //     try (Connection conn = ConexionTarea.getConnection();
    //             PreparedStatement ps = conn.prepareStatement(sql)) {
    //         ps.setInt(1, codigo);
    //         ps.executeUpdate();
    //     } catch (SQLException e) {
    //         System.err.println(e.getMessage());
    //     }
    // }
}
