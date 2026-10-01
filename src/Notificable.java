package smartlibrary;

/** Contrato de comportamiento: quien pueda recibir notificaciones del sistema. */
public interface Notificable {
    void notificar(String mensaje);
}
