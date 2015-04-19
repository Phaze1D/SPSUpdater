package com.phaze1d.spsupdater.controllers.AppMainControllers;

/**
 * IntelliJ IDEA.
 * User: davidvillarreal
 * Date: 4/15/15
 * Time: 12:47 PM
 */


import com.phaze1d.spsupdater.controllers.Controller;
import javafx.fxml.FXML;
import javafx.scene.control.ScrollPane;

import java.io.IOException;

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
public class ScrollAppsController extends Controller {

    @FXML private ScrollPane secView;

    private GridPageController gridPageController1;

    public ScrollAppsController() throws IOException {
        super("/com/phaze1d/spsupdater/views/AppMainViews/scroll_apps_view.fxml");

        createSubViews();
    }

    private void createSubViews() throws IOException{


    }


}
