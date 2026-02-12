package Actividades.Actividad8.modelo;

import java.sql.Date;

public class Alumno {
    protected int num_matricula;
    protected String nombre;
    protected String apellido1;
    protected String apellido2;
    protected Date fecha_nacimiento;
    protected String telefono;

    public Alumno(){

    }

    public Alumno(int num_matricula, String nombre, String apellido1, String apellido2, Date fecha_nacimiento,
            String telefono) {
        this.num_matricula = num_matricula;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fecha_nacimiento = fecha_nacimiento;
        this.telefono = telefono;
    }

    public int getNum_matricula() {
        return num_matricula;
    }

    public void setNum_matricula(int num_matricula) {
        this.num_matricula = num_matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
