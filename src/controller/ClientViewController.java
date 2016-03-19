package controller;

import javafx.scene.layout.HBox;

/**
 * Created by Vilkazzz on 19/03/2016.
 */
public class ClientViewController {

    public static void activateClientView(HBox adminTools) {
        AdminViewController.disableAdminView(adminTools);
    }
}
