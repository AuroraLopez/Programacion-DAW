package Actividades.Actividad8.modelo;

public class Asignatura {
    protected int codigo;
    protected String nombre;
    protected int num_horas;

    public Asignatura(){

    }

    public Asignatura(int codigo, String nombre, int num_horas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.num_horas = num_horas;
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
    
}
