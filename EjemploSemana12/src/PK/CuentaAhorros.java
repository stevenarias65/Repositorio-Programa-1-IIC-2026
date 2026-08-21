package ucc.banco.notificaciones;

/**
 * Cuenta de ahorros: aplica interés según la tasa definida
 * en TipoCuenta.AHORROS y usa la notificación por defecto
 * heredada de Cuenta (no la sobrescribe).
 *
 * @author Universidad Castro Carazo
 */
public class CuentaAhorros extends Cuenta {

    public CuentaAhorros(String titular, double saldo) {
        // Siempre se crea con tipo AHORROS: no tendría sentido otro valor
        super(titular, saldo, TipoCuenta.AHORROS);
    }

    /**
     * Aplica el interés correspondiente a una cuenta de ahorros
     * usando la tasa almacenada en el enum.
     */
    @Override
    public void aplicarInteres() {
        double interes = saldo * tipo.getTasaInteres();
        saldo += interes;
        enviarNotificacion("Se aplicó interés a su cuenta AHORROS. Nuevo saldo: " + saldo);
    }
}
