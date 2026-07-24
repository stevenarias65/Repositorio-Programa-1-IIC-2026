/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemploColecciones;

import java.util.HashMap;

/**
 *
 * @author centr
 */
public class EjemploHashmap {
    
    public static void main(String[] args) {
        
        HashMap<String, Integer> precios = new HashMap<>();
        
        precios.put("Manzana", 500);
        precios.put("Pera", 1000);
        precios.put("Sandia", 300);
        
        System.out.println(precios.values());
        
        for (String dato : precios.keySet()) {
            
            System.out.println(dato + " -> Precio: " + precios.get(dato));
            
        }
        
        
       
        
    }
    
}
