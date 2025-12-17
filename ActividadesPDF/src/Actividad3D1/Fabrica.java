package Actividad3D1;

public class Fabrica {
    private long CUIT;
    private String nombre;
    private String pais;
    private String gerente;
    private int cantEmp;

    // Constructores
    public Fabrica(){

    }

    public Fabrica(long cUIT, String nombre, String pais, String gerente, int cantEmp) {
        CUIT = cUIT;
        this.nombre = nombre;
        this.pais = pais;
        this.gerente = gerente;
        this.cantEmp = cantEmp;
    }

    // Imprimimos
    @Override
    public String toString() {
        return "Fabrica [CUIT=" + CUIT + ", nombre=" + nombre + ", pais=" + pais + ", gerente=" + gerente + ", cantEmp="
                + cantEmp + "]";
    }
    
    
}
