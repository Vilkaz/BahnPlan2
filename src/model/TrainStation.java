package model;

import javafx.scene.Node;
import javafx.scene.paint.Color;

/**
 * Created by Vilkazzz on 13/03/2016.
 */
public class TrainStation implements HasNode {
    private int id;
    private TrainStation station1;
    private TrainStation station2;
    private Color color;
    private Node node;
    private Symbol sighn;
    public Node getNode(){
        return node;
    }
}
