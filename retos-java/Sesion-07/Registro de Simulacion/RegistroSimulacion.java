import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * RegistroSimulacion simula el registro de parámetros previos a una corrida de simulación.
 * Es utilizado por ingenieros de simulación de procesos para documentar configuraciones clave.
 */
public class RegistroSimulacion {

    // Ruta base relativa para guardar el archivo
    private static final Path RUTA_DIRECTORIO = Paths.get("config");
    private static final Path RUTA_ARCHIVO = RUTA_DIRECTORIO.resolve("parametros.txt");

    public static void main(String[] args) {
        try {
            guardarParametros();
            leerParametros();
        } catch (IOException e) {
            System.err.println("❌ Error al trabajar con archivos: " + e.getMessage());
        }
    }

    /**
     * Crea el archivo de parámetros de simulación.
     * Si el directorio no existe, lo genera automáticamente.
     */
    public static void guardarParametros() throws IOException {
        // 💡 Usamos StringBuilder para mayor eficiencia al construir cadenas
        StringBuilder parametros = new StringBuilder()
                .append("Tiempo de ciclo: 55.8 segundos\n")
                .append("Velocidad de línea: 1.2 m/s\n")
                .append("Número de estaciones: 8\n");

        // Crea la carpeta si no existe (soporta jerarquías)
        if (Files.notExists(RUTA_DIRECTORIO)) {
            Files.createDirectories(RUTA_DIRECTORIO);
            System.out.println("📁 Carpeta 'config' creada.");
        }

        // Escribe o sobreescribe el archivo
        Files.write(RUTA_ARCHIVO, parametros.toString().getBytes());
        System.out.println("✅ Archivo de parámetros guardado en: " + RUTA_ARCHIVO.toAbsolutePath());
    }

    // Lee y muestra el contenido del archivo de parámetros si existe.
    public static void leerParametros() throws IOException {
        if (Files.exists(RUTA_ARCHIVO)) {
            String contenido = Files.readString(RUTA_ARCHIVO);
            System.out.println("\n📋 Contenido del archivo:");
            System.out.println(contenido);
        } else {
            System.out.println("⚠️ El archivo de parámetros no existe.");
        }
    }
}