package Actividades.Tarea2;

public class Moto extends Vehiculo{
    private boolean limitador;

    public Moto(String matricula, String marca, String modelo, boolean limitador) {
        super(matricula, marca, modelo);
        this.limitador = limitador;
    }

    public boolean isLimitador() {
        return limitador;
    }

    public void setLimitador(boolean limitador) {
        this.limitador = limitador;
    }

    @Override
    public void identificarse() {
        super.identificarse();
        if (limitador=true) {
            System.out.println("A parte soy una moto y tengo limitador");
        }
        else{
            System.out.println("A parte soy una moto y no tengo limitador");
        }
    }

    
}
