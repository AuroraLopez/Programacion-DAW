package EJERCICIO10;

public class main {
    public static void main(String[] args) {
        ListaGenerica<String> l1 = new ListaGenerica<>();
        ListaGenerica<Integer> l2 = new ListaGenerica<>();

        l1.añadir("Uno");
        l1.añadir("Dos");

        l2.añadir(10);
        l2.añadir(20);

        l1.mostrar();
        l2.mostrar();
    }
}
