public class Main {
    public static void main(String[] args) {
        // Crear una declaración de impuestos con un RFC y monto declarado
        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("XAXX010101000", 8700.0);

        // Crear una cuenta fiscal con el mismo RFC y un saldo disponible
        CuentaFiscal cuenta = new CuentaFiscal("XAXX010101000", 9500.0);

        // Mostrar la información de la declaración y la cuenta fiscal
        System.out.println("📄 Declaración enviada por RFC: " + declaracion.rfcContribuyente() + " por $" + declaracion.montoDeclarado());
        System.out.println("🏦 Cuenta fiscal registrada con RFC: " + cuenta.getRfc() + ", saldo disponible: $" + cuenta.getSaldoDisponible());

        // Validar si el RFC de la declaración coincide con el de la cuenta fiscal
        boolean esRfcValido = cuenta.validarRFC(declaracion);

        // Mostrar el resultado de la validación
        System.out.println("✅ ¿RFC válido para esta cuenta?: " + esRfcValido);
    }
}