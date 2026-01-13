package Lecciones.Herencia;

class Empleado extends Persona {
    private String puesto;
    private int salario;

    Empleado(String nombre, int edad, double altura, String puesto, int salario) {
        super(nombre, edad, altura);
        this.puesto = puesto;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + " Salario: " + this.salario;
    }
}