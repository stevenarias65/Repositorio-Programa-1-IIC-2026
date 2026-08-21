/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;


public class CuentaAhorros extends Cuenta {
    
    public CuentaAhorros(String titular, double saldo) {
        super(titular, saldo, TipoCuenta.AHORROS);
    }

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Estas en la cuenta de ahorros " + titular +" "+mensaje);
    }

    @Override
    public void aplicarInteres() {
        double intereses  = saldo * tipo.getTasaInteres();
        saldo = saldo + intereses;
        enviarNotificacion("se aplico el interes " + saldo);
        
    }
    
    
    
    
    
}
