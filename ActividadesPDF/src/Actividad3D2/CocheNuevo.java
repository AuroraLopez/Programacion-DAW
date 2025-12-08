package Actividad3D2;

public class CocheNuevo {
    private int id;
    private String matricula;
    private VersionCoche version;

    // Constructores
    public CocheNuevo(){

    }

    public CocheNuevo(int id, String matricula, VersionCoche version) {
        this.id = id;
        this.matricula = matricula;
        this.version = version;
    }

    // Imprimimos
    @Override
    public String toString() {
        return "CocheNuevo [id=" + id + ", matricula=" + matricula + ", version=" + version + "]";
    }
}
