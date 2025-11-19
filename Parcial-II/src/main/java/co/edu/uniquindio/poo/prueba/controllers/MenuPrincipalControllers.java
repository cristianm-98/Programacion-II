package co.edu.uniquindio.poo.prueba.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.prueba.app.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class MenuPrincipalControllers {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnFormulario;

    @FXML
    private Button btnListaProducto;

    @FXML
    private AnchorPane menuPrincipal;

    @FXML
    private Pane menuSecundario;
    @FXML
    void onFormulario(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(App.class.getResource("/co/edu/uniquindio/poo/prueba/FormularioInmueble.fxml"));
            Parent formulario = loader.load();

            // Obtener el controlador del formulario
            FormularioInmuebleControllers controller = loader.getController();
            controller.setMenuPrincipalControllers(this);


            // Reemplazar el contenido del contenedor principal
            menuSecundario.getChildren().clear();
            menuSecundario.getChildren().add(formulario);

        } catch (IOException e) {
            mostrarAlerta("Error", "No se pudo cargar el formulario", Alert.AlertType.ERROR);
            e.printStackTrace();
        }
    }
    private void mostrarAlerta(String titulo, String mensaje, Alert.AlertType tipo) {
        Alert alerta = new Alert(tipo);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }

    @FXML
    void onListaProducto(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(App.class.getResource("/co/edu/uniquindio/poo/prueba/ListaApartamentos.fxml"));
            Parent listaInmuebles = loader.load();

            // Obtener el controlador de la lista de Apartamentos
            ListaApartamentosControllers controllers = loader.getController();
            controllers.setMenuPrincipalControllers(this);


            // Reemplazar el contenido del contenedor principal
            menuSecundario.getChildren().clear();
            menuSecundario.getChildren().add(listaInmuebles);

        } catch (IOException e) {
            mostrarAlerta("Error", "No se pudo cargar el formulario", Alert.AlertType.ERROR);
            e.printStackTrace();
        }
    }

    @FXML
    void initialize() {
    }
    public AnchorPane getMenuPrincipal(){
        return menuPrincipal;
    }

}
