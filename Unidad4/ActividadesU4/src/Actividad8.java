import Actividad8.Autor;
import Actividad8.Biblioteca;
import Actividad8.Libro;

public class Actividad8 {
    public static void main(String[] args) throws Exception {
        /*
        * Ejercicio Biblioteca (Diapositiva 18)
        * Crea las clases en JAVA para hacer un sistema de préstamos
        * de una biblioteca. En este caso usarás ArrayList.
        * ● Las clases son:
        * ➔ Biblioteca: Tiene de atributo el nombre y la lista de libros y tiene los
        * métodos de agregarLibro, buscarLibro y eliminar libro
        * ➔ Usuario: Tiene de atributos nombre, código y la lista de libros
        * prestados y tiene los métodos de prestarLibro y devolverLibro
        * ➔ Libro: Tiene de atributos nombre, autor, categoría y total para
        * prestar y tiene los método de modificaExistencias(num) con num ±1
        * ➔ Autor: Tiene el nombre y una lista de premios y nuevoLibro
        * ● Haz la clase con main que haga una prueba de funcionamiento de esta
        * biblioteca. Por ejemplo, que se intente prestar el mismo libro.
        * ● Añade la función de buscar los libros de un autor o por categoría 
        */
        Biblioteca bib = new Biblioteca("IES Cura Valera");
        Libro l1 = new Libro("Viaje al centro de la Tierra", "Aventuras", 2);
        Libro l2 = new Libro("La isala del tesoro", "Aventuras", 5);
        Autor autor = new Autor("FJ Marber");
        l1.setAutor(autor);
        bib.agregarLibro(l1);
        // bib.agregarLibro(l2);
        Libro salida = bib.buscarLibro(l2);

        if (salida != null)
            System.out.println(salida);
        else {
            System.out.println("No está ese libro");
        }
    }
}
