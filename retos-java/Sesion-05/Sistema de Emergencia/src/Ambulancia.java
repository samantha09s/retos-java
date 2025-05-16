public class Ambulancia {

    private final String nombre = "Ambulancia"; // Nombre fijo para claridad
    private final SistemaGPS gps = new SistemaGPS();
    private final Sirena sirena = new Sirena();
    private final Operador operador;

    public Ambulancia(String nombreOperador) {
        this.operador = new Operador(nombreOperador);
    }

    public void iniciarOperacion() {
        UnidadEmergencia.activarUnidad(nombre);
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();

        // Implementación funcional del responder()
        UnidadEmergencia respuesta = () -> System.out.println("🩺 Ambulancia en camino al hospital más cercano.");
        respuesta.responder();
    }
}