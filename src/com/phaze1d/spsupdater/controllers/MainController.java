package com.phaze1d.spsupdater.controllers;

/**
 * IntelliJ IDEA.
 * User: davidvillarreal
 * Date: 4/13/15
 * Time: 1:23 PM
 */

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

    public MainController() throws IOException {
        super("/com/phaze1d/spsupdater/views/main_view.fxml");

    }

}
