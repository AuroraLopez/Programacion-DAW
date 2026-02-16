package Actividades.Tarea.modelo;

public class Hace_Examen {
    private int id_alumno;
    private int id_examen;
    private double nota;

    
    public Hace_Examen() {

    }

    public Hace_Examen(int id_alumno, int id_examen, double nota) {
        this.id_alumno = id_alumno;
        this.id_examen = id_examen;
        this.nota = nota;
    }

    public int getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }

    public int getId_examen() {
        return id_examen;
    }

    public void setId_examen(int id_examen) {
        this.id_examen = id_examen;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
