package com.cjava.escuelapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class EscuelaAplication extends Application {


    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(EscuelaAplication.class.getResource("cursoView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 620, 340);
        stage.setScene(scene);
        stage.setTitle("Escuela CJava 2024");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
