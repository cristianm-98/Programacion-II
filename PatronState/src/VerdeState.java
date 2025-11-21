public class VerdeState implements SemaforoState{
    @Override
    public void mostrarAccion() {
        System.out.println("Verde: puede avanzar");
    }

    @Override
    public SemaforoState siguiente() {
        return new ParpadeandoState();
    }
}
