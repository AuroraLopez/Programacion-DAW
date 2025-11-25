public class Agenda {
    public static void main(String[] args) throws Exception {
        // Necesito tener un vector de personas
        Persona[] lista=new Persona[5];

        lista[0]=new Persona("Domingo","avenida","123456789");
        lista[1]=new Persona("Aurora","estacion","987654321");
        lista[2]=new Persona("Cristopher","grqanada","456789123");
        lista[3]=new Persona("Maria","lorca","789123456");
        lista[4]=new Persona("nicolas","avenida","098765432");
        // for(int i=0;i<lista.length;i++){
        //     lista[i]=new Persona("Domingo","avenida", "636636636");
        // }

        // Imprimir las personas
        for(int i=0;i<lista.length;i++){
            lista[i].imprimePersona();
        }
    }
}
