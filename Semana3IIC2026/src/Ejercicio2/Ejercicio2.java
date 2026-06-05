package Ejercicio2;

import java.util.Scanner;


public class Ejercicio2 {
    
    //metodos main
    public static void main(String[] agrs){
        
        //Ciclo mientras o while
        int contador = 6;
//        while (contador <= 5){
//            System.out.println(contador);
//            contador += 1;
//        }
        
        
        do{
            System.out.println(contador);
            contador += 1;
        }while(contador <=5);
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor digite el tiempo de despegue");
        int numero = entrada.nextInt();
        
        
        
        
    }
    
}
