import java.util.ArrayList;

public class Agenda2 {
    public static void main(String[] args) {
        ArrayList<Persona> lista=new ArrayList<>();
        lista.add(new Persona("Domingo","avenida","123456789"));
        lista.add(new Persona("Aurora","estacion","987654321"));
        lista.add(new Persona("Cristopher","granada","456789123"));
        lista.add(new Persona("Maria","lorca","789123456"));
        lista.add(new Persona("nicolas","avenida","098765432"));

        // Mostrar las personas
        for(int i=0;i<lista.size();i++){
            lista.get(i).imprimePersona();
        }

        // Ordenar la lista de personas
        lista.sort((p1, p2) -> p1.getNombre().compareTo(p2.getNombre()));

        // Mostrar ordenado
        for(int i=0;i<lista.size();i++){
            lista.get(i).imprimePersona();
        }

    }
}
