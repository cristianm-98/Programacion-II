public class ConChocolate extends BebidaDecorator {

    public ConChocolate(Bebida bebida){
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + " Con Chocolate";
    }

    @Override
    public double getCosto() {
        return bebida.getCosto() + 1500;
    }
}
