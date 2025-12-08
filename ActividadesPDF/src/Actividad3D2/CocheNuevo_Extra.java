package Actividad3D2;

public class CocheNuevo_Extra {
    private Extra extra;
    private CocheNuevo cocheNuevo;

    // Constructores
    public CocheNuevo_Extra(){

    }

    public CocheNuevo_Extra(Extra extra, CocheNuevo cocheNuevo) {
        this.extra = extra;
        this.cocheNuevo = cocheNuevo;
    }

    // Imprimimos
    @Override
    public String toString() {
        return "CocheNuevo_Extra [extra=" + extra + ", cocheNuevo=" + cocheNuevo + "]";
    }
}
