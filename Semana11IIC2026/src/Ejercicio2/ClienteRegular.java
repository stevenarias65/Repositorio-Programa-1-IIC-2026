package Ejercicio2;

/**
 * Cliente regular: recibe un descuento fijo del 5% sobre el monto de compra.
 */
public class ClienteRegular extends Cliente {

    private static final double PORCENTAJE_DESCUENTO = 0.05; // 5%

    public ClienteRegular(String cedula, String nombre, String telefono, String correo) {
        super(cedula, nombre, telefono, correo);
    }

    @Override
    public double calcularDescuento(double montoCompra) {
        return montoCompra * PORCENTAJE_DESCUENTO;
    }

    @Override
    public String getTipoCliente() {
        return "Regular";
    }
}
