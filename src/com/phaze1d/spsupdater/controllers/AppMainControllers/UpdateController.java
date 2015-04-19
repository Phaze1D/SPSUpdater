package com.phaze1d.spsupdater.controllers.AppMainControllers;

/**
 * IntelliJ IDEA.
 * User: davidvillarreal
 * Date: 4/13/15
 * Time: 7:24 PM
 */


import com.phaze1d.spsupdater.controllers.Controller;

import java.io.IOException;

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
        super("/com/phaze1d/spsupdater/views/AppMainViews/update_view.fxml");
    }
}
