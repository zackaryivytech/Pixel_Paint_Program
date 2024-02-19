package com.example.pixelpaintprogram;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        //Canvas for pixels
        Canvas canvas = new Canvas(20, 20);

        //Init scene
        Scene scene = new Scene(canvas.getPane(), 1000, 1000);

        //Config State
        stage.setTitle("Pixel Paint Program");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}