public class Patrulla {
    private final String nombre = "Patrulla";
    private final SistemaGPS gps = new SistemaGPS();
    private final Sirena sirena = new Sirena();
    private final Operador operador;

    public Patrulla(String nombreOperador) {
        this.operador = new Operador(nombreOperador);
    }

    public void iniciarOperacion() {
        UnidadEmergencia.activarUnidad(nombre);
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();

        UnidadEmergencia respuesta = () -> System.out.println("🚓 Patrulla atendiendo situación de seguridad ciudadana.");
        respuesta.responder();
    }
}