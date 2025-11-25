public class Actividad14 {
    // Ponemos a PI como variable global ya que tiene un valor fijo y no vamos a elegirlo
    final static double PI=3.1415;
    // Primera función para calcular el area de un cilindro
    public static double areacilindro(double radio, double altura){
        double area=2*PI*(altura+radio);
        return area;
    }
    // Segunda función para calcular el volumen de un cilindro
    public static double volumencilindro(double radio, double altura){
        double volumen=PI*Math.pow(radio, 2)*altura;
        return volumen;
    }
    public static void main(String[] args) {
        // Diapositiva 24 Primera actividad
        /*
         * Crea un procedimiento para calcular el área y volumen
         * de un cilindro (2*PI*(altura+radio), PI*radio2*altura)
         */
        // Imprimimos resultados
        System.out.println("El área del cilindro es: "+areacilindro(4.2, 5.6));
        System.out.println("El volumen del cilindro es: "+volumencilindro(5,3.5 ));
    }
}
