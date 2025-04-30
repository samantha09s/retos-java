// Archivo: Entrada_Record.java
// Record que representa una entrada para un evento, usando Java moderno

public record Entrada_Record(String nombreEvento, double precioEntrada) {
    public void mostrarInformacion() {
        System.out.printf("Evento: %s | Precio: $%.2f%n", nombreEvento, precioEntrada);
    }
}