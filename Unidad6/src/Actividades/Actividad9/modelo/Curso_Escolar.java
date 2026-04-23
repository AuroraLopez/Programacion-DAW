package Actividades.Actividad9.modelo;

import java.sql.Date;
import java.time.Year;

public class Curso_Escolar {
    protected int id;
    protected Year año_inicio;
    protected Year año_fin;
    
    public Curso_Escolar(){

    }

    public Curso_Escolar(int id, Year año_inicio, Year año_fin) {
        this.id = id;
        this.año_inicio = año_inicio;
        this.año_fin = año_fin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Year getAño_inicio() {
        return año_inicio;
    }

    public void setAño_inicio(Year año_inicio) {
        this.año_inicio = año_inicio;
    }

    public Year getAño_fin() {
        return año_fin;
    }

    public void setAño_fin(Year año_fin) {
        this.año_fin = año_fin;
    }
}
