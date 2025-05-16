// Record que representa una declaración de impuestos, usando un tipo inmutable
// para asegurar la integridad de los datos fiscales.
public record DeclaracionImpuestos(String rfcContribuyente, double montoDeclarado) {

    // El constructor y los campos son implícitamente públicos y finales
    // por lo tanto, no necesitamos definir getters manualmente.
}