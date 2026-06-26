package Personajes;

public class Enemigo {

    private String nombre;
    private int vida;
    private int ataque;

    public Enemigo(String nombre, int vida, int ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
    }

    //Metodos
    public boolean estaVivo() {
//        boolean vivo = vida > 0;
//        return vivo;
        return this.vida > 0;
    }

    public void recibirDaño(int daño) {
        System.out.println("------------------");
        vida = vida - daño;
//        vida -= daño;
        if (vida < 0) {
            vida = 0;
        }
    }

    @Override
    public String toString() {
        String retorno = "Nombre: " + nombre + " Vida: " + vida + "️ Ataque: " + ataque;
        return retorno;

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

}
