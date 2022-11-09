package org.sg.windowmaster.dto;

public class SquareWindow extends RectangularWindow {
    public SquareWindow(float height) {
        super(height, height);
        setHeight(height);
        setWidth(height);
    }

//    @Override
//    public float getCost() {
//
//        float areaOfWindow;
//        float cost;
//        float perimeterOfWindow;
//
//        areaOfWindow = getHeight() * getHeight() ;
//        perimeterOfWindow = 4 * getHeight();
//        cost = ((2.50f * areaOfWindow) + (1.25f * perimeterOfWindow));
//
//        return cost;
//    }
}
