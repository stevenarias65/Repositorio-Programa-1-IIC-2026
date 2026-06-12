
package Vista;

import Modelo.CuentaBancaria;

public class inicio {
    
    public static void main(String[] args) {
        
        CuentaBancaria c1 = new CuentaBancaria("CR11111111","Ronald",1000);
        CuentaBancaria c2 = new CuentaBancaria("CR22222222","Steven",2000);
        
        System.out.println(c1.cliente);
        System.out.println("El saldo de cliente 2 es "+ c2.saldo);
        
        
    }
}
