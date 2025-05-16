import java.util.Scanner; // Importar la clase Scanner para leer datos del usuario.

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Crear un objeto Scanner para entrada por consola.

        Paciente p = new Paciente(); // Crear una nueva instancia de la clase Paciente.

        // Solicitar y guardar el nombre del paciente.
        System.out.print("Ingrese el nombre del paciente: ");
        p.nombre = sc.nextLine();

        // Solicitar y guardar la edad del paciente.
        System.out.print("Ingrese la edad del paciente: ");
        p.edad = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer después de leer un número.

        // Solicitar y guardar el número de expediente.
        System.out.print("Ingrese el número de expediente: ");
        p.expediente = sc.nextLine();

        // Muestra la información del paciente ingresada.
        System.out.println("\n--- Información del paciente ---");
        p.mostrarInformacion();

        sc.close(); // Cierra el Scanner para liberar recursos.
    }
}