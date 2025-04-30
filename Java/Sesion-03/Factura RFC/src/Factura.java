import java.util.Optional;

// Clase que modela una factura con encapsulación y uso de Optional
public class Factura {

    // === Atributos privados (encapsulación) ===
    private double monto;                       // Monto total de la factura
    private String descripcion;                 // Concepto o descripción del servicio/producto
    private Optional<String> rfc;               // RFC del cliente, opcional

    // === Constructor ===
    public Factura(double monto, String descripcion, String rfc) {
        this.monto = monto;
        this.descripcion = descripcion;
        // Si el RFC es null, se guarda como Optional vacío para evitar errores NullPointerException
        this.rfc = (rfc != null) ? Optional.of(rfc) : Optional.empty();
    }

    // === Método para generar un resumen legible de la factura ===
    public String getResumen() {
        String resumen = "📄 Factura generada:\n";
        resumen += "Descripción: " + descripcion + "\n";
        resumen += String.format("Monto: $%.1f\n", monto);

        // Si hay RFC presente, se muestra; si no, se indica que no fue proporcionado
        resumen += "RFC: " + rfc.orElse("[No proporcionado]") + "\n";
        return resumen;
    }
}