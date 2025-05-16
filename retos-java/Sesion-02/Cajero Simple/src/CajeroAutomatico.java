import java.util.Scanner;
public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cajero cajero = new Cajero(1000.0);

        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> System.out.printf("Saldo actual: $%.2f%n", cajero.consultarSaldo());
                case 2 -> {
                    System.out.print("Monto a depositar: ");
                    double monto = scanner.nextDouble();
                    if (cajero.depositar(monto))
                        System.out.println("✅ Depósito exitoso.");
                    else
                        System.out.println("❌ Monto inválido.");
                }
                case 3 -> {
                    System.out.print("Monto a retirar: ");
                    double monto = scanner.nextDouble();
                    if (cajero.retirar(monto))
                        System.out.println("✅ Retiro exitoso.");
                    else
                        System.out.println("❌ Fondos insuficientes o monto inválido.");
                }
                case 4 -> System.out.println("Gracias por usar el cajero. ¡Hasta pronto! 👋");
                default -> System.out.println("❌ Opción inválida.");
            }

        } while (opcion != 4);
        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("""
            \n=== Menú del Cajero ===
            1. Consultar saldo
            2. Depositar dinero
            3. Retirar dinero
            4. Salir
            Seleccione una opción:
            """);
    }
}