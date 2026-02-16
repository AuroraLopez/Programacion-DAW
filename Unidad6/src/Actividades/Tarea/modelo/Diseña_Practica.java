package Actividades.Tarea.modelo;

import java.sql.Date;

public class Diseña_Practica {
    private int id_practica;
    private int id_profesor;
    private Date fecha;

    public Diseña_Practica() {

    }
    
    public Diseña_Practica(int id_practica, int id_profesor, Date fecha) {
        this.id_practica = id_practica;
        this.id_profesor = id_profesor;
        this.fecha = fecha;
    }

    public int getId_practica() {
        return id_practica;
    }

    public void setId_practica(int id_practica) {
        this.id_practica = id_practica;
    }

    public int getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(int id_profesor) {
        this.id_profesor = id_profesor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
}
