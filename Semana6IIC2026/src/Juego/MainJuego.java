package Juego;

import Personajes.Enemigo;
import Personajes.Heroes;
import java.util.Scanner;

public class MainJuego {

    public static void main(String[] args) {
        int opcion;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el nombre del heroe: ");
        String nombre = entrada.nextLine();
        Heroes heroe1 = new Heroes(nombre, 100, 30);

        do {

            System.out.println("-------------------------");
            System.out.println("     BATALLA CAMPAL      ");
            System.out.println("-------------------------");
            System.out.println("1. Ver estado del heroe");
            System.out.println("2. Pelear Vrs Radiance");
            System.out.println("3. Pelear Vrs Ganondorf");
            System.out.println("4. Pelear Vrs Sauron");
            System.out.println("0. Salir");
            System.out.println("Digite una opcion: ");
            opcion = entrada.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println(heroe1.toString());
                    break;
                case 2: 
                    Enemigo radiance = new Enemigo("Radiance", 60, 6);
                    combatir(heroe1,radiance );
                    break;
                case 3: 
                    Enemigo ganondorf = new Enemigo("Ganondorf", 70, 15);
                    combatir(heroe1,ganondorf );
                    break;
                case 4:
                    Enemigo sauron = new Enemigo("Sauron", 100, 40);
                    combatir(heroe1,sauron );
                    break;
                case 0:
                    System.out.println("Hasta la proxima campeon");
                    break;
                default:
                    System.out.println("Opcion incorrecta intente de nuevo");;
            }

        } while (opcion != 0);

    }
   
    public static void combatir(Heroes h, Enemigo e){
        System.out.println("---BATALLA----");
        System.out.println(h.getNombre() + " vrs " +e.getNombre() );
        int turno = 1;
        while (h.estaVivo() && e.estaVivo()) {            
            
            //Heroe ataca primero
            e.recibirDaño(h.getAtaque());
            System.out.println("Turno: "+turno+" -Ataca: HP enemigo: " + e.getVida());
            
            if (!e.estaVivo()) {
                break;
            }
            
            //Turno del enemigo
            h.recibirDaño(e.getAtaque());
            System.out.println("Turno: "+turno+" -contraataca: HP Heroe: " + h.getVida());
             if (!h.estaVivo()) {
                break;
            }
            turno++;
            
        }
        if (h.estaVivo()) {
            System.out.println("Ganaste!!!!!!!!!");
        }else{
            System.out.println("Perdiste!!!!!!!!");
        }
        
        
        
        
    }
    

}
