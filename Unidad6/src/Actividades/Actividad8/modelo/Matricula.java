package Actividades.Actividad8.modelo;

public class Matricula {
    protected int codigo_asignatura;
    protected int id_curso;
    protected int matricula_alumno;

    public Matricula(){

    }

    public Matricula(int codigo_asignatura, int id_curso, int matricula_alumno) {
        this.codigo_asignatura = codigo_asignatura;
        this.id_curso = id_curso;
        this.matricula_alumno = matricula_alumno;
    }

    public int getCodigo_asignatura() {
        return codigo_asignatura;
    }

    public void setCodigo_asignatura(int codigo_asignatura) {
        this.codigo_asignatura = codigo_asignatura;
    }

    public int getId_curso() {
        return id_curso;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    public int getMatricula_alumno() {
        return matricula_alumno;
    }

    public void setMatricula_alumno(int matricula_alumno) {
        this.matricula_alumno = matricula_alumno;
    }
    
}
