package Ejercicio2;

/**
 * Cliente VIP: recibe un descuento fijo del 15% sobre el monto de compra.
 */
public class ClienteVIP extends Cliente {

    private static final double PORCENTAJE_DESCUENTO = 0.15; // 15%

    public ClienteVIP(String cedula, String nombre, String telefono, String correo) {
        super(cedula, nombre, telefono, correo);
    }

    @Override
    public double calcularDescuento(double montoCompra) {
        return montoCompra * PORCENTAJE_DESCUENTO;
    }

    @Override
    public String getTipoCliente() {
        return "VIP";
    }
}
