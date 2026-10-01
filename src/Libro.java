package smartlibrary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Libro {
    private final String titulo;
    private final List<Ejemplar> ejemplares = new ArrayList<>();

    public Libro(String titulo) {
        this.titulo = titulo;
    }

    /** Composicion (R10): el Libro es quien crea sus Ejemplares. */
    public Ejemplar agregarEjemplar(String codigo) {
        Ejemplar e = new Ejemplar(codigo, this);
        ejemplares.add(e);
        return e;
    }

    public String getTitulo() {
        return titulo;
    }

    public List<Ejemplar> getEjemplares() {
        return Collections.unmodifiableList(ejemplares);
    }
}
