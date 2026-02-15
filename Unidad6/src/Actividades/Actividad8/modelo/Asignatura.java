package Actividades.Actividad8.modelo;

public class Asignatura {
    protected int codigo;
    protected String nombre;
    protected int num_horas;
    protected int id_profesor;

    public Asignatura(){

    }

    public Asignatura(int codigo, String nombre, int num_horas, int id_profesor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.num_horas = num_horas;
        this.id_profesor = id_profesor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum_horas() {
        return num_horas;
    }

    public void setNum_horas(int num_horas) {
        this.num_horas = num_horas;
    }

    public int getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(int id_profesor) {
        this.id_profesor = id_profesor;
    }
    
}
