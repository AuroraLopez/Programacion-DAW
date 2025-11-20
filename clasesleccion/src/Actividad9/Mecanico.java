package Actividad9;

public class Mecanico {
    private String nombre;
    private String DNI;
    private String telefono;
    Especialidad especialidad;

    // Constructores
    public Mecanico(){

    }
    public Mecanico(String nombre, String DNI, String telefono, Especialidad especialidad) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.telefono = telefono;
        this.especialidad = especialidad;
    }

    // Metodos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Mecanico{" +
                "nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                ", telefono='" + telefono + '\'' +
                ", especialidad=" + especialidad +
                '}';
    }
}
