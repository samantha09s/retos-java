public class Paciente {
    // Atributos que almacenan la información del paciente.
    String nombre;        // Nombre del paciente.
    int edad;             // Edad del paciente.
    String expediente;    // Número de expediente clínico.

    // Método para mostrar la información almacenada del paciente
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);         // Imprime el nombre.
        System.out.println("Edad: " + edad);             // Imprime la edad.
        System.out.println("Expediente: " + expediente); // Imprime el número de expediente.
    }
}