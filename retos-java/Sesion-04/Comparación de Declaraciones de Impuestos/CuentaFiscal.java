import java.util.Objects; // Importación de la clase Objects para usar equals

class CuentaFiscal {
    private final String rfc;
    private double saldoDisponible;

    public CuentaFiscal(String rfc, double saldoDisponible) {
        if (saldoDisponible < 0) {
            throw new IllegalArgumentException("El saldo no puede ser negativo.");
        }
        this.rfc = rfc;
        this.saldoDisponible = saldoDisponible;
    }

    public String getRfc() {
        return rfc;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    // Método que valida si el RFC de la cuenta coincide con el RFC de la declaración de impuestos
    public boolean validarRFC(DeclaracionImpuestos declaracion) {
        // Usamos Objects.equals() para manejar comparaciones seguras, incluso con valores null
        return Objects.equals(this.rfc, declaracion.rfcContribuyente());
    }
}