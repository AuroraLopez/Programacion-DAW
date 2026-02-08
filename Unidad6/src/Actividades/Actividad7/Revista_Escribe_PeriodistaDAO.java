package Actividades.Actividad7;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Conexiones.ConexionAct7;

public class Revista_Escribe_PeriodistaDAO {
    // CREATE
    public static void insertar(int id_periodista, int num_registro_revista) {
        String sql = "INSERT INTO REVISTA_ESCRIBE_PERIODISTA VALUES (?, ?)";
        try (Connection conn = ConexionAct7.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id_periodista);
            ps.setInt(2, num_registro_revista);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // READ (SELECT)
    public static void listar() {
        String sql = "SELECT * FROM REVISTA_ESCRIBE_PERIODISTA";
        try (Connection conn = ConexionAct7.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id_periodista") + " - " + rs.getString("num_registro_revista"));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // UPDATE
    public static void actualizar(int id_periodista, int nuevonum_registro_revista, int num_registro_revista) {
        String sql = "UPDATE REVISTA_ESCRIBE_PERIODISTA SET num_registro_revista=? WHERE id_periodista=? and num_registro_revista=?";
        try (Connection conn = ConexionAct7.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, nuevonum_registro_revista);
            ps.setInt(2, id_periodista);
            ps.setInt(3, num_registro_revista);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // DELETE
    public static void borrar(int id_periodista, int num_registro_revista) {
        String sql = "DELETE FROM REVISTA_ESCRIBE_PERIODISTA WHERE id_periodista=? and num_registro_revista=?";
        try (Connection conn = ConexionAct7.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
                    ps.setInt(1, id_periodista);
                    ps.setInt(2, num_registro_revista);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
