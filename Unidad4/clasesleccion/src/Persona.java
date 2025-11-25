public class Persona {
    String nombre; // Atributos por defecto public
    byte edad;
    double estatura;

    public Persona() { // Constructor
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setEdad(byte edad){
        this.edad=edad;
    }
    public byte getEdad(){
        return this.edad;
    }
    public void setEstatura(double estatura){
        this.estatura=estatura;
    }
    public double getEstatura(){
        return this.estatura;
    }

    public void saludar() { // Método
        System.out.println("Hola a todos, soy " + nombre);
        System.out.println("Tengo "+edad);
    }
     public void imprimeDatos(){
        System.out.println("Te llamas "+nombre+", tienes "+edad);
    }
    public static void main(String[] args) {
        Persona p = new Persona();
        p.setNombre("Aurora");
        p.setEdad((byte) 22);
        p.setEstatura(1.64);
        p.saludar();

        System.out.println(p.getNombre());
        System.out.println(p.getEdad());
        System.out.println(p.getEstatura());
    }
}
