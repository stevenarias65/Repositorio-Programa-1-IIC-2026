package ucc.banco.notificaciones;

/**
 * Clase abstracta que representa una cuenta bancaria genérica.
 *
 * Es la base del polimorfismo de este ejercicio: nunca se va a crear
 * un objeto "Cuenta" directamente (no tiene sentido, toda cuenta real
 * es de un tipo específico), pero sí se puede trabajar con referencias
 * de tipo Cuenta que apunten a objetos CuentaAhorros, CuentaCorriente
 * o CuentaEmpresarial.
 *
 * Implementa Notificable y da una implementación por defecto de
 * enviarNotificacion(), que las subclases pueden heredar tal cual
 * o sobrescribir (como hace CuentaCorriente).
 * @author Universidad Castro Carazo
 */
public abstract class Cuenta implements Notificable {

    protected String titular;
    protected double saldo;
    protected TipoCuenta tipo;

    /**
     * Constructor que inicializa los datos comunes a toda cuenta.
     *
     * @param titular nombre del dueño de la cuenta
     * @param saldo   saldo inicial
     * @param tipo    tipo de cuenta (enum TipoCuenta)
     */
    public Cuenta(String titular, double saldo, TipoCuenta tipo) {
        this.titular = titular;
        this.saldo = saldo;
        this.tipo = tipo;
    }

    /**
     * Método abstracto: cada subclase decide CÓMO se aplica el interés.
     * Esto es polimorfismo en acción: el mismo mensaje "aplicarInteres()"
     * produce comportamientos distintos según el objeto real.
     */
    public abstract void aplicarInteres();

    /**
     * Retira un monto de la cuenta, validando fondos suficientes.
     *
     * @param monto monto a retirar
     * @throws SaldoInsuficienteException si el monto supera el saldo disponible
     */
    public void retirar(double monto) throws SaldoInsuficienteException {
        if (monto > saldo) {
            throw new SaldoInsuficienteException(monto, saldo);
        }
        saldo -= monto;
    }

    /**
     * Implementación por defecto de Notificable.
     * Las subclases pueden usarla tal cual (CuentaAhorros, CuentaEmpresarial)
     * o sobrescribirla para personalizar el formato (CuentaCorriente).
     *
     * @param mensaje contenido del mensaje
     */
    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Notificación para " + titular + ": " + mensaje);
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public TipoCuenta getTipo() {
        return tipo;
    }
}
