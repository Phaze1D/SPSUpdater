package com.phaze1d.spsupdater.controllers;

import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.net.URL;

/**
 * IntelliJ IDEA.
 * User: davidvillarreal
 * Date: 4/17/15
 * Time: 5:32 PM
 */
public abstract class Controller {

    private Pane view;
    private double xOffset = 0;
    private double yOffset = 0;

    public Controller(String viewUrl) throws IOException {
        view = new Pane();
        FXMLLoader loader = new FXMLLoader(getClass().getResource(viewUrl));
        loader.setRoot(view);
        loader.setController(this);
        loader.load();
    }


    public Pane getView(){
        return view;
    }

    public void dealloc(){
        view.getChildren().clear();
        view = null;
    }

    public void makeMovable(){
        view.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                xOffset = event.getSceneX();
                yOffset = event.getSceneY();

            }
        });
        view.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                view.getScene().getWindow().setX(event.getScreenX() - xOffset);
                view.getScene().getWindow().setY(event.getScreenY() - yOffset);

            }
        });

    }


}
