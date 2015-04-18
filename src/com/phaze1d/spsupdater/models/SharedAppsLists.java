package com.phaze1d.spsupdater.models;

/**
 * IntelliJ IDEA.
 * User: davidvillarreal
 * Date: 4/13/15
 * Time: 9:11 PM
 */

/**
 * Shared Apps Lists
 *      Contains a list of all the newest version of the user's applications (Downloaded or not)
 *      and a list of the currently downloaded applications
 */
public class SharedAppsLists {

    //Current
    //Newest

    private static SharedAppsLists ourInstance = new SharedAppsLists();

    public static SharedAppsLists getInstance() {
        return ourInstance;
    }

    private SharedAppsLists() {
    }
}
