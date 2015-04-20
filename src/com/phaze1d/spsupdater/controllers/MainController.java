package com.phaze1d.spsupdater.controllers;

/**
 * IntelliJ IDEA.
 * User: davidvillarreal
 * Date: 4/13/15
 * Time: 1:23 PM
 */



import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

import java.io.IOException;


/**
 * Main Controller
 *      The root/main controller that adds the different views into the main view and controllers
 *      the communications between different controllers
 *
 * Model Object
 *      SharedAppsLists
 *
 * View
 *      main_view.fxml
 */
public class MainController extends Controller {

    private WindowBarController windowBarController;

    @FXML private AnchorPane secView;

    public MainController() throws IOException {
        super("/com/phaze1d/spsupdater/views/main_view.fxml");
        createSubViews();


    }

    private void createSubViews() throws IOException{

        windowBarController = new WindowBarController();
        windowBarController.getView().setLayoutX(400);
        windowBarController.getView().setLayoutY(4);
        secView.getChildren().add(windowBarController.getView());

    }




}
