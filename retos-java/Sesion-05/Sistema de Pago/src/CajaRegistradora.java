// Simula una caja registradora que procesa distintos tipos de pagos.
public class CajaRegistradora {
    public static void main(String[] args) {
        MetodoPago[] pagos = {
            new PagoEfectivo(150.0),
            new PagoTarjeta(320.0, 500.0),
            new PagoTransferencia(250.0, false) // Fallará autenticación
        };

        for (MetodoPago pago : pagos) {
            if (pago.autenticar()) {
                System.out.println("✅ Autenticación exitosa.");
                pago.procesarPago();
                pago.mostrarResumen();
            } else {
                System.out.printf("❌ Fallo de autenticación. %s no válido.%n", pago.getClass().getSimpleName());
            }
            System.out.println(); // Separador visual
        }
    }
}