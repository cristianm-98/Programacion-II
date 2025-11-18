package co.edu.uniquindio.poo.p2tienda.model;

public class PagoPayPal implements Pago{
    private String correo;

    public PagoPayPal(String correo) {
        this.correo = correo;
    }

    @Override
    public String procesarPago(double monto) {
        return "Pago realizado con PayPal (" + correo + ") por $" + String.format("%.2f", monto);
    }
}
