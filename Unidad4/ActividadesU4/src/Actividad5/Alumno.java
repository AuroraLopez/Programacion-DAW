package Actividad5;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private int expediente;
    private String nombre;
    private String apellidos;
    private String fecha_nac;
    private String es_delegado;

    // Constructores
    public Alumno() {

    }

    public Alumno(int expediente, String nombre, String apellidos, String fecha_nac, String es_delegado) {
        this.expediente = expediente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fecha_nac = fecha_nac;
        this.es_delegado = es_delegado;
    }

    // Imprimimos
    @Override
    public String toString() {
        return "Alumno [expediente=" + expediente + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fecha_nac="
                + fecha_nac + ", es_delegado=" + es_delegado + "]";
    }

}
