
package Paquete1;

import java.util.Scanner;

public class Ejercicio1 {
    
    //Que es el Main
    //main es un metodo
    public static void main(String[] agrs){
        
        //int
        //double
        //String
        //boolean
        //char
        //long
        //variable que almacena numeros
        //Datos primitivos
        int numero = 12;
        double peso = 180.2;
        boolean estado = true;
        char letra = 'h';
        long numeroLargo = 144435435345345432L;
        
        String nombre = "ronald";
        
        System.out.println(numero);
        int a = 3;
        int b = 2;
        int c = 1;
        
        a += b; // a = a + b 3 + 2
        c = ++c;

        
        if (numero > 18 ){
            System.out.println("la persona es mayor");
        }
        
        
        //Condicional de solo una opcion verdadera
        double nota = 90;
        
        if (nota >= 70){
           System.out.println("La persona aprobo");
        }
        
        //condicional donde validamos 2 opciones verdadera y falsa
        if (nota >= 70){
           System.out.println("La persona aprobo");
        }else{
            System.out.println("La persona reprobo");
        }
        
        nota = 55;
        //condicional donde validamos 3 o mas opciones
        if (nota > 90){
            System.out.println("Nota Excelente");
        }else if (nota > 70){
            System.out.println("aprobo bien");
        }else if (nota > 60){
            System.out.println("reprobo pero puede hacer ampliacion");
        }else{
            System.out.println("reprobo");
        }
        
        //necesito que la perosna elija una opcion 
        System.out.println("1.Ingresa");
        System.out.println("2. Modifica");
        System.out.println("3. Imprime");       
        System.out.println("4. Salir");
        String opcion;
        //Objeto
        Scanner teclado = new Scanner(System.in);
        opcion = teclado.nextLine();
        switch (opcion){
            case "1":
                System.out.println("El usuario esta ingresando");
                break;
            case "2":
                System.out.println("El usuario esta modificando");
                break;
            case "3":
                System.out.println("El usuario esta imprimiendo");
                break;
            case "4":
                System.out.println("El usuario esta saliendo");
                break;
            default:
                System.out.println("Error dato incorrecto");
        }
        
    }
    
}
