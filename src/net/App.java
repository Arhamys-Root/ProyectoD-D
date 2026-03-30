package net;

import net.salesianos.Personaje.Guerrero.Guerrero;
import net.salesianos.Personaje.Mago.Mago;

public class App {
    public static void main(String[] args) {

        Guerrero guerrero = new Guerrero("Arthas", 120, 25, 15);
        Mago mago = new Mago("Merlín", 80, 30, 100);

        System.out.println(guerrero);
        guerrero.atacar();
        guerrero.defender();

        System.out.println();

        System.out.println(mago);
        mago.atacar();
        mago.lanzarHechizo();
    }
}
