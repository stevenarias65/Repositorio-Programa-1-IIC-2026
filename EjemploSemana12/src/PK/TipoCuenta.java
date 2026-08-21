package ucc.banco.notificaciones;

/**
 * Enumeración que representa los tipos de cuenta bancaria disponibles.
 * Cada constante lleva asociada su propia tasa de interés,
 * demostrando que un enum en Java puede tener atributos y constructor,
 * no solo una lista de nombres.
 *
 * @author Universidad Castro Carazo
 */
public enum TipoCuenta {

    AHORROS(0.03),      // 3% de interés
    CORRIENTE(0.0),     // Sin interés
    EMPRESARIAL(0.015); // 1.5% de interés

    // Atributo propio de cada constante del enum
    private final double tasaInteres;

    /**
     * Constructor del enum. Es implícitamente privado:
     * no se puede invocar desde fuera de la clase.
     * Se ejecuta una vez por cada constante al cargar la clase.
     *
     * @param tasaInteres tasa asociada a esa constante
     */
    TipoCuenta(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    /**
     * @return la tasa de interés asociada a este tipo de cuenta
     */
    public double getTasaInteres() {
        return tasaInteres;
    }
}
