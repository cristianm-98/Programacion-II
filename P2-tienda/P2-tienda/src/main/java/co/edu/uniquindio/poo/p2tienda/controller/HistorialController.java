package co.edu.uniquindio.poo.p2tienda.controller;

import co.edu.uniquindio.poo.p2tienda.model.ExportadorArchivo;
import co.edu.uniquindio.poo.p2tienda.model.HistorialPedidos;
import co.edu.uniquindio.poo.p2tienda.model.Pedido;

import java.io.IOException;
import java.util.List;

public class HistorialController {

    private HistorialPedidos historial;

    public HistorialController() {
        historial = HistorialPedidos.getInstance();
    }

    public List<Pedido> obtenerPedidos() {
        return historial.obtenerPedidos();
    }

    public void registrarPedido(Pedido pedido) {
        historial.registrarPedido(pedido);
    }

    public void exportarPedido(Pedido pedido, String rutaArchivoTxt) throws IOException {
        ExportadorArchivo.exportarPedido(pedido, rutaArchivoTxt);
    }
}

