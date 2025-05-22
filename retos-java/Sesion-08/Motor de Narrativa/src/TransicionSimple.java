public class TransicionSimple implements TransicionHistoria {
    @Override
    public void realizarTransicion(String decision) {
        if ("A".equalsIgnoreCase(decision)) {
            System.out.println("➡️ Te adentras en el bosque oscuro...");
        } else {
            System.out.println("➡️ Regresas al pueblo buscando respuestas...");
        }
    }
}