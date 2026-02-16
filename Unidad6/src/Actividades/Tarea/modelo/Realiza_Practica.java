package Actividades.Tarea.modelo;

import java.sql.Date;

public class Realiza_Practica {
    private int id_alumno;
    private int id_practico;
    private Date fecha;
    private double nota;

    public Realiza_Practica(){

    }

    public Realiza_Practica(int id_alumno, int id_practico, Date fecha, double nota) {
        this.id_alumno = id_alumno;
        this.id_practico = id_practico;
        this.fecha = fecha;
        this.nota = nota;
    }

    public int getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }

    public int getId_practico() {
        return id_practico;
    }

    public void setId_practico(int id_practico) {
        this.id_practico = id_practico;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
}
