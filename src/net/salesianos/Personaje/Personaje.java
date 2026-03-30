package net.salesianos.Personaje;

public class Personaje {
     protected String nombre;
    protected int vida;
    protected int ataque;
    public Personaje() {
    }

    public Personaje(String nombre, int vida, int ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
    }
}
