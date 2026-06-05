
package Ejercicio3;

import java.util.Scanner;


public class Ejercicio3 {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el numero de despegue");
        
        int numero = sc.nextInt();
        
        System.out.println("----Cuenta regresiva con WHILE-----");
        while(numero>0){
            System.out.println(numero);
            numero--;
        }
                
        System.out.println("Digite el numero de explosion");
        
        int cantidad = sc.nextInt();
        
        do {     
            System.out.println(cantidad);
            cantidad--;
            
        } while (cantidad > 0);
        
        
        
        
        
        
    }
}
