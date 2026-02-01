package Actividades.Actividad14;

public class Moto extends Vehiculo{
    public Moto(String matricula){
        super(matricula);
    }
    public int velocidadMaxima(){
        return 100;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Su velocidad máxima es: "+velocidadMaxima());
    }
}