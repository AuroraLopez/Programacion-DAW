package Actividad3D1;

public class Sucursal_Empleado {
    private Sucursal sucursal;
    private Empleado empleado;
    private String horario;
    private int dia;

    // Constructores
    public Sucursal_Empleado(){

    }

    public Sucursal_Empleado(Sucursal sucursal, Empleado empleado, String horario, int dia) {
        this.sucursal = sucursal;
        this.empleado = empleado;
        this.horario = horario;
        this.dia = dia;
    }

    // Imprimimos
    @Override
    public String toString() {
        return "Sucursal_Empleado [sucursal=" + sucursal + ", empleado=" + empleado + ", horario=" + horario + ", dia="
                + dia + "]";
    }
}
