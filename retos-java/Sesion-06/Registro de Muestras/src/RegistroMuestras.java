import java.util.*;

/**
 * Clase principal para registrar y analizar muestras genéticas.
 * Simula el uso de estructuras como listas, sets y mapas en un contexto biotecnológico.
 */
public class RegistroMuestras {

    public static void main(String[] args) {
        var muestras = registrarOrdenLlegada();
        mostrarMuestrasRecibidas(muestras);

        var especiesUnicas = obtenerEspeciesUnicas(muestras);
        mostrarEspeciesUnicas(especiesUnicas);

        var asignaciones = asociarMuestrasConInvestigadores();
        mostrarAsignaciones(asignaciones);

        buscarInvestigadorPorID(asignaciones, "M-002");
    }

    // Registra las especies genéticas en orden de llegada (pueden repetirse).
    private static List<String> registrarOrdenLlegada() {
        return new ArrayList<>(List.of(
                "Homo sapiens",
                "Mus musculus",
                "Arabidopsis thaliana",
                "Homo sapiens"
        ));
    }

    // Imprime el listado completo de muestras recibidas en orden.
    private static void mostrarMuestrasRecibidas(List<String> muestras) {
        System.out.println("📋 Muestras recibidas en orden:");
        for (int i = 0; i < muestras.size(); i++) {
            System.out.printf("%d. %s%n", i + 1, muestras.get(i));
        }
    }

    // Retorna el conjunto de especies únicas.
    private static Set<String> obtenerEspeciesUnicas(List<String> muestras) {
        return new HashSet<>(muestras);
    }

    // Muestra en consola las especies únicas.
    private static void mostrarEspeciesUnicas(Set<String> especies) {
        System.out.println("\n✅ Especies únicas procesadas:");
        especies.forEach(e -> System.out.println("- " + e));
    }

    // Asocia el ID de muestra con el nombre del investigador.
    private static Map<String, String> asociarMuestrasConInvestigadores() {
        return Map.of(
                "M-001", "Dra. López",
                "M-002", "Dr. Hernández",
                "M-003", "Dra. Rivera"
        );
    }

    // Muestra las asignaciones actuales de muestras a investigadores.
    private static void mostrarAsignaciones(Map<String, String> asignaciones) {
        System.out.println("\n👩‍🔬 Asignación de muestras a investigadores:");
        asignaciones.forEach((id, nombre) ->
                System.out.println(id + " → " + nombre)
        );
    }

    // Busca un investigador dado el ID de la muestra.
    private static void buscarInvestigadorPorID(Map<String, String> asignaciones, String id) {
        System.out.println("\n🔍 Investigador responsable de la muestra " + id + ":");
        System.out.println(asignaciones.getOrDefault(id, "❌ No se encontró investigador para ese ID."));
    }
}