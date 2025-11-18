public class ConLeche extends BebidaDecorator {

    public ConLeche(Bebida bebida){
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + " Con leche";
    }

    @Override
    public double getCosto() {
        return bebida.getCosto() + 800;
    }
}
