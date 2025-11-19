package co.edu.uniquindio.poo.prueba.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.prueba.app.App;
import co.edu.uniquindio.poo.prueba.facade.InmuebleFacade;
import co.edu.uniquindio.poo.prueba.builder.Inmueble;
import co.edu.uniquindio.poo.prueba.singleton.Empresa;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class FormularioInmuebleControllers {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAgregar;

    @FXML
    private Button btnRegresar;

    @FXML
    private ComboBox<String> cbTipoInmueble;

    @FXML
    private TextField txtCiudad;

    @FXML
    private TextField txtHabitacion;

    @FXML
    private TextField txtPiso;

    @FXML
    private TextField txtPrecio;

    @FXML
    private TextField txtId;

    private Empresa empresa;
    private MenuPrincipalControllers menuPrincipalControllers;
    private AnchorPane menuPrincipal;
    private Pane menuSecundario;
    private InmuebleFacade facade = new InmuebleFacade();


    @FXML
    void onAgregar(ActionEvent event) {
        if (!validarCampos()) {
            return;
        }
        try {
            String id = txtId.getText().trim();
            String tipo = cbTipoInmueble.getValue();
            String ciudad = txtCiudad.getText().trim();
            String numHabitacion = txtHabitacion.getText().trim();
            String numPiso = txtPiso.getText().trim();
            double precio = Double.parseDouble(txtPrecio.getText());

            Inmueble inmueble = null;
            switch (tipo) {
                case "Casa":
                    inmueble = facade.crearCasa(id, tipo, ciudad, numHabitacion, numPiso, precio);
                    break;
                case "Apartamento":
                    inmueble=facade.crearApartamento(id,tipo,ciudad,numHabitacion,numPiso,precio);
                    break;
                case "Finca":
                    inmueble=facade.crearFinca(id,tipo,ciudad,numHabitacion,numPiso,precio);
                    break;
                case "Local":
                    inmueble=facade.crearLocal(id,tipo,ciudad,numHabitacion,numPiso,precio);
            }
            if(empresa.buscarPorCodigo(id)!=null){
                mostrarAlerta("Error","Ya existe un inmueble con ese codigo",Alert.AlertType.ERROR);
                return;
            }
            empresa.agregarInmueble(inmueble);
            mostrarAlerta("Exito","Inmueble creado correctamente",Alert.AlertType.INFORMATION);
            limpiarCampo();

        }catch (NumberFormatException e){
            mostrarAlerta("Error","el precio debe ser valor numerico valido",Alert.AlertType.ERROR);
        }
    }

    @FXML
    void onRegresar(ActionEvent event) {
        volverMenuPrincipal();

    }

    @FXML
    void initialize() {
        empresa = Empresa.getInstance();
        cbTipoInmueble.getItems().addAll("Apartamento", "Casa", "Finca", "Local");
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

    public boolean validarCampos(){
        if(txtId.getText().trim().isEmpty()){
            mostrarAlerta("Error","El id es obligatorio",Alert.AlertType.WARNING);
            return false;
        }
        if(txtCiudad.getText().trim().isEmpty()){
            mostrarAlerta("Error","La ciudad es obligatorio",Alert.AlertType.WARNING);
            return false;
        }
        if(txtHabitacion.getText().trim().isEmpty()){
            mostrarAlerta("Error","La habitacion es obligatorio",Alert.AlertType.WARNING);
            return false;
        }
        if(txtPiso.getText().trim().isEmpty()){
            mostrarAlerta("Error","El piso es obligatorio",Alert.AlertType.WARNING);
            return false;
        }
        if(txtPrecio.getText().trim().isEmpty()){
            mostrarAlerta("Error","El precio es obligatorio",Alert.AlertType.WARNING);
            return false;
        }
        return true;
    }
    public void limpiarCampo() {
        txtId.clear();
        txtCiudad.clear();
        txtHabitacion.clear();
        txtPiso.clear();
        txtPrecio.clear();
        cbTipoInmueble.setValue(null);

    }



}