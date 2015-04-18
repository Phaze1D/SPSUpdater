package com.phaze1d.spsupdater.controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.net.URL;

/**
 * IntelliJ IDEA.
 * User: davidvillarreal
 * Date: 4/17/15
 * Time: 5:32 PM
 */
abstract class Controller {

    private Pane view;

    Controller(String viewUrl) throws IOException {
        view = new Pane();
        FXMLLoader loader = new FXMLLoader(getClass().getResource(viewUrl));
        loader.setRoot(view);
        loader.setController(this);
        loader.load();
    }


    public Pane getView(){
        return view;
    }



}
