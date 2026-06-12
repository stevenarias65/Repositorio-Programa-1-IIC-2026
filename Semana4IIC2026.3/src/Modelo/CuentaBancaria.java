
package Modelo;


public class CuentaBancaria {
    //Atributos
    public String cliente; 
    public double saldo;
    public String IBAN;
    
    //Constructor
    public CuentaBancaria(String IBAN,String cliente,double saldo){
        this.cliente  = cliente; 
        this.IBAN = IBAN;
        this.saldo = saldo;
    }
    
    
}
