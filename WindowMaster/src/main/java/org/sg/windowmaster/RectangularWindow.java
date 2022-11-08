package org.sg.windowmaster;

// Data Transfer Object
public class RectangularWindow {

    // Properties
    private float height;
    private float width;

    public RectangularWindow(float height, float width) {
        //this.height = height;
        setHeight(height);
        this.width = width;
    }

    public void setHeight(float height) {
        if (height < 0) {
            height = 0;
        } else {
            this.height = height;
        }
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    public float getCost() {
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;

        areaOfWindow = height * width;
        perimeterOfWindow = 2 * (height + width);
        cost = ((3.50f * areaOfWindow) + (2.25f * perimeterOfWindow));

        return cost;
    }
}
