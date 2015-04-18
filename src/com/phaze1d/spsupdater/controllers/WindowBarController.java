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
 * Window Bar Controller
 *      The controller that handles the window bar view which contains the close button and minimize
 *      button
 *
 * Model Object
 *
 *
 * View
 *      window_bar_view.fxml
 */
public class WindowBarController extends Controller{

    public WindowBarController() throws IOException {
        super("/com/phaze1d/spsupdater/views/window_bar_view.fxml");
    }
}
