package view;

import controller.*;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import model.TrainPlan;
import model.TrainStation;

public class ViewController {


    @FXML
    Button addNewLineBtn;

    @FXML
    RadioMenuItem clientViewRBtn, adminViewRBtn;

    @FXML
    HBox adminTools;

    @FXML
    private static VBox mainVBox, leftSide;

    @FXML
    Pane centerPane;

    private static TrainPlan trainPlan;


    @FXML
    private void activateClientView() {
        ClientViewController.activateClientView(adminTools);

    }

    @FXML
    private void activateAdminView() {
        AdminViewController.loadAdminView(adminTools);
    }

    @FXML
    private void addNewLine() {
        Pane trainlineCreator = TrainLineController.getteTrainLineCreator(adminTools);
        /**
         * the "next" button has to manipulate viewControllers variables, which i cant make static, because
         * they would be null else...
         */
        addNextButtonToTrainlineCreator(trainlineCreator);
    }


    private void createStationOnMouseclick(){
        Pane stationCreator = StationController.getStationCreator();
        Node okButton = getOKButtonForStation(stationCreator);
        stationCreator.getChildren().add(okButton);
        adminTools.getChildren().add(stationCreator);
    }


    private void addNextButtonToTrainlineCreator(Pane trainlineCreator){
        Button button = new Button("weiter");
        button.setOnMouseReleased(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                adminTools.getChildren().remove(trainlineCreator);
                ContentController.addTrainLine(TrainLineController.getTrainlineByTrainlineCreator(trainlineCreator));
                createStationOnMouseclick();
            }
        });
        ((Pane)trainlineCreator).getChildren().add(button);
    }

    private Node getOKButtonForStation(Pane stationCreator) {
        Button button = new Button("weiter");
        button.setOnMouseReleased(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
               TrainStation station =  StationController.getStationByClick(stationCreator, event);
//               ContentController.addStationToActualTrainLine(station);
            }
        });

        return button;
    }

    //region getter and setter
    public  Pane getCenterPane() {
        return centerPane;
    }

    public static TrainPlan getTrainPlan() {
        return trainPlan;
    }




//region getter and setter


}
