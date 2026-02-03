package EJERCICIO11;

import java.util.ArrayList;

public class ListaGenericaDatos <T>{
        private ArrayList<T> lista = new ArrayList<>();

        public void añadir(T obj) {
            lista.add(obj);
        }

        public void mostrar() {
            for (T o : lista) {
                System.out.println(o);
            }
        }
}
