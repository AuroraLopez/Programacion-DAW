package Actividades.Actividad14;

public abstract class Vehiculo {
    protected String matricula;

    public Vehiculo(){}
    public Vehiculo(String matricula){
        this.matricula=matricula;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula){
        this.matricula=matricula;
    }

    public void mostrarInfo(){
        System.out.println("Matrícula: "+matricula);
    }
    public abstract int velocidadMaxima();
}