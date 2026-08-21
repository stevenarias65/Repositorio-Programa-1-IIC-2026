package ucc.banco.notificaciones;

/**
 * Excepción personalizada (checked exception) que se lanza
 * cuando se intenta retirar un monto mayor al saldo disponible.
 *
 * Al extender Exception (y no RuntimeException) obligamos a quien
 * use esta clase a manejarla con try-catch o declararla con throws,
 * tal como se pidió en el ejercicio.
 *
 * @author Universidad Castro Carazo
 */
public class SaldoInsuficienteException extends Exception {

    private final double montoSolicitado;
    private final double saldoDisponible;

    /**
     * Construye la excepción y arma automáticamente un mensaje
     * descriptivo a partir del monto solicitado y el saldo disponible.
     *
     * @param montoSolicitado monto que el usuario intentó retirar
     * @param saldoDisponible saldo real con el que cuenta la cuenta
     */
    public SaldoInsuficienteException(double montoSolicitado, double saldoDisponible) {
        // super(...) construye el mensaje heredado de Exception/Throwable
        super("Saldo insuficiente. Solicitado: " + montoSolicitado
                + ", disponible: " + saldoDisponible);
        this.montoSolicitado = montoSolicitado;
        this.saldoDisponible = saldoDisponible;
    }

    public double getMontoSolicitado() {
        return montoSolicitado;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }
}
