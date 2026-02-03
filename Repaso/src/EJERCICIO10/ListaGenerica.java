package EJERCICIO10;

import java.util.ArrayList;

public class ListaGenerica<T> {
        private ArrayList<T> lista = new ArrayList<>();

        public void añadir(T elemento) {
            lista.add(elemento);
        }

        public void mostrar() {
            for (T e : lista) {
                System.out.println(e);
            }
        }
}
