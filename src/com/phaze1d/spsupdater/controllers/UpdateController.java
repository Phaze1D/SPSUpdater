package com.phaze1d.spsupdater.controllers;

/**
 * IntelliJ IDEA.
 * User: davidvillarreal
 * Date: 4/13/15
 * Time: 7:24 PM
 */


import java.io.IOException;
import java.net.URL;

/**
 * Update Controller
 *      The controller that handles the update view, which contains an progress indicator and a label.
 *
 * Model Object
 *      SharedAppsLists
 *
 * View
 *      update_view.fxml
 */
public class UpdateController extends Controller {

    public UpdateController() throws IOException {
        super("/com/phaze1d/spsupdater/views/update_view.fxml");
    }
}
