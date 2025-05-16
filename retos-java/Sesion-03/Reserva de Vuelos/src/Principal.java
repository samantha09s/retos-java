// Clase principal donde se simulan las acciones del sistema de reservas
public class Principal {
    public static void main(String[] args) {

        // Creamos un vuelo con su información básica
        Vuelo vuelo1 = new Vuelo("UX123", "París", "14:30");

        // Creamos un pasajero con sus datos
        Pasajero pasajero1 = new Pasajero("Ana Martínez", "X123456");

        // Realizamos una reserva con el objeto pasajero
        if (vuelo1.reservarAsiento(pasajero1)) {
            System.out.println("\n✅ Reserva realizada con éxito.");
        }

        // Mostramos el itinerario actual
        System.out.println(vuelo1.obtenerItinerario());

        // Cancelamos la reserva
        System.out.println("\n❌ Cancelando reserva...");
        vuelo1.cancelarReserva();

        // Mostramos el itinerario nuevamente
        System.out.println(vuelo1.obtenerItinerario());

        // Reservamos nuevamente usando sobrecarga (nombre + pasaporte)
        vuelo1.reservarAsiento("Mario Gonzalez", "Z987654");
        System.out.println(vuelo1.obtenerItinerario());
    }
}