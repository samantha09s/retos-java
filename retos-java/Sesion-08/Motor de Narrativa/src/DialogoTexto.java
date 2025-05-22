public class DialogoTexto implements GestorDialogo {
    @Override
    public void mostrarDialogo(Escena escena) {
        System.out.println("🎙️ Escena: " + escena.getDescripcion());
        System.out.println("Una figura misteriosa aparece y te ofrece dos caminos...");
    }
}