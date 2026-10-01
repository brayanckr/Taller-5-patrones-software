package smartlibrary;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("1001", "Ana Torres", "ana@uni.edu",
                                               "S123", "Ingenieria de Sistemas");
        Libro libro = new Libro("Clean Code");
        Ejemplar ejemplar = libro.agregarEjemplar("CC-001");
        Prestamo prestamo = new Prestamo(estudiante, ejemplar, LocalDate.of(2026, 10, 7));

        // Prueba 1: renovacion valida
        System.out.println("--- Prueba 1: renovacion valida ---");
        prestamo.renovar(LocalDate.of(2026, 10, 15));
        estudiante.notificar("Su prestamo fue renovado.");
        System.out.println("Nueva fecha prevista: " + prestamo.getFechaPrevistaDevolucion());
        System.out.println("Renovaciones: " + prestamo.getRenovaciones().size());

        // Prueba 2: renovacion invalida (fecha igual a la prevista vigente)
        System.out.println("--- Prueba 2: renovacion invalida ---");
        try {
            prestamo.renovar(LocalDate.of(2026, 10, 15));
            System.out.println("ERROR: debio lanzar excepcion");
        } catch (IllegalArgumentException ex) {
            System.out.println("Rechazada: " + ex.getMessage());
        }
        System.out.println("Fecha prevista sin cambios: " + prestamo.getFechaPrevistaDevolucion());
        System.out.println("Renovaciones (sin cambios): " + prestamo.getRenovaciones().size());
    }
}
