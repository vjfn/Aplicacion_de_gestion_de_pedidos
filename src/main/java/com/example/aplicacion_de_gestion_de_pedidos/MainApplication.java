package com.example.aplicacion_de_gestion_de_pedidos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {

    private static Stage myStage;
    @Override
    public void start(Stage stage) throws IOException {
        myStage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 820, 640);
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
    }

    public static void loadDahsboard() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("dashboard.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 900, 800);
            myStage.setTitle("Dashboard");
            myStage.setScene(scene);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void loadOrderDetail() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("orderDetail.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 900, 800);
            myStage.setTitle("Order Detail");
            myStage.setScene(scene);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        launch();
    }


}