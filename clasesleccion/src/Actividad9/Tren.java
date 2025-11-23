package Actividad9;

import java.util.Arrays;

public class Tren {
    private Locomotora locomotora;
    private Vagon vagon [];
    private Maquinista maquinista;

    // Constructor
    public Tren(){
        this.vagon = new Vagon[0];
    }
    public Tren(Locomotora locomotora, Vagon[] vagon, Maquinista maquinista) {
        this.locomotora = locomotora;
        this.vagon = vagon;
        this.maquinista = maquinista;
    }

    // Metodos

    public Locomotora getLocomotora() {
        return locomotora;
    }

    public void setLocomotora(Locomotora locomotora) {
        this.locomotora = locomotora;
    }


    public Maquinista getMaquinista() {
        return maquinista;
    }

    public void setMaquinista(Maquinista maquinista) {
        this.maquinista = maquinista;
    }

    @Override
    public String toString() {
        return "Tren{" +
                "locomotora=" + locomotora +
                ", vagon=" + Arrays.toString(vagon) +
                ", maquinista=" + maquinista +
                '}';
    }
}
