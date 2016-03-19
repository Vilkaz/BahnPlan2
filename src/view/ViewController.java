package view;

import controller.AdminViewController;
import controller.ClientViewController;
import javafx.fxml.FXML;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.layout.HBox;

public class ViewController {

    @FXML
    RadioMenuItem clientViewRBtn, adminViewRBtn;

    @FXML
    HBox adminTools;



    @FXML
    private void activateClientView(){
        ClientViewController.activateClientView(adminTools);

    }
    @FXML
    private void activateAdminView(){
        AdminViewController.loadAdminView(adminTools);
    }

    @FXML
    private void addNewLine(){

    }


}
