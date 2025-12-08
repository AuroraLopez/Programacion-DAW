package Actividad3;

public class ProveedorSuministraPieza {
    private Proveedor codigo_proveedor;
    private Pieza codigo_pieza;
    private String Fecha_Hora;
    private int cantidad;

    // Constructor
    public ProveedorSuministraPieza(){

    }
    public ProveedorSuministraPieza(Pieza pieza, Proveedor prove, String Fecha_Hora, int cantidad){
        this.codigo_pieza=pieza;
        this.codigo_proveedor=prove;
        this.cantidad=cantidad;
        this.Fecha_Hora=Fecha_Hora;
    }

    // Metodos
    public Proveedor getCodigo_proveedor() {
        return codigo_proveedor;
    }
    public void setCodigo_proveedor(Proveedor codigo_proveedor) {
        this.codigo_proveedor = codigo_proveedor;
    }
    public Pieza getCodigo_pieza() {
        return codigo_pieza;
    }
    public void setCodigo_pieza(Pieza codigo_pieza) {
        this.codigo_pieza = codigo_pieza;
    }
    public String getFecha_Hora() {
        return Fecha_Hora;
    }
    public void setFecha_Hora(String fecha_Hora) {
        Fecha_Hora = fecha_Hora;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Imprimimos este objeto

    public void imprimeProveedorSuministraPieza(){
        if (codigo_pieza!=null && codigo_proveedor!=null) {
            System.out.println("codigo_proveedor=" + codigo_proveedor + ", codigo_pieza=" + codigo_pieza
                + ", Fecha_Hora=" + Fecha_Hora + ", cantidad=" + cantidad + "]");
        }
        else{
            System.out.println(", Fecha_Hora=" + Fecha_Hora + ", cantidad=" + cantidad + "]");
        }
    }
}
