public class RojoState implements SemaforoState{
    @Override
    public void mostrarAccion() {
        System.out.println("Rojo: no puede cruzar");

    }

    @Override
    public SemaforoState siguiente() {
        return new VerdeState();
    }
}
