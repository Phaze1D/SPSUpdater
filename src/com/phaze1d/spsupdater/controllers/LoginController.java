package com.phaze1d.spsupdater.controllers;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

/**
 * IntelliJ IDEA.
 * User: davidvillarreal
 * Date: 4/19/15
 * Time: 12:31 PM
 */
public class LoginController extends Controller {


    public LoginController() throws IOException {
        super("/com/phaze1d/spsupdater/views/login_view.fxml");

        createSubViews();
    }

    private void createSubViews()throws IOException{
        WindowBarController windowBarController = new WindowBarController();
        windowBarController.getView().setLayoutX(251);
        windowBarController.getView().setLayoutY(1);
        this.getView().getChildren().add(windowBarController.getView());

    }

    @FXML
    private void loginClicked(Event event){
        try {
            launchMainStage();
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    private void launchMainStage()throws IOException{
        Stage stage= new Stage();
        stage.initStyle(StageStyle.TRANSPARENT);
        MainController mainController = new MainController();
        mainController.makeMovable();
        Scene scene = new Scene(mainController.getView());
        scene.setFill(Color.TRANSPARENT);
        stage.setScene(scene);

        this.getView().getScene().getWindow().hide();

        stage.show();


    }
}
