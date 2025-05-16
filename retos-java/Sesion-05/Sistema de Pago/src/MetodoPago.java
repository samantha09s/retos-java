// Clase abstracta que representa un método de pago genérico.
public abstract class MetodoPago implements Autenticable {
    protected final double monto;

    public MetodoPago(double monto) {
        this.monto = monto;
    }

    public abstract void procesarPago();

    // Muestra el resumen del pago procesado.
    public void mostrarResumen() {
        System.out.printf("📄 Tipo: %s - Monto: $%.2f%n", getClass().getSimpleName(), monto);
    }
}