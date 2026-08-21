package ucc.banco.notificaciones;

/**
 * Cuenta empresarial: aplica su propia tasa de interés y también
 * sobrescribe enviarNotificacion(), pero con un formato distinto
 * al de CuentaCorriente. Se agrega para que el arreglo polimórfico
 * en Main tenga tres comportamientos distintos, no solo dos.
 *
 * @author Universidad Castro Carazo
 */
public class CuentaEmpresarial extends Cuenta {

    public CuentaEmpresarial(String titular, double saldo) {
        super(titular, saldo, TipoCuenta.EMPRESARIAL);
    }

    @Override
    public void aplicarInteres() {
        double interes = saldo * tipo.getTasaInteres();
        saldo += interes;
        enviarNotificacion("Se aplicó interés empresarial. Nuevo saldo: " + saldo);
    }

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("[EMPRESA] Aviso para " + titular + ": " + mensaje);
    }
}
