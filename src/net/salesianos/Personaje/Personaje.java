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

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void atacar() {
        System.out.println(nombre + " ataca con " + ataque + " puntos de daño.");
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", vida=" + vida +
                ", ataque=" + ataque +
                '}';
    }
}
