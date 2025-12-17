package Actividad2;

public class Racional {

    private int numerador;
    private int denominador;
        /*
         * 2. Construir una clase Racional que permita representar y manipular números racionales. Un
         * número racional permite representar la relación a/b entre dos números enteros siendo a el
         * numerador y b el denominador (distinto de cero). Se deben implementar los siguientes métodos para
         * la clase Racional:  asignaNumerador(int x), asignaDenominador(int y), imprimirRacional(),
         * las operaciones de suma, resta, producto y división y esIgual(Racional b). En main haz uso de ellas.
         */
        public Racional (int numerador, int denominador){
            this.numerador=asignaNumerador(numerador);
            this.denominador=asignaDenominador(denominador);
        }

        public int asignaNumerador(int x){
            int numerador=x;
            return numerador;
        }
        public int asignaDenominador(int y){
            if (y!=0) {
                denominador=y;
                return denominador;
            }
            else{
                throw new IllegalArgumentException("El denominador no puede ser 0");
            }
        }
        public void imprimirRacional(){
            System.out.println(numerador+" / "+denominador);
        }

        public boolean esIgual(Racional b){
            if (this.numerador==b.numerador && this.denominador==b.denominador) {
                return true;
            }
            else{
                return false;
            }
        } 
        
        public void sumaRacionales(Racional r2){
            int numeradornuevo;
            int denominadornuevo;
            numeradornuevo= (this.numerador*r2.denominador)+(this.denominador*r2.numerador);
            denominadornuevo=this.denominador * r2.denominador;
            Racional resultado= new Racional(numeradornuevo, denominadornuevo);
            resultado.imprimirRacional();
        }

        public void restaRacional(Racional r2){
            int numeradornuevo;
            int denominadornuevo;
            numeradornuevo= (this.numerador*r2.denominador)-(this.denominador*r2.numerador);
            denominadornuevo=this.denominador * r2.denominador;
            Racional resultado= new Racional(numeradornuevo, denominadornuevo);
            resultado.imprimirRacional();
        }

        public void multiplicacionRacional(Racional r2){
            int numeradornuevo;
            int denominadornuevo;
            numeradornuevo= this.numerador*r2.numerador;
            denominadornuevo=this.denominador * r2.denominador;
            Racional resultado= new Racional(numeradornuevo, denominadornuevo);
            resultado.imprimirRacional();
        }

        public void divisionRacional(Racional r2){
            int numeradornuevo;
            int denominadornuevo;
            numeradornuevo= this.numerador*r2.denominador;
            denominadornuevo=this.denominador * r2.numerador;
            Racional resultado= new Racional(numeradornuevo, denominadornuevo);
            resultado.imprimirRacional();
        }
}
