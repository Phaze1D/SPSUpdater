package com.phaze1d.spsupdater.controllers.UserLoginControllers;

import com.phaze1d.spsupdater.controllers.Controller;

import java.io.IOException;

/**
 * IntelliJ IDEA.
 * User: davidvillarreal
 * Date: 4/19/15
 * Time: 12:31 PM
 */
public class LoginController extends Controller {

    public LoginController() throws IOException {
        super("/com/phaze1d/spsupdater/views/UserLoginViews/login_view.fxml");
    }
}
