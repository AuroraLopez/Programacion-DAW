package Actividad4;

public class Periodista_escribe_Revista{
    private Revista revista;
    private Periodista periodista;

    // Constructores
    public Periodista_escribe_Revista(){

    }
    public Periodista_escribe_Revista(Revista revista, Periodista periodista) {
        this.revista = revista;
        this.periodista = periodista;
    }

    // Imprimimos
    @Override
    public String toString() {
        return "Periodista_escribe_Revista [revista=" + revista + ", periodista=" + periodista + "]";
    }
}