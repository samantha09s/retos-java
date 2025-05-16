// Representa una unidad de emergencia capaz de activarse y responder.
@FunctionalInterface
public interface UnidadEmergencia {
    void responder(); // Acción principal de la unidad (método funcional)

    // Activa cualquier unidad con su nombre.
    static void activarUnidad(String nombre) {
        System.out.println("🚨 Activando unidad: " + nombre);
    }
}