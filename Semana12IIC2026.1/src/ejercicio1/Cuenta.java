/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author centr
 */
public abstract class Cuenta implements Notificaciones{
    
    protected String titular;
    protected double saldo;
    protected TipoCuenta tipo;

    //constructor
    public Cuenta(String titular, double saldo, TipoCuenta tipo) {
        this.titular = titular;
        this.saldo = saldo;
        this.tipo = tipo;
    }

    public abstract void aplicarInteres();
    
    
    public TipoCuenta getTipo() {
        return tipo;
    }

    public void setTipo(TipoCuenta tipo) {
        this.tipo = tipo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
    
}
