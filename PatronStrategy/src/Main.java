void main() {
    Tienda tienda = new Tienda();

    tienda.setMetodoPago(new PagoTarjeta());
    tienda.procesarCompra(25000);

    tienda.setMetodoPago(new PagoPayPal());
    tienda.procesarCompra(30000);
}