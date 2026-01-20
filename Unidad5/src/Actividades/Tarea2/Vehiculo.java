package Actividades.Tarea2;

public class Vehiculo implements Identificacion{
    private String matricula;
    private String marca;
    private String modelo;

    public Vehiculo(){

    }

    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void identificarse() {
        System.out.println("Soy un vehículo con matricula "+matricula+", marca "+marca+ " y modelo "+modelo);
        
    }

    
}
