package Actividades;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Conexiones.Conexionnba;

public class Actividad1 {
    public static void main(String[] args) {
        // // Muestra los jugadores españoles que son de los Lakers
        // listarJugadoresExpañoles();

        // //Modifica el jugador 666 para que ponga bien su Procedencia
        // actualizarProcendecia(666, "Spain");

        // Inserta un registro en jugadores y bórralo
        // crearJugador(700,"Aurora López Fuentes", "Spain", "6-11", 87, "G", "Lakers");
        // eliminarjugador(700);
        
        // select distinct equipo_local from partidos where puntos_local > 100 and puntos_local > puntos_visitante and temporada='02/03' 
        // equipoConMayorPuntuacion();

        /*
        * select jugadores.Nombre, estadisticas.temporada, estadisticas.Puntos_por_partido from jugadores,estadisticas where
        * estadisticas.jugador=jugadores.codigo and (temporada,Puntos_por_partido) in (select
        * temporada,max(Puntos_por_partido) from estadisticas group by temporada) order by estadisticas.temporada; 
        */
       listarEstadisticas();

    }
    public static void listarJugadoresExpañoles() {
        String sql = "SELECT Nombre, Procedencia FROM jugadores where Nombre_equipo='Lakers' and Procedencia='Spain';";
        try (Connection conn = Conexionnba.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                System.out.println(
                        rs.getString("Nombre") + " - " +
                        rs.getString("Procedencia"));
            }
        } catch (SQLException e) {
            System.err.println("Error al leer: " + e.getMessage());
        }
    }

    public static void actualizarProcendecia(int codigo, String nuevaProcedencia) {
        String sql = "UPDATE jugadores SET Procedencia = ? WHERE codigo = ?";
        try (Connection conn = Conexionnba.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nuevaProcedencia);
            ps.setInt(2, codigo);
            ps.executeUpdate();
            System.out.println("Jugador actualizado.");
        } catch (SQLException e) {
            System.err.println("Error al actualizar: " + e.getMessage());
        }
    }

     public static void crearJugador(int codigo, String nombre, String Procedencia, String Altura, int Peso, String Posicion, String Nombre_equipo) {
        String sql = "INSERT INTO jugadores (codigo, nombre, Procedencia, Altura, Peso, Posicion, Nombre_equipo) VALUES (?, ?, ?, ?, ?, ? ,?)";
        try (Connection conn = Conexionnba.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
                     ps.setInt(1, codigo);
            ps.setString(2, nombre);
            ps.setString(3, Procedencia);
            ps.setString(4, Altura);
            ps.setInt(5, Peso);
            ps.setString(6, Posicion);
            ps.setString(7, Nombre_equipo);
            ps.executeUpdate();
            System.out.println("Jugadora insertado.");
        } catch (SQLException e) {
            System.err.println("Error al insertar: " + e.getMessage());
        }
    }
    public static void eliminarjugador(int codigo) {
        String sql = "DELETE FROM jugadores WHERE codigo = ?";
        try (Connection conn = Conexionnba.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, codigo);
            ps.executeUpdate();
            System.out.println("Jugador "+codigo+" eliminado.");
        } catch (SQLException e) {
            System.err.println("Error al borrar: " + e.getMessage());
        }
    }

    public static void equipoConMayorPuntuacion() {
        String sql = "select distinct equipo_local from partidos where puntos_local > 100 and puntos_local > puntos_visitante and temporada='02/03';";
        try (Connection conn = Conexionnba.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                System.out.println(
                        rs.getString("equipo_local"));
                    
            }
        } catch (SQLException e) {
            System.err.println("Error al leer: " + e.getMessage());
        }
    }

    public static void listarEstadisticas() {
        String sql = "select jugadores.Nombre, estadisticas.temporada, estadisticas.Puntos_por_partido from jugadores,estadisticas where\r\n" + //
                        "        estadisticas.jugador=jugadores.codigo and (temporada,Puntos_por_partido) in (select\r\n" + //
                        "        temporada,max(Puntos_por_partido) from estadisticas group by temporada) order by estadisticas.temporada";
        try (Connection conn = Conexionnba.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                System.out.println(
                        rs.getString("jugadores.Nombre")+ " - " +
                        rs.getString("estadisticas.temporada")+ " - " +
                        rs.getFloat("estadisticas.Puntos_por_partido")
                    );
                    
            }
        } catch (SQLException e) {
            System.err.println("Error al leer: " + e.getMessage());
        }
    }
}
