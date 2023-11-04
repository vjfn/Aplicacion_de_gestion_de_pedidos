package com.example.aplicacion_de_gestion_de_pedidos;

import clase.Usuario;
import domain.DBConnection;
import domain.UsuarioDAOImp;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    private TextField userField;
    @FXML
    private PasswordField passField;
    @FXML
    private Button btnLogin;
    @FXML
    private TextField registerUserField;
    @FXML
    private PasswordField registerPasswordField;
    @FXML
    private Button btnRegister;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    public void login(ActionEvent actionEvent) {
        String userMail = userField.getText();
        String userPassword = passField.getText();

        UsuarioDAOImp usuarioLogin = new UsuarioDAOImp(DBConnection.getConnection());
        try{
            Usuario usuario = usuarioLogin.loadUser(userMail,userPassword);

            throw new RuntimeException("ÉXITO");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    public void register(ActionEvent actionEvent) {
        String userMail = registerUserField.getText();
        String userPassword = registerPasswordField.getText();

        UsuarioDAOImp usuarioRegister = new UsuarioDAOImp(DBConnection.getConnection());

        try{
            Usuario usuario = usuarioRegister.createUser(userMail,userPassword);

            throw new RuntimeException("ÉXITO CREADO");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}