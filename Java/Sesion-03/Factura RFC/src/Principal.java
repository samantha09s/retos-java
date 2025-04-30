public class Principal {
    public static void main(String[] args) {

        // Primera factura con RFC proporcionado
        Factura factura1 = new Factura(2500.0, "Servicio de consultoría", "ABCC010101XYZ");

        // Segunda factura sin RFC (se pasa null)
        Factura factura2 = new Factura(1800.0, "Reparación de equipo", null);

        // Mostrar resúmenes
        System.out.println(factura1.getResumen());
        System.out.println(factura2.getResumen());
    }
}