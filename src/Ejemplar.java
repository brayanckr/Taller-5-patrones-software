package smartlibrary;

public class Ejemplar {
    private final String codigo;
    private final Libro libro;

    /** Visibilidad de paquete: solo Libro puede crear ejemplares (R10). */
    Ejemplar(String codigo, Libro libro) {
        this.codigo = codigo;
        this.libro = libro;
    }

    public String getCodigo() {
        return codigo;
    }

    public Libro getLibro() {
        return libro;
    }
}
