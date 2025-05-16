// Representa un pago realizado en efectivo.
public class PagoEfectivo extends MetodoPago {

    public PagoEfectivo(double monto) {
        super(monto);
    }

    @Override
    public boolean autenticar() {
        return true; // Siempre válido para efectivo
    }

    @Override
    public void procesarPago() {
        System.out.printf("💵 Procesando pago en efectivo por $%.2f%n", monto);
    }
}