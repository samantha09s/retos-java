public class MainNarrativa {
    public static void main(String[] args) {
        Escena escena = new Escena("Inicio del viaje");

        TransicionHistoria transicion = new TransicionSimple();
        GestorDialogo dialogo = new DialogoTexto();
        LogicaDecision decision = new DecisionBinaria();

        dialogo.mostrarDialogo(escena);
        String eleccion = decision.tomarDecision();
        transicion.realizarTransicion(eleccion);
    }
}