package com.phaze1d.spsupdater.controllers;

/**
 * IntelliJ IDEA.
 * User: davidvillarreal
 * Date: 4/15/15
 * Time: 12:47 PM
 */


import java.io.IOException;
import java.net.URL;

/**
 * Scroll Applications Controller
 *      The controller of the scroll_apps_view which shows the users applications in a 4x4 grid.
 *      If the users has more then 16 applications this controller will handle the scrolling.
 *      Scrolling will be page scrolling when the users clicks and drags the mouse.
 *      Contains a list of all the users applications and a list of all the pages.
 *
 *
 * Model
 *     SharedAppsLists
 *
 * View
 *      scroll_apps_view.fxml
 */
public class ScrollAppsController extends Controller{

    public ScrollAppsController() throws IOException {
        super("/com/phaze1d/spsupdater/views/scroll_apps_view.fxml");
    }
}
