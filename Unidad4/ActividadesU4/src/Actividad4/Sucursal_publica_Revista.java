package Actividad4;

public class Sucursal_publica_Revista {
    private Sucursal sucursal;
    private Revista revista;

    // Constructores
    public Sucursal_publica_Revista(){

    }

    public Sucursal_publica_Revista(Sucursal sucursal, Revista revista) {
        this.sucursal = sucursal;
        this.revista = revista;
    }

    // Imprimir
    @Override
    public String toString() {
        return "Sucursal_publica_Revista [sucursal=" + sucursal + ", revista=" + revista + "]";
    }
}
