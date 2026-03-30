package net.salesianos.Personaje.Guerrero;

import net.salesianos.Personaje.Personaje;

public class Guerrero extends Personaje {
    private int defensa;

    public Guerrero(String nombre, int vida, int ataque, int defensa) {
        super(nombre, vida, ataque);
        this.defensa = defensa;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public void defender() {
        System.out.println(nombre + " se defiende con " + defensa + " puntos.");
    }

    @Override
    public String toString() {
        return "Guerrero{" +
                "nombre='" + nombre + '\'' +
                ", vida=" + vida +
                ", ataque=" + ataque +
                ", defensa=" + defensa +
                '}';
    }
}
