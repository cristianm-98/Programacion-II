public class AzucarDecorator extends BebidaDecorator{

    public AzucarDecorator(Bebida bedida){
        super(bedida);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " Con azucar";
    }

    @Override
    public double getCosto() {
        return super.getCosto() + 800;
    }
}
