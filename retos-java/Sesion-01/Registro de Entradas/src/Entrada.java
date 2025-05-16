// Archivo: Entrada.java
// Clase que representa una entrada para un evento

public class Entrada {
    private String nombreEvento;
    private double precioEntrada;

    // Constructor que inicializa el nombre y el precio
    public Entrada(String nombreEvento, double precioEntrada) {
        this.nombreEvento = nombreEvento;
        this.precioEntrada = precioEntrada;
    }

    // Método para mostrar la información de la entrada
    public void mostrarInformacion() {
        System.out.printf("Evento: %s | Precio: $%.2f%n", nombreEvento, precioEntrada);
    }
}