package Actividades.Actividad13;

public class EjemploProducto {
    public static void main(String[] args) {
        ProductoFisico pf1=new ProductoFisico(1, "Pendrive", 9.40, 0.2, 5);
        ProductoFisico pf2=new ProductoFisico(2, "Ordenador", 100.5, 2.5, 50);
        ProductoDigital pd1=new ProductoDigital(3, "Ebook", 45.99, "iescuravalera", 300);
        System.out.println(pf1.toString());
        System.out.println(pf2.toString());
        System.out.println(pd1.toString());
    }
}
