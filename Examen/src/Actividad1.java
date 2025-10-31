import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) throws Exception {
        /*
         * Realiza un programa que calcule el precio de unas entradas de cine en función
         * del
         * número de personas y del día de la semana. El precio base de una entrada son
         * 8€. El miércoles (día
         * del espectador), el precio base es de 5€. Los jueves son el día de la pareja,
         * por lo que la entrada para
         * dos cuesta 11 €. Con la tarjeta CineCampa se obtiene un 10% de descuento
         * adicional.
         * El programa pedirá el día, la cantidad de personas y si tiene la tarjeta
         * CineCampa
         */

        // Lee y pide las variables
        Scanner teclado = new Scanner(System.in);
        double cuenta = 0; int parejas; int preciobase = 8;
        int preciomiercoles = 5; int preciojueves = 11;  double descuento;
        System.out.println("Cuantás personas son? ");
        int personas = teclado.nextInt();
        System.out.println("¿Qúe día de la semana es? ");
        int dia = teclado.nextInt();
        System.out.println("¿Tiene tarjeta CineCampa? 1=si/2=no");
        int tarjeta = teclado.nextInt();

        // Condiciones para cada dia
        if (dia != 3 && dia != 4) {
            cuenta = preciobase * personas;
            System.out.println("Entradas individuales: " + personas);
            System.out.println("Precio por entrada individual: " + preciobase);
            System.out.println("Total: " + cuenta);
            if (tarjeta == 1) {
                descuento = cuenta * 0.10;
                cuenta -= descuento;
            } else {
                descuento = 0;
            }
            System.out.println("Descuento: " + descuento);
            System.out.println("A pagar: " + cuenta);

        } else if (dia == 3) {
            cuenta = preciomiercoles * personas;
            System.out.println("Entradas individuales: " + personas);
            System.out.println("Entradas individuales: " + personas);
            System.out.println("Precio por entrada individual: " + preciobase);
            System.out.println("Total: " + cuenta);
            if (tarjeta == 1) {
                descuento = cuenta * 0.10;
                cuenta -= descuento;
            } else {
                descuento = 0;
            }
            System.out.println("Descuento: " + descuento);
            System.out.println("A pagar: " + cuenta);
        } else if (dia == 4) {
                parejas = personas / 2;
                cuenta = parejas * preciojueves;
                System.out.println("Entradas grupales: " + parejas);
                System.out.println("Precio por entrada individual: " + preciojueves);
                System.out.println("Total: " + cuenta);
                if (tarjeta == 1) {
                    descuento = cuenta * 0.10;
                    cuenta -= descuento;
                } else {
                    descuento = 0;
                }
                System.out.println("Descuento: " + descuento);
                System.out.println("A pagar: " + cuenta);
            }
        }
    }
