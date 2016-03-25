package tests

import model.TrainLine
import model.TrainPlan
import org.junit.Test

/**
 * Created by Vilkazzz on 20/03/2016.
 */
class TrainPlanTest {

    @Test
    public void testGetListOfFreeLines(){
        TrainPlan trainPlan = new TrainPlan();
        TrainLine trainLine = new TrainLine(1,"testLine");
        trainPlan.addTrainLine(trainLine);
        trainLine.set
        List<Integer> listOfLines = TrainPlan.getListOfFreeLines();

    }
}
