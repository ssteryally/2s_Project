package com.example.test2javafxproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader Loader = new FXMLLoader(HelloApplication.class.getResource("model.fxml"));
        //Scene scene = new Scene(fxmlLoader.load(), 180, 220);
        //stage.setTitle("Hello!");
        //stage.setScene(scene);
        //stage.show();

        Group group = new Group();

        Parent content = FXMLLoader.load(getClass().getResource("model.fxml"));
        BorderPane root = new BorderPane();
        root.setCenter(content);
        group.getChildren().add(root);

        stage.setScene(new Scene(group, 590, 410, Color.POWDERBLUE));
        stage.setTitle("Scan Project");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}