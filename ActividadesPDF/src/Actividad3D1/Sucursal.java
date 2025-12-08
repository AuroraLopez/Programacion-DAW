package Actividad3D1;

public class Sucursal {
    private int numero;
    private String domicilio;
    private String ciudad;

    // Constructores
    public Sucursal(){

    }

    public Sucursal(int numero, String domicilio, String ciudad) {
        this.numero = numero;
        this.domicilio = domicilio;
        this.ciudad = ciudad;
    }

    // Imprimimos
    @Override
    public String toString() {
        return "Sucursal [numero=" + numero + ", domicilio=" + domicilio + ", ciudad=" + ciudad + "]";
    }
}
