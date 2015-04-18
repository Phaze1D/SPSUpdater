package com.phaze1d.spsupdater;

import com.phaze1d.spsupdater.controllers.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * IntelliJ IDEA.
 * User: davidvillarreal
 * Date: 4/13/15
 * Time: 1:19 PM
 */
public class Main extends Application {

    private MainController mainController;

    @Override
    public void start(Stage stage) throws Exception {

        stage.setScene(createAppsScene());
        stage.show();

    }


    public static void main(String[] args){
        launch(args);
    }

    /**
     * Creates the scene that contains all the users applications (Downloaded or not)
     * @return A new apps scene containing all the user applications
     * @throws IOException
     */
    private Scene createAppsScene()throws IOException{

        mainController = new MainController();
        Parent root = mainController.getView();
        Scene scene = new Scene(root);
        scene.setFill(Color.TRANSPARENT);
        return scene;
    }

}
