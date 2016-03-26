package controller;

import model.TrainLine;
import model.TrainPlan;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vilkazzz on 19/03/2016.
 */
public class ContentController {

    private static TrainPlan trainPlan = new TrainPlan();
    private static TrainLine activeTrainline;

    public static ArrayList<Integer> getFreeTrainLineNumbers(){
        return ContentController.trainPlan.getFreeTrainLineNumbers();
    }




//region getter and setter

    public static List<TrainLine> getTrainLines(){
        return trainPlan.getTrainLines();
    }

    public static void addTrainLine(TrainLine trainLine){
        trainPlan.addTrainLine(trainLine);
        ContentController.activeTrainline = trainLine;

    }


    public static TrainPlan getTrainPlan() {
        return trainPlan;
    }
    //endregion getter and setter
}
