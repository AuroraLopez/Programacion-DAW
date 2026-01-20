package Actividades.Tarea2;

import java.util.ArrayList;

public class Taller {
    private String nombre;
    private String direccion;
    private Propietario propietario;
    private ArrayList<Cliente> lista = new ArrayList<>();

    public Taller(){

    }

    public Taller(String nombre, String direccion, Propietario propietario) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.propietario = propietario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public ArrayList<Cliente> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Cliente> lista) {
        this.lista = lista;
    }
}
