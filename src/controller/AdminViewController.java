package controller;

import javafx.scene.layout.HBox;

/**
 * Created by Vilkazzz on 19/03/2016.
 */
public class AdminViewController {
    public static void loadAdminView(HBox adminTools) {
        GeneralNodeController.activateNode(adminTools);
    }

    public static void disableAdminView(HBox adminTools) {
        GeneralNodeController.deactivateNode(adminTools);
    }



}
