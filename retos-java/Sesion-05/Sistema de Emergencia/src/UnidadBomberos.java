public class UnidadBomberos {
    private final String nombre = "UnidadBomberos";
    private final SistemaGPS gps = new SistemaGPS();
    private final Sirena sirena = new Sirena();
    private final Operador operador;

    public UnidadBomberos(String nombreOperador) {
        this.operador = new Operador(nombreOperador);
    }

    public void iniciarOperacion() {
        UnidadEmergencia.activarUnidad(nombre);
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();

        UnidadEmergencia respuesta = () -> System.out.println("🔥 Unidad de bomberos respondiendo a incendio estructural.");
        respuesta.responder();
    }
}