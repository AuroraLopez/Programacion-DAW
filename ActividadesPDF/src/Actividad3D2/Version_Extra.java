package Actividad3D2;

public class Version_Extra {
    private VersionCoche version;
    private Extra extra;
    private double precio;

    // Constructores
    public Version_Extra(){

    }

    public Version_Extra(VersionCoche version, Extra extra, double precio) {
        this.version = version;
        this.extra = extra;
        this.precio = precio;
    }

    // Imprimimos
    @Override
    public String toString() {
        return "Version_Extra [version=" + version + ", extra=" + extra + ", precio=" + precio + "]";
    }
}
