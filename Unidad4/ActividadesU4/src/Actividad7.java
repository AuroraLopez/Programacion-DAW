import Actividad7.Especialidad;
import Actividad7.Locomotora;
import Actividad7.Maquinista;
import Actividad7.Mecanico;
import Actividad7.Tren;
import Actividad7.Vagon;

public class Actividad7 {
    public static void main(String[] args) {
        /*
        * Ejercicio de trenes (diapositiva 18)
        * Hemos recibido el encargo de un cliente para definir las clases necesarias
        * (atributos, constructores y get/set) para gestionar una empresa ferroviaria, en la que se
        * distinguen dos grandes grupos: el personal y la maquinaria.
        * En el primero se ubican todos los empleados de la empresa, que se clasifican en dos grupos:
        * ● Maquinistas: nombre, DNI, sueldo y rango
        * ● Mecánicos: nombre, DNI, teléfono, especialidad. La especialidad será un enum
        * (frenos, hidráulica, electricidad o motor)
        * En cuanto a maquinaria podemos encontrar:
        * ● Vagón: número, carga máxima, carga actual y tipo de mercancía
        * ● Locomotora: matrícula, potencia, año de fabricación, mecánico que la repara
        * ● Tren: formado por una locomotora, varios vagones y el maquinista responsable
        * Crea una aplicación que haga uso de estas clases para indicar la situación de hasta 3 trenes
        * que tengan (3, 4 y 2) vagones respectivamente. En main puedes asignar los valores que
        * quieras a cada objeto. En este caso usarás arrays
        */
        Mecanico mec1 = new Mecanico("Antonio", "2222222B", "950418596", Especialidad.ELECTRIDAD);
        Maquinista maq1 = new Maquinista("Adrián", "111111111Q", "coronel", 1500);
        Locomotora loc1 = new Locomotora("11111aaaa", 2000, "22/02/1983");
        loc1.setMecanico(mec1);
        Vagon[] vagon1 = new Vagon[3];
        // Asignar vagones
        for (int i = 0; i < vagon1.length; i++) {
            vagon1[i] = new Vagon(i, 10 * 150 * i, 1500 + i * 20, "madera");// Completado con lo que haya BD
        }
        Tren tren1 = new Tren();
        tren1.setLocomotora(loc1);
        tren1.setVagones(vagon1);
        tren1.setMaquinista(maq1);

        System.out.println(tren1);
    }
}
