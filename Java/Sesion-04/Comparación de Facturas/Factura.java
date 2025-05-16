// Clase que representa una factura con información básica para comparación contable
import java.util.Objects;

public class Factura {
    private String folio;      // Identificador único de la factura
    private String cliente;    // Nombre del cliente
    private double total;      // Total a pagar

    // Constructor: inicializa los atributos de la factura
    public Factura(String folio, String cliente, double total) {
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }

    // Representación legible de la factura (útil para imprimir)
    @Override
    public String toString() {
        return String.format("🧾 Factura [folio=%s, cliente=%s, total=$%.2f]", folio, cliente, total);
    }

    // Compara si dos facturas son iguales con base en su folio (clave única fiscal)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // ✅ Mismo objeto en memoria
        if (obj == null || getClass() != obj.getClass()) return false; // ❌ Distinto tipo

        Factura factura = (Factura) obj;
        return Objects.equals(this.folio, factura.folio); // 📎 Igualdad basada solo en el folio
    }

    // Genera un hash único basado en el folio (clave primaria en estructuras hash)
    @Override
    public int hashCode() {
        return Objects.hash(folio);
    }
}