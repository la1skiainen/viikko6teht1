package com.example.viikko6teht1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.animation.PathTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;




import java.io.IOException;

public class LiikuPalikka extends Application
        //implements EventHandler<ActionEvent> {
    public LiikuPalikka(){

    }
    public void handle (ActionEvent e) {
    //public void start(Stage scene) {
        Hbox panel =new HBox();
        Button button = new Button();
        button.setOnAction(e -> System.out.println("LIIKU!"));
        Rectangle palikka = new Rectangle();
        palikka.setRotationAxis(20);

        Scene stage =new Scene(panel);

        panel.setAligment(Pos.CENTER);
        LiikuPalikka palikka =new LiikuPalikka();
        button.setOnAction(palikka);

        panel.getChildren().add(new Node[]{button});
    }

       scene.setTitle("Liikettä suorakulmiolla");
        stage.setScene(scene);
        stage.show();


    public static void main(String[] args) {
        launch();
    }
}