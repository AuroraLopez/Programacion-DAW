public class vehiculo {
    // Datos miembros de la clase
    boolean useFlag;
    String model;
    int numTires;

    // Constructor siempre tiene que haber uno
    public vehiculo(boolean useF, String modelo, int numT){
        useFlag=useF;
        model=modelo;
        numTires=numT;
    }

    // Metodos de clase
    public void start(){
        System.out.println("Comienza a moverse");
    }
    public void turnleft(){
        System.out.println("Moverse a la izquierda");
    }
    public void turnright(){
        System.out.println("Moverse a la derecha");
    }
    public void stop(){
        System.out.println("Pararse");
    }
    public void forward(int speed){
        System.out.println("Moverse adelante "+speed);
    }

    public static void imprimirDatos(){
        System.out.println("Estas en un concesionario de coches");
    }
    public static void main(String[] args) {
        System.out.println("CREACION CLASE VEHICULO Y OBJETOS");
        // Objetos
        vehiculo moto = new vehiculo(false, "Honda", 2); 
        vehiculo coche = new vehiculo(true, "Toyota", 4);

        // Usando los objetos
        moto.start();
        moto.turnleft();
        moto.forward(100);

        vehiculo.imprimirDatos();
    }
}
