// Representa un pago con tarjeta bancaria.
public class PagoTarjeta extends MetodoPago {
    private final double saldoDisponible;

    public PagoTarjeta(double monto, double saldoDisponible) {
        super(monto);
        this.saldoDisponible = saldoDisponible;
    }

    @Override
    public boolean autenticar() {
        return saldoDisponible >= monto;
    }

    @Override
    public void procesarPago() {
        System.out.printf("💳 Procesando pago con tarjeta por $%.2f%n", monto);
    }
}