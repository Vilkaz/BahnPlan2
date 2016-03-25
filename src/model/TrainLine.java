package model;

import javafx.scene.Node;
import javafx.scene.paint.Color;

import java.util.List;

/**
 * Created by Vilkazzz on 13/03/2016.
 */
public class TrainLine {
    private int id;
    private int number;
    private String name;
    private List<TrainStation> stations;
    private List<Conector> connectors;
    private Color color;

    public TrainLine(int number,Color color) {
        this.number = number;
        this.color = color;
    }

    //region getter and setter


    public Color getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<TrainStation> getStations() {
        return stations;
    }

    public List<Conector> getConnectors() {
        return connectors;
    }


    //endregion getter and setter

}
