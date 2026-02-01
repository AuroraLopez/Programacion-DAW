package Actividades.Actividad16;

public class Main {
    public static void main(String[] args) {
        Circulo c1 = new Circulo("Circulo rojo", 5);
        Circulo c2 = new Circulo("Circulo azul", 3);
        Rectangulo r1 = new Rectangulo("Rectangulo rojo", 2, 3);
        Rectangulo r2 = new Rectangulo("Rectangulo azul", 3, 2);

        CajaFiguras<Circulo> circulos = new CajaFiguras<>();
        circulos.guardar(c1);
        circulos.guardar(c2);

        CajaFiguras<Rectangulo> rectangulos = new CajaFiguras<>();
        rectangulos.guardar(r1);
        rectangulos.guardar(r2);

        CajaFiguras<Figura> figuras = new CajaFiguras<>();
        figuras.guardar(c1);
        figuras.guardar(r1);

        System.out.println("Círculos");
        circulos.mostrarContenido();
        System.out.println("El area total es: "+circulos.calcularAreaTotal());
        System.out.println("-------------------------");

        System.out.println("Rectángulos");
        rectangulos.mostrarContenido();
        System.out.println("El area total es: "+rectangulos.calcularAreaTotal());
        System.out.println("-------------------------");

        System.out.println("Figuras");
        figuras.mostrarContenido();
        System.out.println("El area total es: "+figuras.calcularAreaTotal());
        System.out.println("-------------------------");
    }
}
