package smartlibrary;

import java.time.LocalDate;

/** Registro inmutable de una renovacion (R11). */
public class Renovacion {
    private final LocalDate fechaRenovacion;
    private final LocalDate fechaAnterior;
    private final LocalDate nuevaFecha;

    /** Visibilidad de paquete: solo Prestamo crea renovaciones (composicion). */
    Renovacion(LocalDate fechaRenovacion, LocalDate fechaAnterior, LocalDate nuevaFecha) {
        this.fechaRenovacion = fechaRenovacion;
        this.fechaAnterior = fechaAnterior;
        this.nuevaFecha = nuevaFecha;
    }

    public LocalDate getFechaRenovacion() { return fechaRenovacion; }
    public LocalDate getFechaAnterior()   { return fechaAnterior; }
    public LocalDate getNuevaFecha()      { return nuevaFecha; }
}
