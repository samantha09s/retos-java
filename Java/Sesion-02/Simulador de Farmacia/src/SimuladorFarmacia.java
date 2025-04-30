// Archivo: SimuladorFarmacia.java

import java.util.Scanner;

public class SimuladorFarmacia {
    public static void main(String[] args) {

        // Creamos el escáner para capturar entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // === ENTRADA DE DATOS ===
        System.out.print("Nombre del medicamento: ");
        String medicamento = scanner.nextLine(); // Nombre como String

        System.out.print("Precio unitario ($): ");
        double precioUnitario = scanner.nextDouble(); // Precio por unidad

        System.out.print("Cantidad de piezas: ");
        int cantidad = scanner.nextInt(); // Cantidad total

        // === CÁLCULOS ===
        var totalSinDescuento = precioUnitario * cantidad; // uso de 'var' para inferencia de tipo
        boolean aplicaDescuento = totalSinDescuento > 500; // ¿El total supera el umbral?

        // Descuento con operador ternario
        double descuento = aplicaDescuento ? totalSinDescuento * 0.15 : 0.0;
        double totalPagar = totalSinDescuento - descuento;

        // === SALIDA ===
        System.out.println("\n🧾 RESUMEN DE COMPRA 🧾");
        System.out.println("Medicamento: " + medicamento);
        System.out.println("Cantidad: " + cantidad);
        System.out.printf("Precio unitario: $%.2f\n", precioUnitario);
        System.out.printf("Total sin descuento: $%.2f\n", totalSinDescuento);
        System.out.println("¿Aplica descuento?: " + aplicaDescuento);
        System.out.printf("Descuento: $%.2f\n", descuento);
        System.out.printf("Total a pagar: $%.2f\n", totalPagar);

        // Cerrar el escáner
        scanner.close();
    }
}