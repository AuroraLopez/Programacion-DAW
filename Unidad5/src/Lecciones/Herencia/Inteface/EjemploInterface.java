package Lecciones.Herencia.Inteface;

public class EjemploInterface implements Sonido{

    @Override
    public int contarpatas() {
        System.out.println("Tiene cuatro patas");
        return 0;
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guau Guau");        
    }
    
}
