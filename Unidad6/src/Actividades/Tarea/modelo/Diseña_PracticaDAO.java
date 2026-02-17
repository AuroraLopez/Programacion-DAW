package Actividades.Tarea.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class Diseña_PracticaDAO {
     // CREATE
    public void insertar(Diseña_Practica dp) {
        String sql = "INSERT INTO DISEÑA_PRACTICA (id_profesor, id_practica, fecha) VALUES (?, ?, ?)";
        try (Connection conn = ConexionTarea.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, dp.getId_profesor());
            ps.setInt(2, dp.getId_practica());
            ps.setDate(3, dp.getFecha());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // READ (SELECT)
    public List<Diseña_Practica> listar() {
        List<Diseña_Practica> diseña_practicas=new ArrayList<>();
        String sql = "SELECT id_profesor, id_practica, fecha FROM DISEÑA_PRACTICA";
        try (Connection conn = ConexionTarea.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                diseña_practicas.add(new Diseña_Practica(rs.getInt("id_profesor"), rs.getInt("id_practica"), rs.getDate("fecha")));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return diseña_practicas;
    }

    // // UPDATE
    // public static void actualizar(int codigo_profesor, int codigo_practica, Date nuevaFecha) {
    //     String sql = "UPDATE DISEÑA_PRACTICA SET fecha=? WHERE id_profesor=? and id_practica=?";
    //     try (Connection conn = ConexionAct3.getConnection();
    //             PreparedStatement ps = conn.prepareStatement(sql)) {
    //         ps.setDate(1, nuevaFecha);
    //         ps.setInt(2, codigo_profesor);
    //         ps.setInt(3, codigo_practica);
    //         ps.executeUpdate();
    //     } catch (SQLException e) {
    //         System.err.println(e.getMessage());
    //     }
    // }

    // // DELETE
    // public static void borrar(int codigo_profesor, int codigo_practica, Date fecha) {
    //     String sql = "DELETE FROM DISEÑA_PRACTICA WHERE id_profesor=? and id_practica=? and fecha=?";
    //     try (Connection conn = ConexionAct3.getConnection();
    //             PreparedStatement ps = conn.prepareStatement(sql)) {
    //         ps.setInt(1, codigo_profesor);
    //         ps.setInt(2, codigo_practica);
    //         ps.setDate(2, fecha);
    //         ps.executeUpdate();
    //     } catch (SQLException e) {
    //         System.err.println(e.getMessage());
    //     }
    // }
}
