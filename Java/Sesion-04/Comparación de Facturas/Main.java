// Clase principal para probar y comparar facturas
public class Main {
    public static void main(String[] args) {
        // Creamos dos facturas con el mismo folio pero datos diferentes
        Factura f1 = new Factura("FAC001", "Juan Pérez", 1450.0);
        Factura f2 = new Factura("FAC001", "Comercial XYZ", 1450.0);

        // Mostramos la información completa de cada factura
        System.out.println(f1);
        System.out.println(f2);

        // Comparamos si ambas facturas son iguales por su folio
        boolean iguales = f1.equals(f2);
        System.out.println("¿Las facturas son iguales?: " + iguales);
    }
}