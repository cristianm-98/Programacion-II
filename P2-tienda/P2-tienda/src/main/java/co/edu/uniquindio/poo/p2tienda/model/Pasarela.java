package co.edu.uniquindio.poo.p2tienda.model;

public class Pasarela implements Pago {
    private PasarelaAPI api;
    private String nombreServicio;

    public Pasarela(String nombreServicio) {
        this.api = new PasarelaAPI();
        this.nombreServicio = nombreServicio;
    }

    @Override
    public String procesarPago(double monto) {
        return api.realizarTransaccion(nombreServicio, monto);
    }

}
