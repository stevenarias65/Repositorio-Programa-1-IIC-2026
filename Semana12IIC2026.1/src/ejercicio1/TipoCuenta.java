/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author centr
 */
public enum TipoCuenta {
    
    AHORROS(0.03),
    CORRIENTA(0.0),
    EMPRESARIAL(0.15);
    
    private final double tasaInteres;

    TipoCuenta(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }
    
    public double getTasaInteres(){
        return tasaInteres;
    }
    
    
    
    
}
