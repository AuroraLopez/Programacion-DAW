package Actividades.Actividad14;

public class Camion extends Vehiculo{
    public Camion(String matricula){
        super(matricula);
    }
    public int velocidadMaxima(){
        return 80;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Su velocidad máxima es: "+velocidadMaxima());
    }
}
