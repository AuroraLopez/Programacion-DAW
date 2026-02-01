package Actividades.Actividad14;

public class Coche extends Vehiculo{
    public Coche(String matricula){
        super(matricula);
    }
    public int velocidadMaxima(){
        return 120;
    }
    public void acelerar(){
        System.out.println("Estoy acelerando a la velocidad máxima");
    }
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Su velocidad máxima es: "+velocidadMaxima());
    }
}