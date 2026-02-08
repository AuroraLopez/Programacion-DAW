package Actividades.Actividad7;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Conexiones.ConexionAct7;

public class EjemplarDAO {
    // CREATE
    public static void insertar(int num_registro_revista, Date fecha, int numeros_paginas, int numeros_ejemplares) {
        String sql = "INSERT INTO EJEMPLAR VALUES (?, ?, ?, ?)";
        try (Connection conn = ConexionAct7.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, num_registro_revista);
            ps.setDate(2, fecha);
            ps.setInt(3, numeros_paginas);
            ps.setInt(4, numeros_ejemplares);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // READ (SELECT)
    public static void listar() {
        String sql = "SELECT * FROM EJEMPLAR";
        try (Connection conn = ConexionAct7.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(
                        rs.getInt("num_registro_revista") + " - " + rs.getDate("fecha") + " - " + rs.getInt("numeros_paginas")
                        + " - " + rs.getInt("numeros_ejemplares"));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // UPDATE
    public static void actualizar(int num_registro_revista, int nuevonumeros_paginas, Date fecha) {
        String sql = "UPDATE EJEMPLAR SET numeros_paginas=? WHERE num_registro_revista=? and fecha=?";
        try (Connection conn = ConexionAct7.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, nuevonumeros_paginas);
            ps.setInt(2, num_registro_revista);
            ps.setDate(3, fecha);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    // DELETE
    public static void borrar(int num_registro_revista, Date fecha) {
        String sql = "DELETE FROM EJEMPLAR WHERE num_registro_revista=? and fecha=?";
        try (Connection conn = ConexionAct7.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, num_registro_revista);
            ps.setDate(2, fecha);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
