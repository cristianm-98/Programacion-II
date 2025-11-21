public class Semaforo {

    private SemaforoState estadoActual;

    public Semaforo(){
        estadoActual=new RojoState();
    }
    public void mostrar(){
        estadoActual.mostrarAccion();
    }
    public void cambiarEstado(){
        estadoActual=estadoActual.siguiente();
    }
}
