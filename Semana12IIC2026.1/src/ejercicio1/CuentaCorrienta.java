/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import javax.swing.JOptionPane;

public class CuentaCorrienta extends Cuenta {

    public CuentaCorrienta(String titular, double saldo) {
        super(titular, saldo, TipoCuenta.CORRIENTA);
    }

    @Override
    public void enviarNotificacion(String mensaje) {
        JOptionPane.showMessageDialog(null, "Estas en la cuneta corriente");

    }

    @Override
    public void aplicarInteres() {
        System.out.println("No se aplica interes");
    }

}
