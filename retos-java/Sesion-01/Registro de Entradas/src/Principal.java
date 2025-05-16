// Archivo: Principal.java
// Clase principal que demuestra el uso de la clase Entrada y del record Entrada_Record

public class Principal {
    public static void main(String[] args) {
        // --- Usando la clase Entrada (clásica) ---
        Entrada entrada1 = new Entrada("Taylor Swift: The Eras Tour - México", 5000.00);
        Entrada entrada2 = new Entrada("J-Hope: Hope on the Stage - México", 5000.00);

        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();

        System.out.println("\n--- Ahora usando el record Entrada_Record ---");

        // --- Usando el record Entrada_Record (versión moderna) ---
        Entrada_Record record1 = new Entrada_Record("Concierto de Juan Gabriel en Bellas Artes", 3000.00);
        Entrada_Record record2 = new Entrada_Record("Ballet El Lago de los Cisnes en Castillo de Chapultepec", 1000.00);

        record1.mostrarInformacion();
        record2.mostrarInformacion();
    }
}