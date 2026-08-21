package ucc.banco.notificaciones;

/**
 * Clase principal de pruebas.
 *
 * Punto clave de POLIMORFISMO en este ejemplo:
 * se declara un arreglo de tipo Cuenta (la clase abstracta / el "molde"),
 * pero cada posición guarda un objeto de una subclase distinta
 * (CuentaAhorros, CuentaCorriente, CuentaEmpresarial).
 *
 * Al recorrer el arreglo y llamar cuenta.aplicarInteres() o
 * cuenta.enviarNotificacion(...), Java decide EN TIEMPO DE EJECUCIÓN
 * cuál versión del método ejecutar según el tipo real del objeto.
 * Esto es polimorfismo dinámico (enlace tardío / late binding).
 *
 * @author Universidad Castro Carazo
 */
public class Main {

    public static void main(String[] args) {

        // --- Polimorfismo: arreglo de la clase abstracta Cuenta ---
        Cuenta[] cuentas = new Cuenta[3];
        cuentas[0] = new CuentaAhorros("Ana", 1000.0);
        cuentas[1] = new CuentaCorriente("Carlos", 500.0);
        cuentas[2] = new CuentaEmpresarial("Comercial XYZ S.A.", 5000.0);

        System.out.println("===== Aplicando interés (polimorfismo) =====");
        for (Cuenta cuenta : cuentas) {
            // La misma línea de código produce salidas distintas
            // según el tipo real del objeto apuntado por "cuenta".
            cuenta.aplicarInteres();
        }

        System.out.println("\n===== Notificación manual =====");
        for (Cuenta cuenta : cuentas) {
            cuenta.enviarNotificacion("Recordatorio: revise su estado de cuenta.");
        }

        System.out.println("\n===== Prueba de retiro con manejo de excepción =====");
        try {
            // Carlos solo tiene 500, intentamos retirar 800 -> debe fallar
            cuentas[1].retirar(800.0);
            System.out.println("Retiro exitoso.");
        } catch (SaldoInsuficienteException e) {
            // Capturamos la excepción personalizada y mostramos su mensaje
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n===== Retiro válido =====");
        try {
            cuentas[0].retirar(200.0);
            System.out.println("Retiro exitoso. Saldo restante de Ana: " + cuentas[0].getSaldo());
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // --- Ejemplo adicional: identificar el tipo real con instanceof ---
        System.out.println("\n===== Identificación de tipos reales =====");
        for (Cuenta cuenta : cuentas) {
            if (cuenta instanceof CuentaAhorros) {
                System.out.println(cuenta.getTitular() + " tiene una CuentaAhorros.");
            } else if (cuenta instanceof CuentaCorriente) {
                System.out.println(cuenta.getTitular() + " tiene una CuentaCorriente.");
            } else if (cuenta instanceof CuentaEmpresarial) {
                System.out.println(cuenta.getTitular() + " tiene una CuentaEmpresarial.");
            }
        }
    }
}
