package model;

import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

/**
 * Created by Vilkazzz on 27/03/2016.
 */
public class StationNode{
    private Text name;
    private double x;
    private double y;
    private StationIcon icon;

    public StationNode(String  name, double x, double y, Color color) {
        this.name = new Text(name);
        this.x = x;
        this.y = y;
        this.icon = new StationIcon(this.x, this.y, color);
    }
}
