module co.edu.uniquindio.poo.p2tienda {
    requires javafx.controls;
    requires javafx.fxml;


    // Permitir que FXMLLoader acceda a controladores
    opens co.edu.uniquindio.poo.p2tienda to javafx.fxml;
    opens co.edu.uniquindio.poo.p2tienda.viewController to javafx.fxml;

    // (CLAVE) Permitir que PropertyValueFactory (javafx.base) acceda a los getters del model
    opens co.edu.uniquindio.poo.p2tienda.model to javafx.base;

    // Exporta paquetes si necesitas usarlos desde fuera del módulo
    exports co.edu.uniquindio.poo.p2tienda;
    exports co.edu.uniquindio.poo.p2tienda.viewController;
    exports co.edu.uniquindio.poo.p2tienda.model;
}