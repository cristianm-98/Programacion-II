package co.edu.uniquindio.poo.p2tienda.model;

public class Pedido {
    private String id;
    private CarritoDeCompras carrito;
    private String estado;

    public Pedido(String id, CarritoDeCompras carrito) {
        this.id = id;
        this.carrito = carrito;
        this.estado = "Pendiente";
    }

    public String getId() { return id; }
    public CarritoDeCompras getCarrito() { return carrito; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public double calcularTotal() { return carrito.calcularTotal(); }
}
