package ucc.banco.notificaciones;

/**
 * Interfaz que define el contrato de notificación.
 * Cualquier clase que implemente esta interfaz se compromete
 * a saber cómo enviar un mensaje a su titular.
 *
 * Se usa junto con clases abstractas para mostrar la diferencia:
 * la interfaz define el "qué" (comportamiento esperado),
 * la clase abstracta puede definir parte del "cómo" (implementación por defecto).
 *
 * @author Universidad Castro Carazo
 */
public interface Notificable {

    /**
     * Envía una notificación al titular de la cuenta.
     *
     * @param mensaje contenido del mensaje a enviar
     */
    void enviarNotificacion(String mensaje);
}
