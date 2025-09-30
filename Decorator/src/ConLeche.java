public class ConLeche extends BebidaDecorator {

    public ConLeche(Bebida bebida){
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " Con leche";
    }

    @Override
    public double getCosto() {
        return super.getCosto() + 800;
    }
}
