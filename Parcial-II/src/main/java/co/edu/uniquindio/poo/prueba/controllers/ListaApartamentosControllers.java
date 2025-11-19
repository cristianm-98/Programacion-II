package co.edu.uniquindio.poo.prueba.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.prueba.app.App;
import co.edu.uniquindio.poo.prueba.builder.Inmueble;
import co.edu.uniquindio.poo.prueba.singleton.Empresa;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class ListaApartamentosControllers {

    private Empresa empresa;
    private MenuPrincipalControllers menuPrincipalControllers;
    private AnchorPane menuPrincipal;
    private Pane menuSecundario;
    private ObservableList<Inmueble> listaInmubles;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnEliminar;

    @FXML
    private Button btnRegresar;

    @FXML
    private TableColumn<Inmueble, String> colCiudad;

    @FXML
    private TableColumn<Inmueble, String> colHabitacion;

    @FXML
    private TableColumn<Inmueble, String> colId;

    @FXML
    private TableColumn<Inmueble, String> colPiso;

    @FXML
    private TableColumn<Inmueble, Double> colPrecio;

    @FXML
    private TableColumn<Inmueble, String> colTipo;

    @FXML
    private TableView<Inmueble> tbListaInmuebles;

    @FXML
    void onEliminar(ActionEvent event) {
        Inmueble inmuebleSeleccionado = tbListaInmuebles.getSelectionModel().getSelectedItem();

        if(inmuebleSeleccionado==null){
            mostrarAlerta("Error","Por favor seleccionar el inmueble a eliminar", Alert.AlertType.WARNING);
        }

        Alert confirmacion=new Alert(Alert.AlertType.INFORMATION);
        confirmacion.setTitle("Confirmar eliminacion");
        confirmacion.setHeaderText("¿Esta seguro de eliminar el inmueble");
        confirmacion.setContentText("Inmueble: " + inmuebleSeleccionado.getTipo());

        confirmacion.showAndWait().ifPresent(response->{
            if(response==ButtonType.OK){
                empresa.eliminarInmueble(inmuebleSeleccionado);
                cargarInmueble();
                mostrarAlerta("Exito","Inmueble eliminado correctamente", Alert.AlertType.INFORMATION);
            }
        });

    }

    @FXML
    void onRegresar(ActionEvent event) {
        volverMenuPrincipal();
    }

    @FXML
    void initialize() {
        empresa = Empresa.getInstance();

        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colTipo.setCellValueFactory(new PropertyValueFactory<>("tipo"));
        colCiudad.setCellValueFactory(new PropertyValueFactory<>("ciudad"));
        colHabitacion.setCellValueFactory(new PropertyValueFactory<>("numHabitacion"));
        colPiso.setCellValueFactory(new PropertyValueFactory<>("numPiso"));
        colPrecio.setCellValueFactory(new PropertyValueFactory<>("precio"));

        cargarInmueble();
        tbListaInmuebles.refresh();
    }

    public void cargarInmueble() {
        listaInmubles = FXCollections.observableArrayList(empresa.getInmuebles());
        tbListaInmuebles.setItems(listaInmubles);
    }

    private void volverMenuPrincipal() {
        try {
            FXMLLoader loader = new FXMLLoader(App.class.getResource("/co/edu/uniquindio/poo/prueba/MenuPrincipal.fxml"));
            Parent menu = loader.load();

            menuSecundario.getChildren().clear();
            menuSecundario.getChildren().add(menu);

        } catch (IOException e) {
            mostrarAlerta("Error", "No se pudo volver al Menu Principal", Alert.AlertType.ERROR);
            e.printStackTrace();

        }
    }

    public void setMenuPrincipalControllers(MenuPrincipalControllers menuPrincipalControllers) {
        this.menuPrincipalControllers = menuPrincipalControllers;
        this.menuSecundario = menuPrincipalControllers.getMenuPrincipal();
    }

    private void mostrarAlerta(String titulo, String mensaje, Alert.AlertType tipo) {
        Alert alerta = new Alert(tipo);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }


}
