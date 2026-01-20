package Actividades.Tarea2;

import java.util.ArrayList;

public class Cliente extends Persona{
    private String telefono;
    private ArrayList<Vehiculo> lista = new ArrayList<>();
    public Cliente(String dNI, String nombre, String pape, String telefono) {
        super(dNI, nombre, pape);
        this.telefono = telefono;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public ArrayList<Vehiculo> getLista() {
        return lista;
    }
    public void setLista(ArrayList<Vehiculo> lista) {
        this.lista = lista;
    }
}
