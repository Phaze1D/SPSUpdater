package com.phaze1d.spsupdater.controllers;

/**
 * IntelliJ IDEA.
 * User: davidvillarreal
 * Date: 4/13/15
 * Time: 7:25 PM
 */


import com.phaze1d.spsupdater.models.AppModel;
import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.FXML;
import javafx.scene.effect.BoxBlur;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Single App Controller
 *      The controller that handles all the events of a single app view, which contains the app's icon, name, and
 *      if it is being download/updated a progress bar
 *
 * Model Object
 *      AppModel
 *
 * View
 *      app_cell_view.fxml
 */
public class AppCellController extends Controller{

    private AppModel appModel;

    public AppCellController(AppModel appModel) throws IOException {
        super("/com/phaze1d/spsupdater/views/app_cell_view.fxml");
        this.appModel = appModel;
        setUpInfo();
    }

    private void setUpInfo(){

    }
}
