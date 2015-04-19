package com.phaze1d.spsupdater.controllers;

/**
 * IntelliJ IDEA.
 * User: davidvillarreal
 * Date: 4/15/15
 * Time: 12:48 PM
 */


import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;

import java.io.IOException;

/**
 * Grid Page Controller
 *      This controller controls the grid_page view.
 *      Handles the adding of applications views to the grid
 *      One page contains a maximum of 16 applications
 *
 * Model
 *      None
 *
 * View
 *      grid_page_view.fxml
 */
public class GridPageController extends Controller {


    @FXML private GridPane secView;

    public GridPageController() throws IOException {
        super("/com/phaze1d/spsupdater/views/grid_page_view.fxml");
        createSubViews();
    }

    private void createSubViews()throws IOException{
        AppCellController appCellController = new AppCellController(null);
        secView.add(appCellController.getView(),0,0);

    }

}
