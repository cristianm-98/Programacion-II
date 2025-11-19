module co.edu.uniquindio.poo.prueba {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens co.edu.uniquindio.poo.prueba to javafx.fxml;
    exports co.edu.uniquindio.poo.prueba.app;
    opens co.edu.uniquindio.poo.prueba.controllers to javafx.fxml;
    opens co.edu.uniquindio.poo.prueba.app to javafx.fxml;
    opens co.edu.uniquindio.poo.prueba.builder to javafx.base;
}