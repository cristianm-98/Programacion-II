public class Celular {
    private CargadorUSBC cargador;
    public Celular(CargadorUSBC cargador){
        this.cargador=cargador;
    }

    public void cargar(){
        cargador.cargadorUSBC();
    }
}
