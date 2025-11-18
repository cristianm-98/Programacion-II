public class Tienda {
    private MetodoPago metodoPago;

    public void setMetodoPago(MetodoPago metodoPago){
        this.metodoPago=metodoPago;
    }

    public void procesarCompra(double monto){
        metodoPago.pagar(monto);
    }
}
