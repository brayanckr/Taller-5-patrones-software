package smartlibrary;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Prestamo {
    private final Estudiante estudiante;
    private final Ejemplar ejemplar;
    private LocalDate fechaPrevistaDevolucion;
    private final List<Renovacion> renovaciones = new ArrayList<>();

    public Prestamo(Estudiante estudiante, Ejemplar ejemplar, LocalDate fechaPrevistaDevolucion) {
        this.estudiante = estudiante;
        this.ejemplar = ejemplar;
        this.fechaPrevistaDevolucion = fechaPrevistaDevolucion;
    }

    public void renovar(LocalDate nuevaFecha) {
        // 1. Validar: la nueva fecha debe ser posterior a la fecha prevista vigente
        if (nuevaFecha == null || !nuevaFecha.isAfter(fechaPrevistaDevolucion)) {
            throw new IllegalArgumentException(
                "La nueva fecha (" + nuevaFecha + ") debe ser posterior a la fecha prevista vigente ("
                + fechaPrevistaDevolucion + ")");
        }
        // 2 y 3. Crear la Renovacion conservando la fecha anterior, y almacenarla
        renovaciones.add(new Renovacion(LocalDate.now(), fechaPrevistaDevolucion, nuevaFecha));
        // 4. Actualizar la fecha prevista
        fechaPrevistaDevolucion = nuevaFecha;
    }

    public LocalDate getFechaPrevistaDevolucion() {
        return fechaPrevistaDevolucion;
    }

    /** Copia de solo lectura: las renovaciones solo se agregan via renovar(). */
    public List<Renovacion> getRenovaciones() {
        return Collections.unmodifiableList(renovaciones);
    }
}
