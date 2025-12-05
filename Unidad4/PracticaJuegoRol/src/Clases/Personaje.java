package Clases;

public class Personaje {
    private String nombre;
    private int vida;
    private int tipo_ataque;
    private int defensa;
    private Tipo tipo;

    // Constructores
    public Personaje(String nombre, int vida, int tipo_ataque, int defensa, Tipo tipo) {
        this.nombre = nombre;
        this.vida = vida;
        this.tipo_ataque = tipo_ataque;
        this.defensa = defensa;
        this.tipo = tipo;
    }
  
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public void atacar(Personaje personaje) {
        int dano = personaje.tipo_ataque-personaje.defensa;
        if (personaje.vida>0){
            personaje.recibirDano(dano);
        }
        if (dano < 0) dano = 0;
    }

    public void recibirDano(int dano){
        vida -= dano;
    }

    public boolean estavivo(){
        if (vida<0) return false;
        else return true;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", vida=" + vida +
                ", tipo_ataque=" + tipo_ataque +
                ", defensa=" + defensa +
                ", tipo=" + tipo + 
                '}';
    }
}
