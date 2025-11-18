package co.edu.uniquindio.poo.p2tienda.controller;

import co.edu.uniquindio.poo.p2tienda.model.CarritoDeCompras;
import co.edu.uniquindio.poo.p2tienda.model.Pedido;

import java.util.ArrayList;
import java.util.List;

public class GestorPedidosController {
    private final List<Pedido> pedidos;

    public GestorPedidosController() {
        pedidos = new ArrayList<>();
    }

    public Pedido crearPedido(CarritoDeCompras carrito) {
        String id = "PED" + (pedidos.size() + 1);
        Pedido p = new Pedido(id, carrito);
        pedidos.add(p);
        return p;
    }

    public List<Pedido> getPedidos() { return pedidos; }
}
