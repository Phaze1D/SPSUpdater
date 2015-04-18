package com.phaze1d.spsupdater.controllers;

/**
 * IntelliJ IDEA.
 * User: davidvillarreal
 * Date: 4/15/15
 * Time: 12:48 PM
 */


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

    public GridPageController() throws IOException {
        super("/com/phaze1d/spsupdater/views/grid_page_view.fxml");
    }
}
