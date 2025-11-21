public class ParpadeandoState implements SemaforoState{
    @Override
    public void mostrarAccion() {
        System.out.println("Parpadeando: Esta por cambiar");

    }

    @Override
    public SemaforoState siguiente() {
        return new RojoState();
    }
}
