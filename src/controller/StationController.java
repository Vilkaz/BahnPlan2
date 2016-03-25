package controller;

import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import model.GeneralSettings;

/**
 * Created by Vilkazzz on 25/03/2016.
 */
public class StationController {

   private static int minZone = GeneralSettings.getMinZone();
   private static int maxZone = GeneralSettings.getMaxZone();

      public static Pane getStationCreator(){
        TextField name = new TextField();
        name.setPromptText("Stationname");
        Text zoneDescription = new Text("Zone");
        ChoiceBox zoneChoser = getZoneChoser();
        HBox zoneChoseHBox = new HBox(zoneDescription, zoneChoser);
        CheckBox endStation = new CheckBox("Endstation?");
        VBox stationCreator = new VBox(name, zoneChoseHBox, endStation);
        stationCreator.paddingProperty().setValue(new Insets(10,10,10,10));
        stationCreator.getStyleClass().add("station-creator");
        return stationCreator;
    }

    private static ChoiceBox getZoneChoser(){
        ChoiceBox zoneChoser = new ChoiceBox();
        for (int i = minZone; i<=maxZone; i++){
            zoneChoser.getItems().add(i);
        }
        zoneChoser.setValue(zoneChoser.getItems().get(0));
        return zoneChoser;
    }
}
