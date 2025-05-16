// Clase que representa a un pasajero
public class Pasajero {
    private String nombre;
    private String pasaporte;

    // Constructor para inicializar un pasajero con nombre y pasaporte
    public Pasajero(String nombre, String pasaporte) {
        this.nombre = nombre;
        this.pasaporte = pasaporte;
    }

    // Método para obtener el nombre del pasajero
    public String getNombre() {
        return nombre;
    }

    // Método para obtener el número de pasaporte del pasajero
    public String getPasaporte() {
        return pasaporte;
    }
}