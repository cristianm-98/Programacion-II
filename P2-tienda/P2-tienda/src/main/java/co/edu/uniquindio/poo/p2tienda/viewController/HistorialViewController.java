package co.edu.uniquindio.poo.p2tienda.viewController;

import co.edu.uniquindio.poo.p2tienda.App;
import co.edu.uniquindio.poo.p2tienda.controller.HistorialController;
import co.edu.uniquindio.poo.p2tienda.model.Pedido;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.io.IOException;

public class HistorialViewController {

    @FXML private TableView<Pedido> tablaPedidos;
    @FXML private TableColumn<Pedido, String> columnaId;
    @FXML private TableColumn<Pedido, String> columnaEstado;
    @FXML private TableColumn<Pedido, Double> columnaTotal;

    @FXML private Button botonVolver;
    @FXML private Button botonExportar;

    private ObservableList<Pedido> datos;
    private HistorialController historialController;

    @FXML
    private void initialize() {
        historialController = new HistorialController();

        columnaId.setCellValueFactory(new Callback<CellDataFeatures<Pedido,String>, ObservableValue<String>>() {
            public ObservableValue<String> call(CellDataFeatures<Pedido, String> param) {
                return new SimpleStringProperty(param.getValue().getId());
            }
        });
        columnaEstado.setCellValueFactory(new Callback<CellDataFeatures<Pedido,String>, ObservableValue<String>>() {
            public ObservableValue<String> call(CellDataFeatures<Pedido, String> param) {
                return new SimpleStringProperty(param.getValue().getEstado());
            }
        });
        columnaTotal.setCellValueFactory(new Callback<CellDataFeatures<Pedido,Double>, ObservableValue<Double>>() {
            public ObservableValue<Double> call(CellDataFeatures<Pedido, Double> param) {
                return new SimpleDoubleProperty(param.getValue().calcularTotal()).asObject();
            }
        });

        datos = FXCollections.observableArrayList(historialController.obtenerPedidos());
        tablaPedidos.setItems(datos);
    }

    @FXML
    private void exportarPedido() {
        Pedido seleccionado = tablaPedidos.getSelectionModel().getSelectedItem();
        if (seleccionado == null) {
            mostrarAlerta("Selecciona un pedido", "Debes elegir un pedido para exportar.");
            return;
        }
        try {
            String ruta = "pedidos_exportados/" + seleccionado.getId() + ".txt";
            historialController.exportarPedido(seleccionado, ruta);
            mostrarInfo("Exportado", "Archivo generado en: " + ruta);
        } catch (IOException e) {
            mostrarAlerta("Error", "No se pudo exportar el pedido: " + e.getMessage());
        }
    }

    @FXML
    private void onVolver() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("mercadolibre.fxml"));
            AnchorPane root = loader.load();
            Stage stage = (Stage) botonVolver.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void mostrarAlerta(String titulo, String msg) {
        Alert a = new Alert(Alert.AlertType.WARNING);
        a.setTitle(titulo); a.setHeaderText(null); a.setContentText(msg);
        a.showAndWait();
    }

    private void mostrarInfo(String titulo, String msg) {
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setTitle(titulo); a.setHeaderText(null); a.setContentText(msg);
        a.showAndWait();
    }
}
