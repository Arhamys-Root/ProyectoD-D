package net.salesianos.Personaje.Mago;

import net.salesianos.Personaje.Personaje;

public class Mago extends Personaje {
    private int mana;

    public Mago(String nombre, int vida, int ataque, int mana) {
        super(nombre, vida, ataque);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void lanzarHechizo() {
        System.out.println(nombre + " lanza un hechizo usando " + mana + " puntos de maná.");
    }

    @Override
    public String toString() {
        return "Mago{" +
                "nombre='" + nombre + '\'' +
                ", vida=" + vida +
                ", ataque=" + ataque +
                ", mana=" + mana +
                '}';
    }
}
