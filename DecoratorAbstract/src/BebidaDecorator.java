public class BebidaDecorator extends Bebida{

    private Bebida bebida;

    public BebidaDecorator(Bebida bebida){
        this.bebida=bebida;
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion();
    }

    @Override
    public double getCosto() {
        return bebida.getCosto();
    }
}
