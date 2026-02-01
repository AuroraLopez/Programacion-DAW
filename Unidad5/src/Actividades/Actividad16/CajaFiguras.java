package Actividades.Actividad16;

import java.util.ArrayList;

public class CajaFiguras<T extends Figura> {
    ArrayList<T> figuras=new ArrayList<>();

    public void guardar(T figura){
        figuras.add(figura);
    }

    public void mostrarContenido(){
        for (T f : figuras) {
            System.out.println(f);
        }
    }

    public double calcularAreaTotal() {
        double total = 0;

        for (T f : figuras) {
            total += f.calcularArea();
        }

        return total;
    }
}
