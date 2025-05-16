import java.io.IOException;
import java.nio.file.*;

/**
 * Analiza un archivo de logs para extraer estadísticas de errores y advertencias.
 * Simula un sistema de monitoreo para procesos en ambientes industriales.
 */
public class AnalizadorDeLogs {

    private static final Path RUTA_LOG = Paths.get("src/Solucion_Reto_02/errores.log");
    private static final Path RUTA_ERROR = Paths.get("src/Solucion_Reto_02/registro_fallos.txt");

    public static void main(String[] args) {
        try {
            LogStats estadisticas = analizarArchivoLog(RUTA_LOG);
            imprimirResumen(estadisticas);
        } catch (IOException e) {
            manejarErrorLectura(e);
        }
    }

    // Procesa un archivo línea por línea y devuelve un objeto con estadísticas del log.
    private static LogStats analizarArchivoLog(Path ruta) throws IOException {
        int total = 0, errores = 0, advertencias = 0;

        // Lectura segura y eficiente con try-with-resources
        try (var lector = Files.newBufferedReader(ruta)) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                total++;
                if (linea.contains("ERROR")) errores++;
                if (linea.contains("WARNING")) advertencias++;
            }
        }

        return new LogStats(total, errores, advertencias);
    }

    // Muestra el resumen formateado de estadísticas del log.
    private static void imprimirResumen(LogStats stats) {
        System.out.println("📊 Análisis completado:");
        System.out.println("➡️ Total de líneas leídas: " + stats.totalLineas());
        System.out.println("❌ Total de errores: " + stats.errores());
        System.out.println("⚠️ Total de advertencias: " + stats.advertencias());

        double pctError = stats.totalLineas() > 0 ? (double) stats.errores() * 100 / stats.totalLineas() : 0;
        double pctWarn = stats.totalLineas() > 0 ? (double) stats.advertencias() * 100 / stats.totalLineas() : 0;

        System.out.printf("📈 Porcentaje de errores: %.2f%%\n", pctError);
        System.out.printf("📉 Porcentaje de advertencias: %.2f%%\n", pctWarn);
    }

    // Maneja errores de lectura escribiendo una bitácora externa.
    private static void manejarErrorLectura(IOException e) {
        System.out.println("❌ Error al procesar el archivo de logs: " + e.getMessage());
        try {
            Files.writeString(RUTA_ERROR, "Error leyendo archivo: " + e.getMessage());
        } catch (IOException ex) {
            System.out.println("❌ No se pudo registrar el fallo.");
        }
    }

    // Registro inmutable para representar estadísticas del log.
    private record LogStats(int totalLineas, int errores, int advertencias) {}
}