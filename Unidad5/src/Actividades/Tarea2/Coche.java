package Actividades.Tarea2;

public class Coche extends Vehiculo{
    private int anchura;
    private int altura;
    public Coche(String matricula, String marca, String modelo, int anchura, int altura) {
        super(matricula, marca, modelo);
        this.anchura = anchura;
        this.altura = altura;
    }
    @Override
    public void identificarse() {
        super.identificarse();
        System.out.println("A parte soy un coche con anchura "+anchura +" y altura "+altura);
    }

    
}
