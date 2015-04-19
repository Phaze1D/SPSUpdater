package com.phaze1d.spsupdater.controllers;

/**
 * IntelliJ IDEA.
 * User: davidvillarreal
 * Date: 4/13/15
 * Time: 1:23 PM
 */



import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

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

    @FXML private AnchorPane secView;

    private UpdateController updateController;
    private WindowBarController windowBarController;
    private ScrollAppsController scrollAppsController;


    public MainController() throws IOException {
        super("/com/phaze1d/spsupdater/views/main_view.fxml");
        createSubViews();


    }

    private void createSubViews() throws IOException{
        updateController = new UpdateController();
        updateController.getView().setLayoutY(513);
        updateController.getView().setLayoutX(5);
        secView.getChildren().add(updateController.getView());


        windowBarController = new WindowBarController();
        windowBarController.getView().setLayoutX(400);
        windowBarController.getView().setLayoutY(4);
        secView.getChildren().add(windowBarController.getView());

        scrollAppsController = new ScrollAppsController();
        scrollAppsController.getView().setLayoutY(37);
        scrollAppsController.getView().setLayoutX(5);
        secView.getChildren().add(scrollAppsController.getView());

    }




}
