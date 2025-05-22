import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

// Clase principal que gestiona el monitoreo de CPU de servidores
public class MonitorCPU {
    public static void main(String[] args) {
        // Scanner para capturar la entrada del usuario desde consola
        Scanner scanner = new Scanner(System.in);

        // HashSet para guardar valores únicos de consumo de CPU
        Set<Integer> registrosCPU = new HashSet<>();

        try {
            System.out.println("🖥️ Ingresa consumos de CPU en porcentaje (enteros del 0 al 100). Escribe -1 para finalizar.");

            // Bucle para registrar múltiples valores
            while (true) {
                System.out.print("🔢 CPU (%): ");

                // Captura de entrada del usuario
                int valor = scanner.nextInt();

                // Condición para finalizar la entrada
                if (valor == -1) {
                    break;
                }

                // Validación de rango permitido
                if (valor < 0 || valor > 100) {
                    System.out.println("❌ Valor fuera de rango. Debe estar entre 0 y 100.");
                    continue;
                }

                // Verifica duplicados usando HashSet (add devuelve false si ya existe)
                if (!registrosCPU.add(valor)) {
                    System.out.println("⚠️ Valor duplicado: " + valor + "%");
                    continue;
                }

                // Si el valor supera el umbral crítico (95%), se lanza la excepción personalizada
                if (valor > 95) {
                    throw new ConsumoCriticoException("🚨 ALERTA: Consumo crítico detectado (" + valor + "%)");
                }

                // Mensaje de confirmación si el valor es válido y aceptado
                System.out.println("✅ Registro aceptado: " + valor + "%");
            }

            // Captura de errores cuando el usuario no ingresa un número válido
        } catch (InputMismatchException e) {
            System.out.println("❌ Error: Debes ingresar un número entero válido.");

            // Captura de excepción personalizada de consumo crítico
        } catch (ConsumoCriticoException e) {
            System.out.println(e.getMessage());

            // Captura de cualquier otra excepción no controlada
        } catch (Exception e) {
            System.out.println("❌ Error inesperado: " + e.getMessage());

            // Bloque finally siempre se ejecuta: se cierra el Scanner
        } finally {
            scanner.close();
            System.out.println("📦 Recursos cerrados correctamente.");
        }
    }
}