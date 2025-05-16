public record Operador(String nombre) {
    public void reportarse() {
        // Reporte de presencia del operador
        System.out.println("👷 Operador " + nombre + " reportándose.");
    }
}