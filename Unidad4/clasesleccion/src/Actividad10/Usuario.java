package Actividad10;

import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private int codigo;
    ArrayList<Libro> lista = new ArrayList<>(5);

    // Constructores
    public Usuario(){

    }

    public Usuario(String nombre, int codigo,  ArrayList<Libro> lista) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.lista = lista;
    }
    // Metodos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", codigo=" + codigo +
                '}';
    }
}
