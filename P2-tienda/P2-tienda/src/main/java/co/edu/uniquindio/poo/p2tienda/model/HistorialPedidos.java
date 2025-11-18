package co.edu.uniquindio.poo.p2tienda.model;

import java.util.ArrayList;
import java.util.List;

public class HistorialPedidos {
    private static HistorialPedidos instancia;
    private List<Pedido> pedidos;

    private HistorialPedidos() {
        pedidos = new ArrayList<>();
    }

    public static HistorialPedidos getInstance() {
        if (instancia == null) {
            instancia = new HistorialPedidos();
        }
        return instancia;
    }

    public void registrarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public List<Pedido> obtenerPedidos() {
        return pedidos;
    }
}

