import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Conexiones.Conexion;

public class AppBD {
    public static void main(String[] args) {
        // SQL para crear tabla persona
        // String sql = "CREATE TABLE IF NOT EXISTS persona (" +
        // "id INT AUTO_INCREMENT PRIMARY KEY, " +
        // "nombre VARCHAR(100), " +
        // "email VARCHAR(100)" +
        // ")";
        // Connection conexion = Conexion.getConnection();
        // Statement stmt = conexion.createStatement();

        // stmt.executeUpdate(sql);
        // System.out.println("Tabla persona creada correctamente");

        // crearPersona("Jose Luis López Fuentes", "jllopfue679@g.educaand.es");
        // crearPersona("Nicolas Asencio", "Nicolas@g.educaand.es");
        // crearPersona("Adrían Contreras", "adricontre@g.educaand.es");

        // Leer contenido de la tabla persona
        // listarPersonas();
        // listarPersonasPorID(1);

        // Actualizar el contenido de persona
        // actualizarPersona(3, "pruebaactualizado@gmail.com");

        //Borrar registros en personas
        eliminarPersona("jllopfue679@g.educaand.es");
    }

    public static void crearPersona(String nombre, String email) {
        String sql = "INSERT INTO persona (nombre, email) VALUES (?, ?)";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nombre);
            ps.setString(2, email);
            ps.executeUpdate();
            System.out.println("Persona creada.");
        } catch (SQLException e) {
            System.err.println("Error al insertar: " + e.getMessage());
        }
    }

    public static void listarPersonas() {
        String sql = "SELECT id, nombre, email FROM persona";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + ": " +
                                rs.getString("nombre") + " - " +
                                rs.getString("email"));
            }
        } catch (SQLException e) {
            System.err.println("Error al leer: " + e.getMessage());
        }
    }

    public static void listarPersonasPorID(int id) {
        String sql = "SELECT id, nombre, email FROM persona where id=?";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            {
                while (rs.next()) {
                    System.out.println(
                            rs.getInt("id") + ": " +
                                    rs.getString("nombre") + " - " +
                                    rs.getString("email"));
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al leer: " + e.getMessage());
        }
    }

    public static void actualizarPersona(int id, String nuevoEmail) {
        String sql = "UPDATE persona SET email = ? WHERE id = ?";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nuevoEmail);
            ps.setInt(2, id);
            ps.executeUpdate();
            System.out.println("Persona actualizada.");
        } catch (SQLException e) {
            System.err.println("Error al actualizar: " + e.getMessage());
        }
    }

    public static void eliminarPersona(String email) {
        String sql = "DELETE FROM persona WHERE email = ?";
        try (Connection conn = Conexion.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, email);
            ps.executeUpdate();
            System.out.println("Persona eliminada.");
        } catch (SQLException e) {
            System.err.println("Error al borrar: " + e.getMessage());
        }
    }
}
