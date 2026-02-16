package Actividades.Tarea.modelo;

import java.sql.Date;

public class Examen_Teorico {
    private int id;
    private String titulo;
    private int num_preguntas;
    private Date fecha;
    private int id_profesor;

    public Examen_Teorico(){

    }

    public Examen_Teorico(int id, String titulo, int num_preguntas, Date fecha, int id_profesor) {
        this.id = id;
        this.titulo = titulo;
        this.num_preguntas = num_preguntas;
        this.fecha = fecha;
        this.id_profesor = id_profesor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNum_preguntas() {
        return num_preguntas;
    }

    public void setNum_preguntas(int num_preguntas) {
        this.num_preguntas = num_preguntas;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(int id_profesor) {
        this.id_profesor = id_profesor;
    }
    
}
