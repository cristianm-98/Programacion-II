public class ConChocolate extends BebidaDecorator {

    public ConChocolate(Bebida bebida){
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " Con Chocolate";
    }

    @Override
    public double getCosto() {
        return super.getCosto() + 1500;
    }
}
