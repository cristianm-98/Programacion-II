public class ConAzucar extends BebidaDecorator {

    public ConAzucar(Bebida bebida){
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + " Con Azucar";
    }

    @Override
    public double getCosto() {
        return bebida.getCosto() + 800;
    }
}
