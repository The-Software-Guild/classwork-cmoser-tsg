package org.sg.windowmaster;

// Data Transfer Object
public class RectangularWindow extends Window implements LineItemInterface {

    // Fields / Attributes
    private float areaOfWindow;
    private float cost;
    private float perimeterOfWindow;

    public RectangularWindow(float height, float width) {
        //this.height = height;
        setHeight(height);
        setWidth(width);
    }

//    public void setHeight(float height) {
//        if (height < 0) {
//            height = 0;
//        } else {
//            this.height = height;
//        }
//        calculateGeometry();
//    }
//
//    public void setWidth(float width) {
//        this.width = width;
//        calculateGeometry();
//    }
//
//    public float getHeight() {
//        return height;
//    }
//
//    public float getWidth() {
//        return width;
//    }

    @Override
    public void calculateGeometry() {
        areaOfWindow = getHeight() * getHeight();
        perimeterOfWindow = 2 * (getHeight() + getWidth());
        cost = ((3.50f * areaOfWindow) + (2.25f * perimeterOfWindow));
    }

    public float getCost() {
        return cost;
    }
}
