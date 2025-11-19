public class ChocolateDecorator extends BebidaDecorator{

    public ChocolateDecorator(Bebida bedida){
        super(bedida);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() +" Con Chocolate";
    }

    @Override
    public double getCosto() {
        return super.getCosto() + 500;
    }
}
