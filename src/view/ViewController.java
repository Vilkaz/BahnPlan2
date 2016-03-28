package view;

import controller.*;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.TextField;
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
        addOKButtonToTrainlineCreator(trainlineCreator);
    }


    private void createStationOnMouseclick(MouseEvent event) {
        Pane stationCreator = StationController.getStationCreator();
        Button okButton = getOKButtonForStation(stationCreator, event);
        stationCreator.getChildren().add(okButton);
        adminTools.getChildren().add(stationCreator);
    }


    private void addOKButtonToTrainlineCreator(Pane trainlineCreator) {
        Button button = new Button("weiter");
        button.setOnMouseReleased(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                adminTools.getChildren().remove(trainlineCreator);
                ContentController.addTrainLine(TrainLineController.getTrainlineByTrainlineCreator(trainlineCreator));
                getXYCoordinatesforStation();
            }
        });
        ((Pane) trainlineCreator).getChildren().add(button);
    }


    private void getXYCoordinatesforStation() {
        centerPane.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                createStationOnMouseclick(event);
            }
        });
    }


    private Button getOKButtonForStation(Pane stationCreator, MouseEvent coordinatesEvent) {
        Button button = new Button("weiter");
        button.setOnMouseReleased(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                TrainStation station = StationController.getStationByClick(stationCreator, coordinatesEvent);
                ContentController.addStationToActualTrainLine(station);
                renderTrainPlan();
            }
        });

        return button;
    }

    public void renderTrainPlan(){
        centerPane.getChildren().clear();
        centerPane.getChildren().addAll(ContentController.getTrainPlan().getNodes());
        System.out.println("");
    }



    //region getter and setter
    public Pane getCenterPane() {
        return centerPane;
    }

    public static TrainPlan getTrainPlan() {
        return trainPlan;
    }


//region getter and setter


}
