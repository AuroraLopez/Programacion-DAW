package clases;

public class CuentaCorriente {
    String n_cuenta;
    double saldo;
    Persona cliente;

    public CuentaCorriente(){

    }
    public CuentaCorriente(String n_cuenta, double saldo, Persona p) {
        this.n_cuenta = n_cuenta;
        this.saldo = saldo;
        this.cliente = p;
    }

    public String getN_cuenta() {
        return n_cuenta;
    }

    public void setN_cuenta(String n_cuenta) {
        this.n_cuenta = n_cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public void imprimeCuenta(){
        System.out.println("Imprime cuenta");
    }
}
