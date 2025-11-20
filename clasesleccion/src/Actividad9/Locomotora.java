package Actividad9;

public class Locomotora {
    private String matricula;
    private String potencia;
    private int anyo;
    private Mecanico mecanico;

    // Constructor
    public Locomotora() {

    }

    public Locomotora(String matricula, String potencia, int anyo, Mecanico mecanico) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.anyo = anyo;
        this.mecanico = mecanico;
    }

    // Metodos

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }

    @Override
    public String toString() {
        return "Locomotora{" +
                "matricula='" + matricula + '\'' +
                ", potencia='" + potencia + '\'' +
                ", anyo=" + anyo +
                ", mecanico=" + mecanico +
                '}';
    }
}
