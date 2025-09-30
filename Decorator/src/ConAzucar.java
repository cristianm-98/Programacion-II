public class ConAzucar extends BebidaDecorator {

    public ConAzucar(Bebida bebida){
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " Con Azucar";
    }

    @Override
    public double getCosto() {
        return super.getCosto() + 800;
    }
}
