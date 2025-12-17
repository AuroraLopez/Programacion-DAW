package Actividad2;

public class Persona {
    private String cedula;
    private String nombre;
    private String apellido;
    private char genero;

    private Fecha fechaNacimiento;
    private Ciudad ciudadnatal;
    private Ciudad ciudadresidencia;

    // Constructor
    public Persona(){

    }

    public Persona(String cedula, String nombre, String apellido, char genero, Fecha fechaNacimiento,
            Ciudad ciudadnatal, Ciudad ciudadresidencia) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.ciudadnatal = ciudadnatal;
        this.ciudadresidencia = ciudadresidencia;
    }

    // Metodos
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Ciudad getCiudadnatal() {
        return ciudadnatal;
    }

    public void setCiudadnatal(Ciudad ciudadnatal) {
        this.ciudadnatal = ciudadnatal;
    }

    public Ciudad getCiudadresidencia() {
        return ciudadresidencia;
    }

    public void setCiudadresidencia(Ciudad ciudadresidencia) {
        this.ciudadresidencia = ciudadresidencia;
    }

    @Override
    public String toString() {
        return "Persona [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", genero=" + genero
                + ", fechaNacimiento=" + fechaNacimiento + ", ciudadnatal=" + ciudadnatal + ", ciudadresidencia="
                + ciudadresidencia + "]";
    }
    
    
}
