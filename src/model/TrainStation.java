package model;

import javafx.scene.Node;
import javafx.scene.paint.Color;

/**
 * Created by Vilkazzz on 13/03/2016.
 */
public class TrainStation implements HasNode {
    private int id;
    private Color color;
    private Node node;
    private Symbol sighn;
    private String name;
    private int zone;
    private boolean endzone;

    public TrainStation(String name, int zone, boolean endzone) {
        this.name = name;
        this.zone = zone;
        this.endzone = endzone;
    }

    public Node getNode(){
        return node;
    }

    //region getter and setter

    public int getId() {
        return id;
    }

    public Color getColor() {
        return color;
    }

    public Symbol getSighn() {
        return sighn;
    }

    public String getName() {
        return name;
    }

    public int getZone() {
        return zone;
    }

    public boolean isEndzone() {
        return endzone;
    }


    //endregion getter and setter


}
