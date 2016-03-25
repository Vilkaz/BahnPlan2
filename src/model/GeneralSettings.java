package model;

/**
 * Created by Vilkazzz on 20/03/2016.
 */
public class GeneralSettings {
    final static int MAX_NUMBER_OF_LINES = 20;
    final static int LINES_STARTING_NUMBER = 0;

    final private static int MIN_ZONE = 1;
    final private static int MAX_ZONE = 2;

    //region getter and setter


    public static int getMinZone() {
        return MIN_ZONE;
    }

    public static int getMaxZone() {
        return MAX_ZONE;
    }

    public static int getLinesStartingNumber() {
        return LINES_STARTING_NUMBER;
    }

    public static int getMaxNumberOfLines() {
        return MAX_NUMBER_OF_LINES;
    }


    //endregion getter and setter
}
