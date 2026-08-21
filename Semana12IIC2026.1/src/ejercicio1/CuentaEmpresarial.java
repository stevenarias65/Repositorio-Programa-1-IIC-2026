/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

public class CuentaEmpresarial extends Cuenta {

    public CuentaEmpresarial(String titular, double saldo) {
        super(titular, saldo, TipoCuenta.EMPRESARIAL);
    }

    @Override
    public void enviarNotificacion(String mensaje) {

        System.out.println("Estas en la cuenta de empresarial " + titular + " " + mensaje);
    }

    @Override
    public void aplicarInteres() {
        double intereses = saldo * tipo.getTasaInteres();
        saldo = saldo + intereses;
        enviarNotificacion("se aplico el interes " + saldo);
    }

}
