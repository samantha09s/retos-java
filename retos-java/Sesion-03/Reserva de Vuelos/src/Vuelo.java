// Clase que representa un vuelo con un solo asiento reservado
public class Vuelo {
    private final String codigoVuelo; // Código único e inmutable del vuelo
    private String destino;
    private String horaSalida;
    private Pasajero asientoReservado; // Puede estar vacío (null) si no hay reserva

    // Constructor para crear un vuelo
    public Vuelo(String codigo, String destino, String horaSalida) {
        this.codigoVuelo = codigo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoReservado = null; // Inicialmente no hay reserva
    }

    // Método que permite reservar un asiento si aún no está ocupado
    public boolean reservarAsiento(Pasajero p) {
        if (asientoReservado == null) {
            asientoReservado = p;
            return true;
        }
        return false; // Ya está reservado
    }

    // Sobrecarga del método para crear y asignar al pasajero directamente
    public boolean reservarAsiento(String nombre, String pasaporte) {
        if (asientoReservado == null) {
            asientoReservado = new Pasajero(nombre, pasaporte);
            return true;
        }
        return false;
    }

    // Cancela la reserva del pasajero, dejando el asiento libre
    public void cancelarReserva() {
        asientoReservado = null;
    }

    // Devuelve una cadena con la información completa del vuelo
    public String obtenerItinerario() {
        String info = "\n\u2708\ufe0f Itinerario del vuelo:\n";
        info += "Código: " + codigoVuelo + "\n";
        info += "Destino: " + destino + "\n";
        info += "Salida: " + horaSalida + "\n";

        if (asientoReservado != null) {
            info += "Pasajero: " + asientoReservado.getNombre();
        } else {
            info += "Pasajero: [Sin reserva]";
        }

        return info;
    }
}