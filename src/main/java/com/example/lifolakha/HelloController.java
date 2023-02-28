package com.example.lifolakha;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {


    public void exit(ActionEvent actionEvent) {
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    Pane top, middle, bottom;

    public void bulgaria() {
        top.setStyle("-fx-background-color: white");
        middle.setStyle("-fx-background-color: green");
        bottom.setStyle("-fx-background-color: maroon");
    }

    public void botswana(ActionEvent event) {
        top.setStyle("-fx-background-color: cyan");
        middle.setStyle("-fx-background-color: black");
        bottom.setStyle("-fx-background-color: cyan");
    }

    public void austria(ActionEvent event) {
        top.setStyle("-fx-background-color: red");
        middle.setStyle("-fx-background-color: white");
        bottom.setStyle("-fx-background-color: red");
    }

    public void germany(ActionEvent event) {
        top.setStyle("-fx-background-color: black");
        middle.setStyle("-fx-background-color: red");
        bottom.setStyle("-fx-background-color: gold");
    }

    public void armenia(ActionEvent event) {
        top.setStyle("-fx-background-color: red");
        middle.setStyle("-fx-background-color: blue");
        bottom.setStyle("-fx-background-color: yellow");
    }

    public void clear(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Flags");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        top.setStyle("-fx-background-color: white");
        middle.setStyle("-fx-background-color: white");
        bottom.setStyle("-fx-background-color: white");
    }
}