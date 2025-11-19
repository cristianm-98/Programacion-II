package co.edu.uniquindio.poo.prueba.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(App.class.getResource("/co/edu/uniquindio/poo/prueba/MenuPrincipal.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root, 320, 240);

        primaryStage.setTitle("Sistema de Gestión");
        primaryStage.setScene(scene);
        primaryStage.setMinWidth(785);
        primaryStage.setMinHeight(395);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}

