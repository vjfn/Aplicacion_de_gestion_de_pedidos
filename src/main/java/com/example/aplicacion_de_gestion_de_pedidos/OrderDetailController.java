package com.example.aplicacion_de_gestion_de_pedidos;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

public class OrderDetailController implements Initializable
{
    @javafx.fxml.FXML
    private TableView orderDetailTable;
    @javafx.fxml.FXML
    private TableColumn orderLineID;
    @javafx.fxml.FXML
    private TableColumn orderPedidoId;
    @javafx.fxml.FXML
    private TableColumn orderLineQty;
    @javafx.fxml.FXML
    private TableColumn orderProductID;
    @javafx.fxml.FXML
    private Button btnReturn;

    @javafx.fxml.FXML
    public void returnAction(ActionEvent actionEvent) {
        MainApplication.loadDahsboard();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }
}