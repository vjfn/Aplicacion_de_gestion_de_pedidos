module com.example.aplicacion_de_gestion_de_pedidos {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens images;


    opens com.example.aplicacion_de_gestion_de_pedidos to javafx.fxml;
    exports com.example.aplicacion_de_gestion_de_pedidos;
}