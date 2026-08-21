package ucc.banco.notificaciones;

/**
 * Cuenta corriente: no genera interés (tasa 0 en el enum),
 * pero sobrescribe enviarNotificacion() para anteponer una etiqueta.
 * Esto demuestra polimorfismo por sobrescritura (override):
 * el mismo método, llamado sobre una Cuenta, se comporta distinto
 * si el objeto real es CuentaCorriente.
 *
 * @author Universidad Castro Carazo
 */
public class CuentaCorriente extends Cuenta {

    public CuentaCorriente(String titular, double saldo) {
        super(titular, saldo, TipoCuenta.CORRIENTE);
    }

    /**
     * Las cuentas corrientes de este banco no generan interés,
     * pero igual se notifica al titular para dejar constancia
     * de que el proceso corrió.
     */
    @Override
    public void aplicarInteres() {
        enviarNotificacion("Su cuenta CORRIENTE no genera intereses.");
    }

    /**
     * Sobrescritura del método de Cuenta: se agrega el prefijo
     * [CORRIENTE] antes del mensaje estándar.
     *
     * @param mensaje contenido del mensaje
     */
    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("[CORRIENTE] Notificación para " + titular + ": " + mensaje);
    }
}
