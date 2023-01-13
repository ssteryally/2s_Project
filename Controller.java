package com.example.test2javafxproject;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField pathEnterField;

    @FXML
    private Button scanButton;

    @FXML
    private TextArea scanAnswerArea;

    @FXML
    private TextField getEnterField;

    @FXML
    private Button getButton;

    @FXML
    private TextArea getAnswerArea;

    @FXML
    private Button deleteScanHistory;

    @FXML
    private ListView<?> historyListView;


    @FXML //по идеи можно удалить
    void initialize() {
        //assert deleteScanHistory != null : "fx:id=\"deleteScanHistory\" was not injected: check your FXML file 'model.fxml'.";
        //assert getAnswerArea != null : "fx:id=\"getAnswerArea\" was not injected: check your FXML file 'model.fxml'.";
        //assert getButton != null : "fx:id=\"getButton\" was not injected: check your FXML file 'model.fxml'.";
        //assert getEnterField != null : "fx:id=\"getEnterField\" was not injected: check your FXML file 'model.fxml'.";
        //assert historyListView != null : "fx:id=\"historyListView\" was not injected: check your FXML file 'model.fxml'.";
        //assert pathEnterField != null : "fx:id=\"pathEnterField\" was not injected: check your FXML file 'model.fxml'.";
        //assert scanAnswerArea != null : "fx:id=\"scanAnswerArea\" was not injected: check your FXML file 'model.fxml'.";
        //assert scanButton != null : "fx:id=\"scanButton\" was not injected: check your FXML file 'model.fxml'.";

        pathEnterField.setOnAction(event -> { //выполняется при нажатии клавиши Enter

        });

        scanButton.setOnAction(event -> {

        });

        getEnterField.setOnAction(event -> { //выполняется при нажатии клавиши Enter

        });

        getButton.setOnAction(event -> {

        });

        deleteScanHistory.setOnAction(event -> {

        });

        //historyListView.
    }
}
