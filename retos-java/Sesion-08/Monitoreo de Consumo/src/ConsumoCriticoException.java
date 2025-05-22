// Excepción personalizada para indicar un consumo de CPU crítico.
// Hereda de Exception (checked exception).
public class ConsumoCriticoException extends Exception {
    // Constructor que recibe un mensaje personalizado.
    public ConsumoCriticoException(String mensaje) {
        super(mensaje);
    }
}