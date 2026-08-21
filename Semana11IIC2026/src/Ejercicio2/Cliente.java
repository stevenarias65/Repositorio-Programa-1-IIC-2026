package Ejercicio2;

/**
 * Clase base de la jerarquia de clientes.
 * Ahora es abstracta: no se pueden crear objetos "Cliente" a secas,
 * siempre se debe crear un ClienteRegular o un ClienteVIP.
 *
 * El metodo calcularDescuento() es el punto de polimorfismo:
 * cada subclase decide como calcular su propio descuento.
 */
public abstract class Cliente {

    protected String cedula;
    protected String nombre;
    protected String telefono;
    protected String correo;

    public Cliente(String cedula, String nombre, String telefono, String correo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void actualizarDatos(String cedula, String nombre, String telefono, String correo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    /**
     * Metodo abstracto: cada tipo de cliente calcula su descuento distinto.
     * Este es el metodo que se va a "sobreescribir" (override) en las subclases.
     *
     * @param montoCompra monto de la compra antes de descuento
     * @return el monto del descuento (no el total, solo lo que se descuenta)
     */
    public abstract double calcularDescuento(double montoCompra);

    /**
     * Devuelve el nombre del tipo de cliente, util para mostrarlo en tablas
     * y en la ventana de ventas.
     */
    public abstract String getTipoCliente();
}
