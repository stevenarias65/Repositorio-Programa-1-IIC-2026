package Personajes;

public class Heroes {

    //Variables
    private String nombre;
    private int vida;
    private int ataque;

    //constructores scope
    public Heroes(String nombre, int vida, int ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
    }

    public Heroes(String nombre) {
        this.nombre = nombre;
        this.vida = 100;
        this.ataque = 32;
    }

    public Heroes() {
        this.nombre = "heroe Generico";
        this.vida = 100;
        this.ataque = 10;
    }

    //metodos
    //nivel de encapsulamiento - tipos de metodo - nombre de metodo
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

    public void curar(int cantidad) {
        System.out.println("+++++++++++++++++++");
        vida += cantidad;
        if (vida > 100) {
            vida = 100;
        }
        System.out.println(nombre + " se cura la vida y queda en: " + vida);

    }

    @Override
    public String toString() {
        String retorno = "Nombre: " + nombre + " Vida: " + vida + "️ Ataque: " + ataque;
        return retorno;

    }

    //Getters
    public String getNombre() {
        return this.nombre;
    }

    public int getVida() {
        return this.vida;
    }

    public int getAtaque() {
        return this.ataque;
    }

}
