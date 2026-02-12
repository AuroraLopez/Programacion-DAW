package Actividades.Actividad8.modelo;

import java.sql.Date;

public class Curso_Escolar {
    protected int id;
    protected Date año_inicio;
    protected Date año_fin;
    
    public Curso_Escolar(){

    }

    public Curso_Escolar(int id, Date año_inicio, Date año_fin) {
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

    public Date getAño_inicio() {
        return año_inicio;
    }

    public void setAño_inicio(Date año_inicio) {
        this.año_inicio = año_inicio;
    }

    public Date getAño_fin() {
        return año_fin;
    }

    public void setAño_fin(Date año_fin) {
        this.año_fin = año_fin;
    }
    
}
