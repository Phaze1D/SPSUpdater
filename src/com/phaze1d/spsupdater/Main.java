package com.phaze1d.spsupdater;

import com.phaze1d.spsupdater.controllers.AppCellController;
import com.phaze1d.spsupdater.controllers.WindowBarController;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

/**
 * IntelliJ IDEA.
 * User: davidvillarreal
 * Date: 4/13/15
 * Time: 1:19 PM
 */
public class Main extends Application {


    @Override
    public void start(Stage stage) throws Exception {

        stage.initStyle(StageStyle.TRANSPARENT);
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

        //MainController mainController = new MainController();
        //AppCellController controller = new AppCellController(null);
        WindowBarController controller = new WindowBarController();
        Parent root = controller.getView();
        Scene scene = new Scene(root);
        scene.setFill(Color.TRANSPARENT);
        return scene;
    }

}
