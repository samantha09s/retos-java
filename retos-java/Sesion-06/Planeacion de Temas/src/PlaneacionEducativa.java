import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Representa un tema educativo con un título y nivel de prioridad.
 * Implementa Comparable para orden alfabético.
 */
final class Tema implements Comparable<Tema> {
    private final String titulo;
    private final int prioridad;

    public Tema(String titulo, int prioridad) {
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPrioridad() {
        return prioridad;
    }

    @Override
    public int compareTo(Tema otro) {
        return this.titulo.compareTo(otro.titulo); // Orden natural: alfabético
    }

    @Override
    public String toString() {
        return "📘 Tema: " + titulo + " | Prioridad: " + prioridad;
    }
}

public class PlaneacionEducativa {

    public static void main(String[] args) {

        // Lista concurrente de temas activos (segura frente a modificaciones en tiempo de ejecución)
        List<Tema> temas = new CopyOnWriteArrayList<>();
        temas.add(new Tema("Lectura comprensiva", 2));
        temas.add(new Tema("Matemáticas básicas", 1));
        temas.add(new Tema("Cuidado del medio ambiente", 3));

        // Orden alfabético por título
        Collections.sort(temas);
        System.out.println("📚 Temas ordenados alfabéticamente:");
        imprimirTemas(temas);

        // Orden por prioridad ascendente usando lambda
        temas.sort((a, b) -> Integer.compare(a.getPrioridad(), b.getPrioridad()));
        System.out.println("\n🔥 Temas ordenados por prioridad (1 = urgente):");
        imprimirTemas(temas);

        // Repositorio seguro de recursos por tema
        Map<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Lectura comprensiva", "https://recursos.edu/lectura");
        recursos.put("Matemáticas básicas", "https://recursos.edu/mate");
        recursos.put("Cuidado del medio ambiente", "https://recursos.edu/ambiente");

        // Mostrar materiales asociados a cada tema
        System.out.println("\n📦 Repositorio de recursos por tema:");
        recursos.forEach((tema, enlace) ->
                System.out.println("🔗 " + tema + " → " + enlace)
        );
    }

    // Imprime la lista de temas con formato amigable.
    private static void imprimirTemas(List<Tema> listaTemas) {
        for (Tema tema : listaTemas) {
            System.out.println(tema);
        }
    }
}