package smartlibrary;

/**
 * Especializacion de Usuario (R12).
 *
 * Decision: NO implementa Notificable. R13 dice que solo ALGUNOS usuarios
 * reciben notificaciones, y estas (renovaciones, vencimientos) estan dirigidas
 * a quien toma prestado. El bibliotecario gestiona prestamos, no los recibe.
 * Si el requisito cambia, basta con agregar "implements Notificable" aqui,
 * sin tocar Usuario.
 */
public class Bibliotecario extends Usuario {
    private String codigoEmpleado;
    private String turno;

    public Bibliotecario(String identificacion, String nombre, String correo,
                         String codigoEmpleado, String turno) {
        super(identificacion, nombre, correo);
        this.codigoEmpleado = codigoEmpleado;
        this.turno = turno;
    }
}
