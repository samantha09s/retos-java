// Representa un pago por transferencia bancaria.
public class PagoTransferencia extends MetodoPago {
    private final boolean validadoExternamente;

    public PagoTransferencia(double monto, boolean validadoExternamente) {
        super(monto);
        this.validadoExternamente = validadoExternamente;
    }

    @Override
    public boolean autenticar() {
        return validadoExternamente;
    }

    @Override
    public void procesarPago() {
        System.out.printf("🏦 Procesando transferencia por $%.2f%n", monto);
    }
}