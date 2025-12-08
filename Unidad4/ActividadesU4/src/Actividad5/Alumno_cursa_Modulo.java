package Actividad5;

import java.util.ArrayList;

public class Alumno_cursa_Modulo {
    private Alumno alumno;
    private ArrayList<Modulo> modulo=new ArrayList<>();

    // Constructores
    public Alumno_cursa_Modulo(){

    }

    public Alumno_cursa_Modulo(Alumno alumno, ArrayList<Modulo> modulo) {
        this.alumno = alumno;
        this.modulo = modulo;
    }

    // Imprimimos
    @Override
    public String toString() {
        return "Alumno_cursa_Modulo [alumno=" + alumno + ", modulo=" + modulo + "]";
    }
    
    
}
